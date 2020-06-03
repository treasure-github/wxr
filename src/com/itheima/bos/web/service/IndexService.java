package com.itheima.bos.web.service;

import com.itheima.bos.web.VO.DataVo;
import com.itheima.bos.web.pojo.*;

import java.util.List;

public interface IndexService {
    List<MenuList> findAllMenu();
    List<MenuList> findAllMenuById(String id);
    List findMenuTree();

    List getRole();

    void deleteUserFunction(String userID);

    List getUserFunctionId(String roleId);

    int insertUserFunction(String functionId,String userID,String functionName);

    int updateUpassword(Staff staff);

    DataVo findAllStaffShipmentNum(String currMonthFirstDay, String currMonthLastDay);

    List<Customer> findCustomerInfo(PageBean<Customer> pageBean, String q);

    int findCustomerisExist(String phone);

    int addCustomer(Customer customer);

    int deleteCustomer(String[] id);

    int updateCustomerInfo(Customer customer);

    Customer findCustomerInfoBySearch(String searchText);

    DataVo findAllCollectionMoney(String currMonthFirstDay, String currMonthLastDay);

    DataVo findTypeRank(String beginDate, String currentDate);

    DataVo findDRtypenonameRank(String beginDate, String currentDate);
}
