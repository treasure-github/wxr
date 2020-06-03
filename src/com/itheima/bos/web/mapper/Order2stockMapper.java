package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Order2stock;
import com.itheima.bos.web.pojo.Order2stockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Order2stockMapper {
    int countByExample(Order2stockExample example);

    int deleteByExample(Order2stockExample example);

    int deleteByPrimaryKey(String id);

    int insert(Order2stock record);

    int insertSelective(Order2stock record);

    List<Order2stock> selectByExample(Order2stockExample example);

    Order2stock selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Order2stock record, @Param("example") Order2stockExample example);

    int updateByExample(@Param("record") Order2stock record, @Param("example") Order2stockExample example);

    int updateByPrimaryKeySelective(Order2stock record);

    int updateByPrimaryKey(Order2stock record);
}