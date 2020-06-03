package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Typeno;
import com.itheima.bos.web.pojo.TypenoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypenoMapper {
    int countByExample(TypenoExample example);

    int deleteByExample(TypenoExample example);

    int deleteByPrimaryKey(String typenoid);

    int insert(Typeno record);

    int insertSelective(Typeno record);

    List<Typeno> selectByExample(TypenoExample example);

    Typeno selectByPrimaryKey(String typenoid);

    int updateByExampleSelective(@Param("record") Typeno record, @Param("example") TypenoExample example);

    int updateByExample(@Param("record") Typeno record, @Param("example") TypenoExample example);

    int updateByPrimaryKeySelective(Typeno record);

    int updateByPrimaryKey(Typeno record);
}