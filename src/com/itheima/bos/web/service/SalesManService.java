package com.itheima.bos.web.service;

import com.itheima.bos.web.pojo.MyOrdersproduct;
import com.itheima.bos.web.pojo.Orders;
import com.itheima.bos.web.pojo.Ordersproduct;
import com.itheima.bos.web.pojo.VoOrderRecorde;

import java.util.List;

public interface SalesManService {
    int saveOrderInfo(List<Ordersproduct> list, Orders orders);

    List<MyOrdersproduct> selectOrderRecordNum(String id, VoOrderRecorde voOrderRecorde, String crudate, String lastMonth);
}
