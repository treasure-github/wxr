package com.itheima.bos.web.service;

import com.itheima.bos.web.pojo.*;

import java.util.List;

public interface DataTypeService {
    int saveTypenoname(Typeno typeno);

    int saveBrand(Brand brand);

    int saveTypename(Producttype producttype);

    List<Producttype> findAllProductType();

    int deleteProductType(String[] split);

    int deleteTypenoname(String[] split);

    int deleteTypeBrand(String[] split);

    List<MyDataType> findAllBrand();

    List<Stockaddress> findStockAddress();

    int deleteStockAddress(String[] split);

    List<MyDataType> findAllTypeno();

    int saveStockAddress(Stockaddress stockaddress);

    MyDataType findThreeDataTypeNameById(String producttype, String typenoname, String brand);

    List<Typeno> findAllTypenoByTypenameId(String id);

    List<Brand> findAllBrandByTypenameId(String id);

    int checkIsExistTypenonameByTypenameid(String id, String typenoname);

    int checkIsExistBrandnameByTypenameid(String id, String brandname);
}
