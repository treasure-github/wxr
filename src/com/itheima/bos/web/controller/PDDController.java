package com.itheima.bos.web.controller;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.itheima.bos.web.VO.MessagerData;
import com.itheima.bos.web.VO.PDDVO;
import com.itheima.bos.web.VO.TaoBaoVO;
import com.itheima.bos.web.mapper.MyDianShangMapper;
import com.itheima.bos.web.pojo.DsPddorder;
import com.itheima.bos.web.pojo.DsTborder;
import com.itheima.bos.web.service.DianShangService;
import com.itheima.bos.web.service.PDDService;
import com.itheima.bos.web.utils.ExcelListener;
import com.itheima.bos.web.utils.GetUUID;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
@Controller
public class PDDController {
    @Autowired
    PDDService pddService;
    @Autowired
    DianShangService dianShangService;

    @RequestMapping("/dianShang_findAllPddorder.action")
    @ResponseBody
    public List<DsPddorder> findAllPddorde(String storeId, String beginTime,String endTime){
        if(storeId == null || beginTime == null || endTime == null){
            return null;
        }
         beginTime = beginTime+" 00:00:00";
         endTime = endTime+" 23:59:59";
        List<DsPddorder> list = pddService.findAllPddorde(storeId,beginTime,endTime);
        return list;

    }

    @RequestMapping("/dianShang_inputPddOrder.action")
    @ResponseBody
    public MessagerData inputPddOrder(@RequestParam(value="file",required=false) MultipartFile myFile, String storeId){
        int row = 0;
        int count = 0;
        int errorcount = 0;
        int reorder = 0;
        String context = "";
        MessagerData data = new MessagerData();

            InputStream input = null;
            List<Object> lists = null;
            if (myFile.isEmpty()) {
                data.setStatus(401);
                data.setMessage("请选择上传文件！！！");
                return data;
            } else {
                // 如果错误为0
                String fileName = myFile.getOriginalFilename();
                int index = fileName.lastIndexOf(".");
                String substring = fileName.substring(index + 1);
                try {
                    input = myFile.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // 解析每行结果在listener中处理
                ExcelListener listener = new ExcelListener();
                Object excelType = null;
                ExcelReader excelReader = null;
                if ("xlsx".equals(substring)) {
                    excelReader = new ExcelReader(input, ExcelTypeEnum.XLSX, listener);
                } else {
                    data.setMessage("请上传xlsx格式的excel");
                    data.setStatus(400);
                    return data;
                }
                excelReader.read(new Sheet(1, 1, PDDVO.class));
                lists = listener.getDatas();
                // 循环将excel中的数据存入库
                for (Object list : lists) {
                    PDDVO pddvo = (PDDVO) list;
                    if (StringUtils.isEmpty(pddvo.getOrderid())) {
                        continue;
                    }

                    String ordersid = pddvo.getOrderid();
                    int tborderById = pddService.findPddorderById(ordersid);
                    if(tborderById == 1){
                        reorder++;
                        context += "<br/>"+ordersid;
                        continue;
                    }

                    DsPddorder dsPddorder = new DsPddorder();
                    dsPddorder.setPddorderid(GetUUID.getUUID());
                    dsPddorder.setTotalorderid(storeId);
                    dsPddorder.setOrderid(pddvo.getOrderid());
                    dsPddorder.setProductsumprice(Double.parseDouble(pddvo.getProductsumprice()));
                    dsPddorder.setStorediscount(Double.parseDouble(pddvo.getStorediscount()));
                    dsPddorder.setPlatformdiscount(Double.parseDouble(pddvo.getPlatformdiscount()));
                    dsPddorder.setStoreincome(Double.parseDouble(pddvo.getStoreincome()));
                    dsPddorder.setProductnum(Integer.parseInt(pddvo.getProductnum()));
                    dsPddorder.setReceivername(pddvo.getReceivername());
                    dsPddorder.setPhone(pddvo.getPhone());
                    dsPddorder.setProvince(pddvo.getProvince());
                    dsPddorder.setSureordertime(pddvo.getSureordertime());
                    //商品规格
                    dsPddorder.setCustmoerphone(pddvo.getCustmoerphone());
                    dsPddorder.setExpressname(pddvo.getExpressname());
                    dsPddorder.setZacost(Double.parseDouble(pddvo.getZacost().trim()));
                    dsPddorder.setInstallcost(0.0);
                    dsPddorder.setFixcost(0.0);



                    //根据商品型号查询成本
                    if (StringUtils.isNotEmpty(dsPddorder.getCustmoerphone())){
                        BigDecimal modelCost = dianShangService.findModelCost(dsPddorder.getCustmoerphone());
                        Double modelCostDouble = Double.parseDouble(modelCost.toString());
                        dsPddorder.setCost(modelCostDouble*dsPddorder.getProductnum());
                    }else {
                        dsPddorder.setCost(0.0);
                    }
                    String shengfen = dsPddorder.getProvince();


                    if (StringUtils.isEmpty(dsPddorder.getExpressname()) || "空包".equals(dsPddorder.getExpressname())){
                        dsPddorder.setExpressname("空包");
                        dsPddorder.setExpresscost(0.0);
                    }else{
                        BigDecimal kuaidiCost = dianShangService.findKuaidiCost(shengfen,dsPddorder.getExpressname());
                        if (null == kuaidiCost){
                            dsPddorder.setExpresscost(0.0);
                        }else {
                            dsPddorder.setExpresscost(Double.parseDouble(kuaidiCost.toString()));
                        }
                    }
                    row = pddService.savePddOrder(dsPddorder);
                    if(row == 1){
                        count++;
                    }else {
                        errorcount++;
                    }

                }
                data.setStatus(200);
                data.setMessage("成功导入：" + count + "条<br/>导入失败：" + errorcount + "条<br/>存在重复订单：" + reorder + "条  <br/> 重复订单为：" + context);
                return data;
            }
    }

    @RequestMapping("/dianShang_deletePddOrder.action")
    public String deletePddOrder(String ids){
        if(null != ids){
            String[] split = ids.split(",");
            pddService.deletePddOrder(split);
        }
        return "dianshang/pdd_input";
    }
    /**
     *
     * @param row
     * @return
     */
    @RequestMapping(value = "/dianShang_updateInputPddOrder.action")
    @ResponseBody
    public int updateInputPddOrder(String row){
        DsPddorder dsPddorder = JSON.parseObject(row,DsPddorder.class);
        int rowres = pddService.updateInputPddOrder(dsPddorder);
        return rowres;
    }
    /**
     *查询所有刷单信息
     */
    @RequestMapping("/dianShang_findAllShuaDanPddorder.action")
    @ResponseBody
    public List<DsPddorder> findAllShuaDanPddorder(String storeId, String beginTime,String endTime){
        if(storeId == null || beginTime == null || endTime == null){
            return null;
        }
        beginTime = beginTime+" 00:00:00";
        endTime = endTime+" 23:59:59";
        List<DsPddorder> list = pddService.findAllShuaDanPddorder(storeId,beginTime,endTime);
        return list;
    }
    @RequestMapping("/dianShang_deleteShuadanPddOrder.action")
    public String deleteShuadanPddOrder(String ids){
        if(null != ids){
            String[] split = ids.split(",");
            pddService.deletePddOrder(split);
        }
        return "dianshang/pdd_sd";
    }

}
