package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Printrecored;
import com.itheima.bos.web.pojo.PrintrecoredExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrintrecoredMapper {
    int countByExample(PrintrecoredExample example);
    int countByExample_key(@Param("q") String keyWord);

    int deleteByExample(PrintrecoredExample example);

    int deleteByPrimaryKey(String printorderno);

    int insert(Printrecored record);

    int insertSelective(Printrecored record);

    List<Printrecored> selectByExample(PrintrecoredExample example);

    Printrecored selectByPrimaryKey(String printorderno);

    int updateByExampleSelective(@Param("record") Printrecored record, @Param("example") PrintrecoredExample example);

    int updateByExample(@Param("record") Printrecored record, @Param("example") PrintrecoredExample example);

    int updateByPrimaryKeySelective(Printrecored record);

    int updateByPrimaryKey(Printrecored record);
}