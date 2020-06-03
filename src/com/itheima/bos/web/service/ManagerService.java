package com.itheima.bos.web.service;

import com.itheima.bos.web.pojo.*;

import java.util.List;

public interface ManagerService {
    List<MyOrdersproduct> findAllOrderByQ(String crudate, String lastMonth, VoOrderRecorde voOrderRecorde);

    List<Orders> findAllOrderInfo(String crudate, String lastMonth, VoOrderRecorde voOrderRecorde);

    int stockToOrder(Ordersproduct ordersproduct, Integer changeNum, Stock stock);

    int orderToStock(List<Ordersproduct> list);

    int updateOrderCLQK(List<MyOrdersproduct> list);

    void deleteOrderProduct(String[] split);

    int deleteOrder(String[] split);

	List<MyOrdersproduct> getMyOrderProductByIds(String[] split);
}
