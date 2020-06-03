package com.itheima.bos.web.controller;

import com.alibaba.druid.sql.ast.statement.SQLAlterTableDropForeignKey;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.DataTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class DataTypeController {
    @Autowired
    DataTypeService dataTypeService;

    /**
     * 显示类别页面
     */
    @RequestMapping("/dataType_showTypename.action")
    public String showTypename(){
        return "cangg/showtypename";
    }
    /**
     * 显示型号页面
     */
    @RequestMapping("/dataType_showTypeno.action")
    public String showTypeno(){
        return "cangg/showtypeno";
    }
    /**
     * 显示品牌页面
     */
    @RequestMapping("/dataType_showBrand.action")
    public String showBrand(){
        return "cangg/showbrand";
    }
    /**
     * 显示仓库地址页面
     */
    @RequestMapping("/dataType_showStockAddress.action")
    public String showStockAddress(){
        return "cangg/stockaddress";
    }
    /**
     * 查询所有仓库信息
     */
    @RequestMapping("/dataType_findStockAddress.action")
    @ResponseBody
    public List<Stockaddress> findStockAddress(){
        List<Stockaddress> list = dataTypeService.findStockAddress();
        return list;
    }
    /**
     * 删除货物存放地址
     */
    @RequestMapping("/dataType_deleteStockAddress.action")
    public String deleteStockAddress(String ids){
        String[] split = ids.split(",");
        int row = dataTypeService.deleteStockAddress(split);
        return "cangg/stockaddress";
    }
    /**
     * 添加货物存放地址
     */
    @RequestMapping("/dataType_saveStockAddress.action")
    @ResponseBody
    public Integer saveStockAddress(String stockAddress){
        Stockaddress stockaddress = new Stockaddress();
        stockaddress.setSaId(stockAddress);
        stockaddress.setAddress(stockAddress);
        int row = dataTypeService.saveStockAddress(stockaddress);
        return row;
    }


    /**
     * 添加商品类别
     */
    @RequestMapping("/dateType_saveTypename.action")
    @ResponseBody
    public Integer saveTypename(String typename){
        //id为时间戳
        Producttype producttype = new Producttype();
        producttype.setId(System.currentTimeMillis()+"");
        producttype.setTypename(typename);
        int row = dataTypeService.saveTypename(producttype);
        return row;
    }
    /**
     * 按照商品类型进行添加一个品牌
     */
    @RequestMapping("/dataType_saveBrand.action")
    @ResponseBody
    public Integer saveBrand(String brandname,String id){
        //id为时间戳
        Brand brand = new Brand();
        brand.setBrandid(System.currentTimeMillis()+"");
        brand.setBrandname(brandname);
        brand.setTypeid(id);
        int row = dataTypeService.saveBrand(brand);
        return row;
    }
    /**
     * 按照商品类型进行添加一个型号
     */
    @RequestMapping("/dataType_saveTypeno.action")
    @ResponseBody
    public Integer saveTypenoname(String typenoname,String id){
        //id为时间戳
        Typeno typeno = new Typeno();
        typeno.setTypenoid(System.currentTimeMillis()+"");
        typeno.setTypenoname(typenoname);
        typeno.setProducttypeid(id);
        int row = dataTypeService.saveTypenoname(typeno);
        return row;
    }

    /**
     * 选中类型，显示型号添加页面，页面传过来id，同时返回id给页面
     */
    @RequestMapping("/dataType_showTypenoAdd.action")
    public String showTypenonameAdd(String id,Model model){
        model.addAttribute("typenameid",id);
        return "cangg/showtypenoadd";
    }
    /**
     * 选中类型，显示品牌添加页面，页面传过来id，同时返回id给页面
     */
    @RequestMapping("/dataType_showBrandAdd.action")
    public String showBrandAdd(String id,Model model){
        model.addAttribute("typenameid",id);
        return "cangg/showbrandadd";
    }
    /**
     * 查询所有的类别数据
     */
    @RequestMapping("/dataTyep_findAllTypename.action")
    @ResponseBody
    public List<Producttype> findAllProductType(){
        List<Producttype> list = dataTypeService.findAllProductType();
        return list;
    }

    /**
     * 删除选中的类别数据，进行删除
     */
    @RequestMapping("/dateType_deleteTypename.action")
    public void deleteProductType(String ids, HttpServletResponse response) throws Exception{
        String[] split = ids.split(",");
        int row = dataTypeService.deleteProductType(split);
        response.getWriter().print(row);
//        return "cangg/showtypename";
    }
    /**
     * 删除选中的型号
     */
    @RequestMapping("/dateType_deleteTypeno.action")
    public String  deleteTypenoname(String ids){
        String[] split = ids.split(",");
        int row = dataTypeService.deleteTypenoname(split);
        return "cangg/showtypeno";
    }

    /**
     * 删除选中的品牌
     */
    @RequestMapping("/dateType_deleteBrand.action")
    public String deleteTypeBrand(String ids){
        String[] split = ids.split(",");
        int row = dataTypeService.deleteTypeBrand(split);
        return "cangg/showbrand";
    }

    /**
     * 查看所有的型号数据，按照类别分类
     */
    @RequestMapping("/dataType_findAllTypeno.action")
    @ResponseBody
    public List<MyDataType> findAllTypeno(){
        List<MyDataType> list = dataTypeService.findAllTypeno();
        return list;
    }
    /**
     * 通过三个id获得相对应的名称，然后显示页面
     */
    @RequestMapping("/dataType_threeDataTypeName.action")
    @ResponseBody
    public MyDataType findThreeDataTypeNameById(String producttype,String typenoname,String brand){
        MyDataType myDataType = dataTypeService.findThreeDataTypeNameById(producttype,typenoname,brand);
        return myDataType;
    }
    /**
     * 通过类别id获得相对应的型号
     */
    @RequestMapping("/dataType_findAllTypenoByTypenameId.action")
    @ResponseBody
    public List<Typeno> findAllTypenoByTypenameId(String id){
        List<Typeno> list = dataTypeService.findAllTypenoByTypenameId(id);
        return list;
    }
    /**
     * 通过类别id获得相对应的品牌
     */
    @RequestMapping("/dataType_findAllBrandByTypenameId.action")
    @ResponseBody
    public List<Brand> findAllBrandByTypenameId(String id){
        List<Brand> list = dataTypeService.findAllBrandByTypenameId(id);
        return list;
    }
    /**
     * 通过类别id，和型号名称，判断是否已经存在该型号名称
     */
    @RequestMapping("/dataType_checkIsExistTypenonameByTypenameid.action")
    @ResponseBody
    public Integer checkIsExistTypenonameByTypenameid(String id ,String typenoname){
        int row = dataTypeService.checkIsExistTypenonameByTypenameid(id,typenoname);
        return row;
    }
    /**
     * 通过类别id，和品牌名称，判断是否已经存在该品牌名称
     */
    @RequestMapping("/dataType_checkIsExistBrandnameByTypenameid.action")
    @ResponseBody
    public Integer checkIsExistBrandnameByTypenameid(String id ,String brandname){
        int row = dataTypeService.checkIsExistBrandnameByTypenameid(id,brandname);
        return row;
    }
    /**
     * 查询所有品牌
     */
    @RequestMapping("/dataType_findAllBrand.action")
    @ResponseBody
    public List<MyDataType> findAllBrand(){
        List<MyDataType> list = dataTypeService.findAllBrand();
        return list;
    }
}
