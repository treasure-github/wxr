package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface MyCanggKuMapper {

    List<Stock> findInputRecord(Integer beginIndex, Integer pageSize, @Param("q")String q);

    List<MyOrders> findAllNotFinishOrder(@Param("q") String q);

    int updateOrderProduct(Integer sdnum, String wczt, String remark, String id, String stockaddress, Integer num, BigDecimal lessprice);

    List<Orderinputrecord> findOrderInputRecord(Integer beginIndex, Integer rows,@Param("q") String q);

    List<Stock> findAllStockByq(Integer beginIndex, Integer pageSize, @Param("q")String q);

    List<MyOrdersproduct> showOutputRecord(Integer beginIndex, Integer pageSize, @Param("q")String q);

    List<Stock2orderrecord> findStock2OrderRecord(Integer beginIndex, Integer pageSize, @Param("q")String q);

    List<Order2stockrecord> findOrderToStockRecord(Integer beginIndex, Integer pageSize, @Param("q")String q);

    MyOrders findCustnameAndUsernameByOrdersproductId(String ordersid);
}
