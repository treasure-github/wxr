package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Stockaddress;
import com.itheima.bos.web.pojo.StockaddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockaddressMapper {
    int countByExample(StockaddressExample example);

    int deleteByExample(StockaddressExample example);

    int deleteByPrimaryKey(String saId);

    int insert(Stockaddress record);

    int insertSelective(Stockaddress record);

    List<Stockaddress> selectByExample(StockaddressExample example);

    Stockaddress selectByPrimaryKey(String saId);

    int updateByExampleSelective(@Param("record") Stockaddress record, @Param("example") StockaddressExample example);

    int updateByExample(@Param("record") Stockaddress record, @Param("example") StockaddressExample example);

    int updateByPrimaryKeySelective(Stockaddress record);

    int updateByPrimaryKey(Stockaddress record);
}