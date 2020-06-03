package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsExpress;
import com.itheima.bos.web.pojo.DsExpressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DsExpressMapper {
    int countByExample(DsExpressExample example);

    int deleteByExample(DsExpressExample example);

    int deleteByPrimaryKey(String expressid);

    int insert(DsExpress record);

    int insertSelective(DsExpress record);

    List<DsExpress> selectByExample(DsExpressExample example);

    DsExpress selectByPrimaryKey(String expressid);

    int updateByExampleSelective(@Param("record") DsExpress record, @Param("example") DsExpressExample example);

    int updateByExample(@Param("record") DsExpress record, @Param("example") DsExpressExample example);

    int updateByPrimaryKeySelective(DsExpress record);

    int updateByPrimaryKey(DsExpress record);
}