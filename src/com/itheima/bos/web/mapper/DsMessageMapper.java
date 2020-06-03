package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsMessage;
import com.itheima.bos.web.pojo.DsMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DsMessageMapper {
    int countByExample(DsMessageExample example);

    int deleteByExample(DsMessageExample example);

    int deleteByPrimaryKey(String messageid);

    int insert(DsMessage record);

    int insertSelective(DsMessage record);

    List<DsMessage> selectByExample(DsMessageExample example);

    DsMessage selectByPrimaryKey(String messageid);

    int updateByExampleSelective(@Param("record") DsMessage record, @Param("example") DsMessageExample example);

    int updateByExample(@Param("record") DsMessage record, @Param("example") DsMessageExample example);

    int updateByPrimaryKeySelective(DsMessage record);

    int updateByPrimaryKey(DsMessage record);
}