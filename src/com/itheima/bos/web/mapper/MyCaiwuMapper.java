package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.MyOrdersproduct;
import com.itheima.bos.web.pojo.Printrecored;
import com.itheima.bos.web.pojo.VoOrderRecorde;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyCaiwuMapper {
    List<Printrecored> findPrintInfo(Integer beginIndex, Integer rows,@Param("q") String q);

    List<MyOrdersproduct> findAllOrderByQ(VoOrderRecorde voOrderRecorde);

    int findkuCunSum(String producttype, String typenoname);
}
