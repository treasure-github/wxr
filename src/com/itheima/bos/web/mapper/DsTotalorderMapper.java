package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsTotalorder;
import com.itheima.bos.web.pojo.DsTotalorderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DsTotalorderMapper {
    int countByExample(DsTotalorderExample example);

    int deleteByExample(DsTotalorderExample example);

    int deleteByPrimaryKey(String totalorderid);

    int insert(DsTotalorder record);

    int insertSelective(DsTotalorder record);

    List<DsTotalorder> selectByExample(DsTotalorderExample example);

    DsTotalorder selectByPrimaryKey(String totalorderid);

    int updateByExampleSelective(@Param("record") DsTotalorder record, @Param("example") DsTotalorderExample example);

    int updateByExample(@Param("record") DsTotalorder record, @Param("example") DsTotalorderExample example);

    int updateByPrimaryKeySelective(DsTotalorder record);

    int updateByPrimaryKey(DsTotalorder record);
}