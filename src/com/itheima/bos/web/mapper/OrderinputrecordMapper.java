package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Orderinputrecord;
import com.itheima.bos.web.pojo.OrderinputrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderinputrecordMapper {
    int countByExample(OrderinputrecordExample example);
    int countByExample_key(@Param("keyWords") String keyWords);

    int deleteByExample(OrderinputrecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Orderinputrecord record);

    int insertSelective(Orderinputrecord record);

    List<Orderinputrecord> selectByExample(OrderinputrecordExample example);

    Orderinputrecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Orderinputrecord record, @Param("example") OrderinputrecordExample example);

    int updateByExample(@Param("record") Orderinputrecord record, @Param("example") OrderinputrecordExample example);

    int updateByPrimaryKeySelective(Orderinputrecord record);

    int updateByPrimaryKey(Orderinputrecord record);
}