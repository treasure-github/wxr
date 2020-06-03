package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.MyOrdersproduct;
import com.itheima.bos.web.pojo.Ordersproduct;
import com.itheima.bos.web.pojo.VoOrderRecorde;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MySalesManMapper {

    List<MyOrdersproduct> selectOrderRecordNum(VoOrderRecorde voOrderRecorde);
}
