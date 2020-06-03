package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsMessage;
import com.itheima.bos.web.pojo.PageBean;
import com.itheima.bos.web.pojo.VoMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyMessageMapper {
    List<DsMessage> findMessage(@Param("voMessage") VoMessage voMessage,@Param("pageBean") PageBean pageBean);
    Integer messageCount(@Param("voMessage") VoMessage voMessage,@Param("pageBean") PageBean pageBean);
}
