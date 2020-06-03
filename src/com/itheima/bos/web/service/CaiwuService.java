package com.itheima.bos.web.service;

import com.itheima.bos.web.pojo.*;

import java.util.List;

public interface CaiwuService {
    List<Printrecored> findPrintInfo(PageBean<Printrecored> pageBean, String q);

    int isDeletePrintNO(String id);

    List<MyOrdersproduct> findAllOrderByQ(String crudate, String lastMonth, VoOrderRecorde voOrderRecorde);

    int updateOrderInfo(Orders orders);
}
