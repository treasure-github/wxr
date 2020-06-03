package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsStore;
import com.itheima.bos.web.pojo.DsStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DsStoreMapper {
    int countByExample(DsStoreExample example);

    int deleteByExample(DsStoreExample example);

    int deleteByPrimaryKey(String storeid);

    int insert(DsStore record);

    int insertSelective(DsStore record);

    List<DsStore> selectByExample(DsStoreExample example);

    DsStore selectByPrimaryKey(String storeid);

    int updateByExampleSelective(@Param("record") DsStore record, @Param("example") DsStoreExample example);

    int updateByExample(@Param("record") DsStore record, @Param("example") DsStoreExample example);

    int updateByPrimaryKeySelective(DsStore record);

    int updateByPrimaryKey(DsStore record);
}