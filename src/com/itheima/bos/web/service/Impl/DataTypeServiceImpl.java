package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.mapper.*;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.DataTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
@Transactional
public class DataTypeServiceImpl implements DataTypeService {
    @Autowired
    TypenoMapper typenoMapper;
    @Autowired
    BrandMapper brandMapper;
    @Autowired
    ProducttypeMapper producttypeMapper;
    @Autowired
    MyDataTypeMapper myDataTypeMapper;
    @Autowired
    StockaddressMapper stockaddressMapper;

    /**
     * 选中类型，显示型号添加页面，页面传过来id，同时返回id给页面
     */
    public int saveTypenoname(Typeno typeno) {
        int row = typenoMapper.insert(typeno);
        return row;
    }

    /**
     * 按照商品类型进行添加一个品牌
     */
    public int saveBrand(Brand brand) {
        int row = brandMapper.insert(brand);
        return row;
    }

    /**
     * 选中类型，显示型号添加页面，页面传过来id，同时返回id给页面
     */
    public int saveTypename(Producttype producttype) {
        int row = producttypeMapper.insert(producttype);
        return row;
    }

    /**
     * 查询所有的类别数据
     */
    public List<Producttype> findAllProductType() {
        ProducttypeExample example = new ProducttypeExample();
        List<Producttype> list = producttypeMapper.selectByExample(example);
        return list;
    }

    /**
     * 删除选中的类别数据，进行删除
     */
    public int deleteProductType(String[] split) {
        //获得该类别下的所有品牌和型号进行删除
        int row = 1 ;
        for (String s : split) {
            //删除该类别下的品牌
            BrandExample example = new BrandExample();
            BrandExample.Criteria criteria = example.createCriteria();
            criteria.andTypeidEqualTo(s);
            row = brandMapper.deleteByExample(example);
            //删除型号
            TypenoExample example1 = new TypenoExample();
            TypenoExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andProducttypeidEqualTo(s);
            row = typenoMapper.deleteByExample(example1);
            //最终删除商品类别
            row = producttypeMapper.deleteByPrimaryKey(s);
        }
        return row;
    }

    /**
     * 删除选中的型号
     */
    public int deleteTypenoname(String[] split) {
        int row = 1;
        for (String s : split) {
            row = typenoMapper.deleteByPrimaryKey(s);
        }
        return row;
    }

    /**
     * 删除选中的品牌
     */
    public int deleteTypeBrand(String[] split) {
        int row = 1;
        for (String s : split) {
            row = brandMapper.deleteByPrimaryKey(s);
        }
        return row;
    }

    /**
     * 查看所有的品牌，按照类别分类
     */
    public List<MyDataType> findAllBrand() {
        List<MyDataType> list = myDataTypeMapper.findAllBrand();
        return list;
    }

    /**
     * 查看仓库所有地址
     * @return
     */
    public List<Stockaddress> findStockAddress() {
        StockaddressExample example = new StockaddressExample();
        List<Stockaddress> list = stockaddressMapper.selectByExample(example);
        return list;
    }

    /**
     * 删除选中的货物库存记录
     * @param split
     * @return
     */
    public int deleteStockAddress(String[] split) {
        int row = 1;
        for (String s : split) {
            row = stockaddressMapper.deleteByPrimaryKey(s);
        }
        return row ;
    }

    /**
     * 查看所有的型号，按照类别分类
     */
    public List<MyDataType> findAllTypeno() {
        List<MyDataType> list = myDataTypeMapper.findAllTypeno();
        return list;
    }

    /**
     * 添加仓库地址信息
     * @param stockaddress
     * @return
     */
    public int saveStockAddress(Stockaddress stockaddress) {
        int row = stockaddressMapper.insert(stockaddress);
        return row;
    }

    /**
     * 通过三个id获得相对应的名称，然后显示页面
     */
    public MyDataType findThreeDataTypeNameById(String producttype, String typenoname, String brand) {
        Producttype producttype1 = producttypeMapper.selectByPrimaryKey(producttype);
        Typeno typeno = typenoMapper.selectByPrimaryKey(typenoname);
        Brand brand1 = brandMapper.selectByPrimaryKey(brand);
        MyDataType myDataType = new MyDataType();
        myDataType.setTypename(producttype1.getTypename());
        myDataType.setTypenoname(typeno.getTypenoname());
        myDataType.setBrandname(brand1.getBrandname());
        return myDataType;
    }

    /**
     * 通过类别id获得相对应的型号
     * @param id
     * @return
     */
    public List<Typeno> findAllTypenoByTypenameId(String id) {
        TypenoExample example = new TypenoExample();
        example.createCriteria().andProducttypeidEqualTo(id);
        List<Typeno> list = typenoMapper.selectByExample(example);
        return list;
    }

    /**
     * 通过类别id获得相对应的型号
     * @param id
     * @return
     */
    public List<Brand> findAllBrandByTypenameId(String id) {
        BrandExample example = new BrandExample();
        example.createCriteria().andTypeidEqualTo(id);
        List<Brand> list = brandMapper.selectByExample(example);
        return list;
    }

    /**
     * 通过类别id，和型号名称，判断是否已经存在该型号名称
     */
    public int checkIsExistTypenonameByTypenameid(String id, String typenoname) {
        TypenoExample example = new TypenoExample();
        TypenoExample.Criteria criteria = example.createCriteria();
        criteria.andTypenonameEqualTo(typenoname);
        criteria.andProducttypeidEqualTo(id);
        List<Typeno> list = typenoMapper.selectByExample(example);
        //1代表存在值，可以查询到。
        if(list.size()>0){
            return 1;
        }
        return 0;
    }

    /**
     * 通过类别id，和品牌名称，判断是否已经存在该品牌名称
     */
    public int checkIsExistBrandnameByTypenameid(String id, String brandname) {
        BrandExample example = new BrandExample();
        BrandExample.Criteria criteria = example.createCriteria();
        criteria.andTypeidEqualTo(id);
        criteria.andBrandnameEqualTo(brandname);
        List<Brand> list = brandMapper.selectByExample(example);
        //1代表存在值，可以查询到。
        if(list.size()>0){
            return 1;
        }
        return 0;
    }


}
