package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.MyOrdersproduct;
import com.itheima.bos.web.pojo.Orders;
import com.itheima.bos.web.pojo.Ordersproduct;
import com.itheima.bos.web.pojo.VoOrderRecorde;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MyManagerMapper {
    List<MyOrdersproduct> findAllOrderByQ(VoOrderRecorde voOrderRecorde);

    int findkuCunSum(String producttype, String typenoname);

    List<Orders> findAllOrderInfo(VoOrderRecorde voOrderRecorde);

	MyOrdersproduct getMyOrderProductByIds(String id);
}
