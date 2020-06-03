package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Ordersproduct;
import com.itheima.bos.web.pojo.OrdersproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersproductMapper {
    int countByExample(OrdersproductExample example);

    int deleteByExample(OrdersproductExample example);

    int deleteByPrimaryKey(String id);

    int insert(Ordersproduct record);

    int insertSelective(Ordersproduct record);

    List<Ordersproduct> selectByExample(OrdersproductExample example);

    Ordersproduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Ordersproduct record, @Param("example") OrdersproductExample example);

    int updateByExample(@Param("record") Ordersproduct record, @Param("example") OrdersproductExample example);

    int updateByPrimaryKeySelective(Ordersproduct record);

    int updateByPrimaryKey(Ordersproduct record);

}