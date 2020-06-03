package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsModelinfo;
import com.itheima.bos.web.pojo.DsModelinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DsModelinfoMapper {
    int countByExample(DsModelinfoExample example);

    int deleteByExample(DsModelinfoExample example);

    int deleteByPrimaryKey(String modelinfoid);

    int insert(DsModelinfo record);

    int insertSelective(DsModelinfo record);

    List<DsModelinfo> selectByExample(DsModelinfoExample example);

    DsModelinfo selectByPrimaryKey(String modelinfoid);

    int updateByExampleSelective(@Param("record") DsModelinfo record, @Param("example") DsModelinfoExample example);

    int updateByExample(@Param("record") DsModelinfo record, @Param("example") DsModelinfoExample example);

    int updateByPrimaryKeySelective(DsModelinfo record);

    int updateByPrimaryKey(DsModelinfo record);
}