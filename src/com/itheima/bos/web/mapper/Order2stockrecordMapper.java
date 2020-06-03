package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Order2stockrecord;
import com.itheima.bos.web.pojo.Order2stockrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Order2stockrecordMapper {
    int countByExample(Order2stockrecordExample example);
    int countByExample_key(@Param("keyWords") String q);

    int deleteByExample(Order2stockrecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Order2stockrecord record);

    int insertSelective(Order2stockrecord record);

    List<Order2stockrecord> selectByExample(Order2stockrecordExample example);

    Order2stockrecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Order2stockrecord record, @Param("example") Order2stockrecordExample example);

    int updateByExample(@Param("record") Order2stockrecord record, @Param("example") Order2stockrecordExample example);

    int updateByPrimaryKeySelective(Order2stockrecord record);

    int updateByPrimaryKey(Order2stockrecord record);
}