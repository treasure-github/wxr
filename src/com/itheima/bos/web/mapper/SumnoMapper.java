package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Sumno;
import com.itheima.bos.web.pojo.SumnoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SumnoMapper {
    int countByExample(SumnoExample example);

    int deleteByExample(SumnoExample example);

    int insert(Sumno record);

    int insertSelective(Sumno record);

    List<Sumno> selectByExample(SumnoExample example);

    int updateByExampleSelective(@Param("record") Sumno record, @Param("example") SumnoExample example);

    int updateByExample(@Param("record") Sumno record, @Param("example") SumnoExample example);
}