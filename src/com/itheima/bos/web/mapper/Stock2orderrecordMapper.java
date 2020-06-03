package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Stock2orderrecord;
import com.itheima.bos.web.pojo.Stock2orderrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Stock2orderrecordMapper {
    int countByExample(Stock2orderrecordExample example);
    int countByExample_key(@Param("q") String q);

    int deleteByExample(Stock2orderrecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Stock2orderrecord record);

    int insertSelective(Stock2orderrecord record);

    List<Stock2orderrecord> selectByExample(Stock2orderrecordExample example);

    Stock2orderrecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Stock2orderrecord record, @Param("example") Stock2orderrecordExample example);

    int updateByExample(@Param("record") Stock2orderrecord record, @Param("example") Stock2orderrecordExample example);

    int updateByPrimaryKeySelective(Stock2orderrecord record);

    int updateByPrimaryKey(Stock2orderrecord record);
}