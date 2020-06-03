package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsPddorder;
import com.itheima.bos.web.pojo.DsPddorderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DsPddorderMapper {
    int countByExample(DsPddorderExample example);

    int deleteByExample(DsPddorderExample example);

    int deleteByPrimaryKey(String pddorderid);

    int insert(DsPddorder record);

    int insertSelective(DsPddorder record);

    List<DsPddorder> selectByExample(DsPddorderExample example);

    DsPddorder selectByPrimaryKey(String pddorderid);

    int updateByExampleSelective(@Param("record") DsPddorder record, @Param("example") DsPddorderExample example);

    int updateByExample(@Param("record") DsPddorder record, @Param("example") DsPddorderExample example);

    int updateByPrimaryKeySelective(DsPddorder record);

    int updateByPrimaryKey(DsPddorder record);
}