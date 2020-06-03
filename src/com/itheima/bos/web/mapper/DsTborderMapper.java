package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsTborder;
import com.itheima.bos.web.pojo.DsTborderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DsTborderMapper {
    int countByExample(DsTborderExample example);

    int deleteByExample(DsTborderExample example);

    int deleteByPrimaryKey(String id);

    int insert(DsTborder record);

    int insertSelective(DsTborder record);

    List<DsTborder> selectByExample(DsTborderExample example);

    DsTborder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DsTborder record, @Param("example") DsTborderExample example);

    int updateByExample(@Param("record") DsTborder record, @Param("example") DsTborderExample example);

    int updateByPrimaryKeySelective(DsTborder record);

    int updateByPrimaryKey(DsTborder record);
}