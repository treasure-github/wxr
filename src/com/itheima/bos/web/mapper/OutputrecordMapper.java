package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Outputrecord;
import com.itheima.bos.web.pojo.OutputrecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutputrecordMapper {
    int countByExample(OutputrecordExample example);
    int countByExample_key(@Param("q") String q);

    int deleteByExample(OutputrecordExample example);

    int deleteByPrimaryKey(String ddrecordid);

    int insert(Outputrecord record);

    int insertSelective(Outputrecord record);

    List<Outputrecord> selectByExample(OutputrecordExample example);

    Outputrecord selectByPrimaryKey(String ddrecordid);

    int updateByExampleSelective(@Param("record") Outputrecord record, @Param("example") OutputrecordExample example);

    int updateByExample(@Param("record") Outputrecord record, @Param("example") OutputrecordExample example);

    int updateByPrimaryKeySelective(Outputrecord record);

    int updateByPrimaryKey(Outputrecord record);
}