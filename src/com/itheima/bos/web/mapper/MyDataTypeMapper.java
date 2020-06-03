package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Brand;
import com.itheima.bos.web.pojo.MyDataType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyDataTypeMapper {
    List<MyDataType> findAllBrand();
    List<MyDataType> findAllTypeno();
}
