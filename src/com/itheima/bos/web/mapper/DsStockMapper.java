package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsStock;
import com.itheima.bos.web.pojo.DsStockExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DsStockMapper {
    int countByExample(DsStockExample example);

    int deleteByExample(DsStockExample example);

    int deleteByPrimaryKey(String id);

    int insert(DsStock record);

    int insertSelective(DsStock record);

    List<DsStock> selectByExample(DsStockExample example);

    DsStock selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DsStock record, @Param("example") DsStockExample example);

    int updateByExample(@Param("record") DsStock record, @Param("example") DsStockExample example);

    int updateByPrimaryKeySelective(DsStock record);

    int updateByPrimaryKey(DsStock record);
}