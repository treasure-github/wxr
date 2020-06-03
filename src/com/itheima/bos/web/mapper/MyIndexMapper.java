package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyIndexMapper {
    List<MenuList> findAllMenuById(String id);

    List<MyOrders> findAllStaffShipmentNum(String currMonthFirstDay, String currMonthLastDay);

    List<Customer> findAllCustomerInfo(@Param("q")String q, Integer beginIndex, Integer pageSize);

    List<Customer> finCustomerInfo(@Param("q")String q, String id, Integer beginIndex, Integer pageSize);

    List<Customer> findCustomerInfoBySearch(String searchText, String id);

    List<MyOrders> findAllCollectionMoney(String currMonthFirstDay, String currMonthLastDay);

    List<Ordersproduct> findTypeRank(String beginDate, String currentDate);

    List<Ordersproduct> findTypeRankByStaffId(String beginDate, String currentDate, String id);

    List<Ordersproduct> findDRtypenonameRank(String beginDate, String currentDate);

    List<Ordersproduct> findDRtypenonameRankByStaffno(String beginDate, String currentDate, String id);
}
