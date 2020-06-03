package com.itheima.bos.web.service.Impl;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.bos.web.VO.DataVo;
import com.itheima.bos.web.VO.ProfitVo;
import com.itheima.bos.web.VO.VoOrderBack;
import com.itheima.bos.web.mapper.*;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.DianShangService;
import com.itheima.bos.web.utils.Common;
import com.itheima.bos.web.utils.DateUtils;
import com.itheima.bos.web.utils.GetUUID;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DianShangServiceImpl implements DianShangService {

    @Autowired
    DsStockMapper dsStockMapper;
    @Autowired
    DsExpressMapper dsExpressMapper;
    @Autowired
    DsModelinfoMapper dsModelinfoMapper;
    @Autowired
    DsMessageMapper dsMessageMapper;
    @Autowired
    DsTborderMapper dsTborderMapper;
    @Autowired
    MyMessageMapper myMessageMapper;
    @Autowired
    DsStoreMapper dsStoreMapper;
    @Autowired
    MyExpresserCostMapper myExpresserCostMapper;
    @Autowired
    MyDianShangMapper myDianShangMapper;
    @Autowired
    DsStraightcartMapper dsStraightcartMapper;
    @Autowired
    OrderbackMapper orderbackMapper;

    /**
     * 查询库存信息
     * @return
     */
    public List<DsStock> findAllDsStock() {
        DsStockExample example = new DsStockExample();
        List<DsStock> list = dsStockMapper.selectByExample(example);
        return list;
    }
    /**
     * 删除库存信息
     * @return
     */
    @Override
    public void deleteDsKucun(String[] split) {
        for (String string : split) {
            DsStock dsStock = dsStockMapper.selectByPrimaryKey(string);
            dsStockMapper.deleteByPrimaryKey(string);
            //添加至日志
            Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
            String username = staff.getUsername();
            DsMessage dsMessage=new DsMessage();
            dsMessage.setMessageid(GetUUID.getUUID());
            dsMessage.setUsername(username);
            dsMessage.setMessager(username+" 删除了库存：  型号为："+dsStock.getTypename()+"，类型为："+dsStock.getTypeno()+"，品牌为："+dsStock.getBrand()+"，数量为:"+dsStock.getNum());
            dsMessage.setType("删除");
            dsMessage.setMessagetime(new Date());
            dsMessageMapper.insert(dsMessage);
        }
    }
    /**
     * 添加库存信息
     * @return
     */
    @Override
    public int saveStock(DsStock dsStock, String typename, String typeno, String brand, int num) {
        //添加id
        dsStock.setId(GetUUID.getUUID());
        dsStock.setTypename(typename);
        dsStock.setTypeno(typeno);
        dsStock.setBrand(brand);
        dsStock.setNum(num);
        int rows=dsStockMapper.insert(dsStock);

        //添加至日志
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        String username = staff.getUsername();
        DsMessage dsMessage=new DsMessage();
        dsMessage.setMessageid(GetUUID.getUUID());
        dsMessage.setUsername(username);
        dsMessage.setMessager(username+" 添加了库存：  型号为："+typename+"，类型为："+typeno+"，品牌为："+brand+"，数量为:"+num);
        dsMessage.setType("添加");
        dsMessage.setMessagetime(new Date());
        dsMessageMapper.insert(dsMessage);
        return rows;
    }


    /**
     * 查询快递信息
     * @return
     */
    @Override
    public List<DsExpress> findAllKuaidi() {
        DsExpressExample example=new DsExpressExample();
        List<DsExpress> list = dsExpressMapper.selectByExample(example);
        return list;
    }
    /**
     * 查询快递成本
     * @return
     */
    @Override
    public BigDecimal findKuaidiCost(String shengfen, String kuaidi) {
        BigDecimal expressCost = myExpresserCostMapper.findExpressCost(shengfen, kuaidi);
        return expressCost;
    }


    /**
     * 删除快递信息
     * @return
     */
    @Override
    public void deleteKuaidi(String[] split) {
        for (String string : split) {
            DsExpress dsExpress = dsExpressMapper.selectByPrimaryKey(string);
            dsExpressMapper.deleteByPrimaryKey(string);
            //添加至日志
            Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
            String username = staff.getUsername();
            DsMessage dsMessage=new DsMessage();
            dsMessage.setMessageid(GetUUID.getUUID());
            dsMessage.setUsername(username);
            dsMessage.setMessager(username+" 删除了快递信息：  省份为："+dsExpress.getProvince()+"，快递为："+dsExpress.getExpressname()+"，成本为："+dsExpress.getExpresscost());
            dsMessage.setType("删除");
            dsMessage.setMessagetime(new Date());
            dsMessageMapper.insert(dsMessage);
        }
    }
    /**
     * 添加快递信息
     * @return
     */
    @Override
    public int saveKuaidi(DsExpress dsExpress, String province, String expressname, BigDecimal expresscost) {
        //添加id
        dsExpress.setExpressid(GetUUID.getUUID());
        dsExpress.setProvince(province);
        dsExpress.setExpressname(expressname);
        dsExpress.setExpresscost(expresscost);
        int rows=dsExpressMapper.insert(dsExpress);
        return rows;
    }



    /**
     * 查询型号信息
     * @return
     */
    @Override
    public List<DsModelinfo> findXinghaoxinxi() {
        DsModelinfoExample example=new DsModelinfoExample();
        List<DsModelinfo> list = dsModelinfoMapper.selectByExample(example);
        return list;
    }
    /**
     * 添加型号信息
     * @return
     */
    @Override
    public int saveXinghaoxinxi(DsModelinfo dsModelinfo) {
        dsModelinfo.setModelinfoid(GetUUID.getUUID());
        int row = dsModelinfoMapper.insert(dsModelinfo);

        //添加至日志
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        String username = staff.getUsername();
        DsMessage dsMessage=new DsMessage();
        dsMessage.setMessageid(GetUUID.getUUID());
        dsMessage.setUsername(username);
        dsMessage.setMessager(username+" 添加了型号信息，类别为："+dsModelinfo.getTypename()+"，型号为："+ dsModelinfo.getTypeno()+"，品牌为："+ dsModelinfo.getBrand()+"，成本为："+ dsModelinfo.getProductcost());
        dsMessage.setType("添加");
        dsMessage.setMessagetime(new Date());
        dsMessageMapper.insert(dsMessage);
        return row;
    }
    /**
     * 查询型号成本
     * @return
     */
    @Override
    public BigDecimal findModelCost(String xinghao) {
        BigDecimal modelCost = myExpresserCostMapper.findModelCost(xinghao);
        return modelCost;
    }

    /**
     * 删除型号信息
     * @return
     */

    public void deleteXinghaoxinxi(String[] split) {
        for (String string : split) {
            DsModelinfo dsModelinfo = dsModelinfoMapper.selectByPrimaryKey(string);
            dsModelinfoMapper.deleteByPrimaryKey(string);
        }
    }






    /**
     * 查询日志信息
     * @return
     */
    @Override
    public PageBean findMessage(VoMessage voMessage, PageBean pageBean) {
        if(null != voMessage.getUsername()&&!"".equals(voMessage.getUsername().trim())){
            voMessage.setUsername(voMessage.getUsername().trim());
        }
        if(null != voMessage.getZt()&&"".equals(voMessage.getZt().trim()) ){
            voMessage.setZt(null);
        }
        List<DsMessage> list = myMessageMapper.findMessage(voMessage,pageBean);
        Integer count = myMessageMapper.messageCount(voMessage,pageBean);
        pageBean.setTotal(list.size());
        pageBean.setRows(list);
        pageBean.setTotal(count);
        return pageBean;
    }

//    @Override
//    public List<DsMessage> findMessage() {
//        DsMessageExample example=new DsMessageExample();
//        List<DsMessage> list = dsMessageMapper.selectByExample(example);
//        return list;
//    }

    /**
     * 显示淘宝订单
     */
    public List<DsTborder> findAllTBorder(String storeId, String crudateBegin, String crudateEnd) {

        List<DsTborder> list = myDianShangMapper.findAllTBorder(storeId,crudateBegin,crudateEnd);
        return list;

    }

    /**
     *根据店铺id，日期：查询直通车数
     */
    public DsStraightcart findStraightNum(String storeId, String crudateBegin, String crudateEnd) {
        try {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DsStraightcartExample example = new DsStraightcartExample();
            DsStraightcartExample.Criteria criteria = example.createCriteria();
            criteria.andStraightdateBetween(simpleDateFormat.parse(crudateBegin),simpleDateFormat.parse(crudateEnd));
            List<DsStraightcart> list = dsStraightcartMapper.selectByExample(example);
            if(list.size() >0 ){
                return list.get(0);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 修改直通车数
     * @param storeId
     * @param num
     */
    public int updateStraightNum(String storeId, String crudateBegin, String crudateEnd, double num) {

        //查询库中是否有改订单
            try {

                DsStraightcart index = myDianShangMapper.checkStraight( storeId,  crudateBegin,  crudateEnd);
                if(index == null) {
                    DsStraightcart straightcart = new DsStraightcart();
                    straightcart.setStoreid(storeId);
                    straightcart.setNum(num);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    straightcart.setStraightdate(simpleDateFormat.parse(crudateBegin));
                    dsStraightcartMapper.insert(straightcart);
                }
                int row = 0;
                row = myDianShangMapper.updateStraightNum(storeId,crudateBegin,crudateEnd,num);
                if(row > 0){
                    //添加至日志
                    Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
                    String username = staff.getUsername();
                    DsMessage dsMessage=new DsMessage();
                    dsMessage.setMessageid(GetUUID.getUUID());
                    dsMessage.setUsername(username);
                    dsMessage.setMessager(username+"  修改了直通车数： "+num);
                    dsMessage.setType("修改");
                    dsMessage.setMessagetime(new Date());
                    dsMessageMapper.insert(dsMessage);
                }
                return row;
            }catch (Exception e) {
                e.printStackTrace();
                return 0;
            }

    }

    @Override
    public ProfitVo countShuaDanCost(String storeId, String crudateBegin, String crudateEnd) {
        List<DsTborder> list = myDianShangMapper.countShuaDanCost(storeId,crudateBegin,crudateEnd);
        ProfitVo profitVo = new ProfitVo();
        double zacost = 0;
        double cost = 0;
        for (DsTborder dsTborder : list) {
            cost += Double.parseDouble(dsTborder.getPaymoney().toString());
           zacost += Double.parseDouble(dsTborder.getZacost().toString());
        }
        DecimalFormat    df   = new DecimalFormat("######0.00");
        profitVo.setCost(Double.parseDouble(df.format(cost)));
        profitVo.setZacost(Double.parseDouble(df.format(zacost)));
        return profitVo;
    }

    @Override
    public List<DsTborder> findAllShuaDanTBorder(String storeId, String crudateBegin, String crudateEnd) {
        List<DsTborder> list = myDianShangMapper.findAllShuaDanTBorder(storeId,crudateBegin,crudateEnd);
        return list;
    }

    /**
     *根据店铺id，日期：查询直通车数
     */
    public int updateOrderInfo(DsModelinfo dsModelinfo) {
        int i = dsModelinfoMapper.updateByPrimaryKey(dsModelinfo);
        return i;
    }

    /**
     * 店铺管理-查看商店信息
     * @return
     */
    public List<DsStore> findAllStroe() {
        DsStoreExample example = new DsStoreExample();
        List<DsStore> list = dsStoreMapper.selectByExample(example);
        return list;
    }

    /**
     *店铺管理- 删除店铺
     */
    public void deleteStore(String[] split) {
        for (String string : split) {
            DsStore dsStore = dsStoreMapper.selectByPrimaryKey(string);
            int row = dsStoreMapper.deleteByPrimaryKey(string);
            if(row >0){
                DsMessage dsMessage = Common.publicMessage();
                dsMessage.setMessager(dsMessage.getUsername()+" 删除了店铺：  类别为："+dsStore.getStorename()+"，名称："+dsStore.getStoretype());
                dsMessage.setType("删除");
                dsMessage.setMessagetime(new Date());
                dsMessageMapper.insert(dsMessage);
            }

        }
    }
    /**
     * 店铺管理-更新店铺信息
     */
    public int updateStore(DsStore dsStore){
        int i = dsStoreMapper.updateByPrimaryKey(dsStore);
        if(i > 0){
            DsMessage dsMessage = Common.publicMessage();
            dsMessage.setMessager(dsMessage.getUsername()+" 更新了店铺：  类别为："+dsStore.getStorename()+"，名称："+dsStore.getStoretype());
            dsMessage.setType("编辑");
            dsMessage.setMessagetime(new Date());
            dsMessageMapper.insert(dsMessage);
        }
        return i;
    }
    /**
     * 店铺管理-添加店铺
     */
    public int addStore(DsStore dsStore){
        dsStore.setStoreid(GetUUID.getUUID());
        int i = dsStoreMapper.insert(dsStore);
        return i;
    }

    /**
     * 快递信息-更新快递信息
     * @param dsExpress
     * @return
     */
    public int updateKuaidiInfo(DsExpress dsExpress) {
        int i = dsExpressMapper.updateByPrimaryKey(dsExpress);
        return i;
    }

    @Override
    public int updateStockInfo(DsStock dsStock) {
        int i = dsStockMapper.updateByPrimaryKey(dsStock);
        return i;
    }

    /**
     * 导入淘宝订单
     */
    @Override
    public int saveTbOrder(DsTborder dsTborder) {
        int row = dsTborderMapper.insert(dsTborder);
        return row;
    }
    /**
     * 删除导入的淘宝订单
     */
    @Override
    public void deleteTaobaoOrder(String[] split) {
        for (String string : split) {
            dsTborderMapper.deleteByPrimaryKey(string);
        }
    }
    /**
     * 更新导入的淘宝订单
     */
    @Override
    public int updateInputTaobaoOrder(DsTborder dsTborder) {
        int i = dsTborderMapper.updateByPrimaryKey(dsTborder);
        return i;
    }

    /**
     * 利润-通过平台类型或的店铺名称
     */
    public List<DsStore> findStoreNameByTypeId(String id) {
        DsStoreExample example = new DsStoreExample();
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();

        DsStoreExample.Criteria criteria = example.createCriteria();
        if(!staff.getId().equals("admin")){
            String username = staff.getUsername().trim();
            criteria.andUsernameLike("%"+username+"%");
        }
        criteria.andStoretypeEqualTo(id);
        List<DsStore> list = dsStoreMapper.selectByExample(example);
        return list;
    }

    /**
     * 利润-查询利润
     */
    public DataVo findLiRunByQ(String storeid, String profittime, String storetype) {
        DataVo data = new DataVo();
        /*
         * 存储每一天的销售额，利润，销售数量
         */
        ArrayList<Object> saleMoneyList = new ArrayList<>();
        ArrayList<Object> profitList = new ArrayList<>();
        ArrayList<Object> shipmentNumList = new ArrayList<>();
        if(StringUtils.isEmpty(storeid)|| StringUtils.isEmpty(profittime)|| StringUtils.isEmpty(storetype)){
            int curYear = DateUtils.getCurrYear();
            int curMonth = DateUtils.getCurrMonth();
            int curDateNum = DateUtils.getDaysByYearMonth(curYear,curMonth);
            //查询淘宝所有的店铺，取第一个作为默认
            DsStoreExample example = new DsStoreExample();
            DsStoreExample.Criteria criteria = example.createCriteria();
            criteria.andStoretypeEqualTo("0");
            List<DsStore> storeList = dsStoreMapper.selectByExample(example);
            data.setStoreList(storeList);
            for (int i = 1;i<= curDateNum ;i++){
                //查詢第一天的利润。
                profittime = curYear+"-"+curMonth+"-"+i+" 00:00:00";
                String endtime = curYear+"-"+curMonth+"-"+i+" 23:59:59";


                if(storeList != null){
                    DsStore dsStore = storeList.get(0);
                    //获得一天的所有订单
                    List<ProfitVo> list = myDianShangMapper.findLiRunByQ(dsStore.getStoreid(),profittime,endtime);
                    //获得当天该店铺的直通车数
                    DsStraightcart dsStraightcart= myDianShangMapper.findStraightCartNumByStoreId(dsStore.getStoreid(),profittime,endtime);
                    double ztcNum = 0;
                    if(dsStraightcart != null){
                        ztcNum = dsStraightcart.getNum();
                    }
                    double profitDay = 0;
                    double saleMoneyDay = 0;
                    int shipmentNumDay = 0;
                    for (ProfitVo profitVo : list) {
                        //利润=买家实际支付金额-成本-快递费-安装费-修理费-杂费
                        profitDay += profitVo.getPaymoney()-profitVo.getCost()-profitVo.getExpresscost()-profitVo.getInstallcost()-profitVo.getFixcost()-profitVo.getZacost();
                        saleMoneyDay += profitVo.getPaymoney();
                        shipmentNumDay += profitVo.getBbnum();
                    }
                    saleMoneyList.add(saleMoneyDay);
                    profitList.add(profitDay-ztcNum);
                    shipmentNumList.add(shipmentNumDay);



                }

            }
            //默认显示淘宝的第一个店铺,当月的利润。



        }else{
            //按照日期，店铺id查询对应的
            int month = Integer.parseInt(profittime.split("-")[1]);
            int year = Integer.parseInt(profittime.split("-")[1]);
            int curDateNum = DateUtils.getDaysByYearMonth(year,month);
            String tmpProfittime = profittime;
            //判断平台类型，执行对应的SQL语句
            if(storetype.equals("0")){
                //淘宝
                for (int i = 1;i<= curDateNum ;i++) {
                    //查詢第一天的利润。
                    String endtime = profittime + "-" + i + " 23:59:59";
                    tmpProfittime = profittime + "-" + i + " 00:00:00";

                    //获得一天的所有订单
                    List<ProfitVo> list = myDianShangMapper.findLiRunByQ(storeid,tmpProfittime,endtime);
                    DsStraightcart dsStraightcart= myDianShangMapper.findStraightCartNumByStoreId(storeid,tmpProfittime,endtime);
                    double ztcNum = 0;
                    if(dsStraightcart != null){
                        ztcNum = dsStraightcart.getNum();
                    }
                    double profitDay = 0;
                    double saleMoneyDay = 0;
                    int shipmentNumDay = 0;
                    for (ProfitVo profitVo : list) {
                        //利润=买家实际支付金额-成本-快递费-安装费-修理费-杂费
                        profitDay += profitVo.getPaymoney()-profitVo.getCost()-profitVo.getExpresscost()-profitVo.getInstallcost()-profitVo.getFixcost()-profitVo.getZacost();
                        saleMoneyDay += profitVo.getPaymoney();
                        shipmentNumDay += profitVo.getBbnum();
                    }
                    saleMoneyList.add(saleMoneyDay);
                    profitList.add(profitDay-ztcNum);
                    shipmentNumList.add(shipmentNumDay);
                }

            }else{
                //拼多多
                for (int i = 1;i<= curDateNum ;i++) {
                    //查詢第一天的利润。
                    String endtime = profittime + "-" + i + " 23:59:59";
                    tmpProfittime = profittime + "-" + i + " 00:00:00";
                    //获得一天的所有订单
                    List<ProfitVo> list = myDianShangMapper.findLiRunByQAndPDD(storeid,tmpProfittime,endtime);
                    DsStraightcart dsStraightcart= myDianShangMapper.findStraightCartNumByStoreId(storeid,tmpProfittime,endtime);
                    double ztcNum = 0;
                    if(dsStraightcart != null){
                        ztcNum = dsStraightcart.getNum();
                    }
                    double profitDay = 0;
                    double saleMoneyDay = 0;
                    int shipmentNumDay = 0;
                    for (ProfitVo profitVo : list) {
                        //利润=买家实际支付金额-成本-快递费-安装费-修理费-杂费
                        profitDay += profitVo.getStoreincome()-profitVo.getCost()-profitVo.getExpresscost()-profitVo.getInstallcost()-profitVo.getFixcost()-profitVo.getZacost();
                        saleMoneyDay += profitVo.getStoreincome();
                        shipmentNumDay += profitVo.getProductnum();
                    }
                    saleMoneyList.add(saleMoneyDay);
                    profitList.add(profitDay-ztcNum);
                    shipmentNumList.add(shipmentNumDay);
                }

            }
        }

        data.setSaleMoneyList(saleMoneyList);
        data.setProfitList(profitList);
        data.setShipmentNumList(shipmentNumList);
        return data;
    }

    /**
     * 通过id获得淘宝订单，如果有，返回1，
     * @param orderId
     * @return
     */
    public int findTborderById(String orderId) {
        DsTborderExample example = new DsTborderExample();
        DsTborderExample.Criteria criteria = example.createCriteria();
        criteria.andOrderidEqualTo(orderId);
        List<DsTborder> dsTborderList = dsTborderMapper.selectByExample(example);
        if(dsTborderList.size()>0){
            return 1;
        }
        return 0;
    }
    @Override
    public PageBean findOrderBackInfo(String crudate, String lastMonth, VoOrderBack voOrderBack, PageBean pageBean) {
        if (null == voOrderBack.getBeginTime() || "".equals(voOrderBack.getBeginTime().trim()) || null == voOrderBack.getEndTime() || "".equals(voOrderBack.getEndTime().trim())) {
            voOrderBack.setBeginTime(lastMonth);
            voOrderBack.setEndTime(crudate);
        }
        PageHelper.startPage(pageBean.getCruPage(),Integer.parseInt(pageBean.getRows().get(0).toString()));
        List<Orderback> rows = this.myDianShangMapper.findOrderBackInfo(voOrderBack);
        PageInfo page = new PageInfo(rows);

        pageBean.setRows(page.getList());
        pageBean.setTotal(Integer.parseInt(page.getTotal()+""));
        return pageBean;
    }

    @Override
    public int addOrderBack(Orderback orderback) {
        Staff staff = (Staff)SecurityUtils.getSubject().getPrincipal();
        orderback.setRegistname(staff.getUsername());
        orderback.setRegisttime(new Date());
        int row = this.orderbackMapper.insert(orderback);
        return row;
    }
    @Override
    public int updateOrderBackSignOrReject(Orderback orderback) {
        orderback.setSigntime(new Date());
        int row = this.orderbackMapper.updateByPrimaryKeySelective(orderback);
        return row;
    }

    @Override
    public int updateOrderRefund(Orderback orderback) {
        int row = this.orderbackMapper.updateByPrimaryKeySelective(orderback);
        return row;
    }

}
