package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.VO.DataVo;
import com.itheima.bos.web.mapper.AuthFunctionMapper;
import com.itheima.bos.web.mapper.CustomerMapper;
import com.itheima.bos.web.mapper.MyIndexMapper;
import com.itheima.bos.web.mapper.StaffMapper;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.IndexService;
import com.itheima.bos.web.utils.GetUUID;
import com.sun.corba.se.impl.encoding.TypeCodeOutputStream;
import org.apache.shiro.SecurityUtils;
import org.apache.taglibs.standard.lang.jstl.NullLiteral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class IndexServiceImpl implements IndexService {

    @Autowired
    MyIndexMapper myIndexMapper;
    @Autowired
    AuthFunctionMapper authFunctionMapper;
    @Autowired
    StaffMapper staffMapper;
    @Autowired
    CustomerMapper customerMapper;

    /**
     * 获得所有菜单
     *
     * @return
     */
    @Override
    public List<MenuList> findAllMenu() {
//        AuthFunctionExample example = new AuthFunctionExample();
        List<MenuList> list = authFunctionMapper.selectByExample();
        return list;
    }

    //    授权用
    @Override
    public List findMenuTree() {
        List list = authFunctionMapper.findMenuTree();
        return list;
    }
//    获取角色
    @Override
    public List getRole(){
        List list = authFunctionMapper.getRole();
        return list;
    }

    @Override
    public void deleteUserFunction(String userID){
        authFunctionMapper.deleteUserFunction(userID);
    }

    @Override
    public List getUserFunctionId(String userID){
        return authFunctionMapper.getUserFunctionId(userID);
    }

    @Override
    public int insertUserFunction(String functionId,String userID,String functionName){
        return authFunctionMapper.insertUserPermission(userID,functionId,functionName);
    }

    /**
     * 通过id获得所有的菜单
     *
     * @return
     */
    @Override
    public List<MenuList> findAllMenuById(String id) {
        List<MenuList> list = myIndexMapper.findAllMenuById(id);
        return list;
    }

    /**
     * 修改密码
     *
     * @param staff 创建一个新的对象，只会覆盖新改的密码
     * @return
     */
    @Override
    public int updateUpassword(Staff staff) {
        int row = staffMapper.updateByPrimaryKeySelective(staff);
        return row;
    }

    @Override
    public DataVo findAllStaffShipmentNum(String currMonthFirstDay, String currMonthLastDay) {

        List<MyOrders> list = myIndexMapper.findAllStaffShipmentNum(currMonthFirstDay, currMonthLastDay);

        if (list != null) {
            DataVo dataVo = new DataVo();
            List<Double> shipmentNum = new ArrayList<>();
            List<String> username = new ArrayList<>();
            for (MyOrders myOrders : list) {
                shipmentNum.add(myOrders.getSumtotal());
                username.add(myOrders.getUsername());
            }
            if (shipmentNum != null && username != null) {
                dataVo.setShipmentNumList(shipmentNum);
                dataVo.setUsernameList(username);
            }
            return dataVo;
        }


        return null;
    }

    @Override
    public List<Customer> findCustomerInfo(PageBean<Customer> pageBean, String q) {
        if (null != q && !"".equals(q.trim())) {
            q = q.trim();
        }
        if (null != q && "".equals(q.trim())) {
            q = null;
        }
        List<Customer> list = null;
        int sumcount = 0;
        CustomerExample example = new CustomerExample();

        //获得当前用户
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        if (staff.getId().equals("admin") || staff.getId().equals("super")) {
            //管理人员，可查询所有员工信息
            list = myIndexMapper.findAllCustomerInfo(q, pageBean.getBeginIndex(), pageBean.getPageSize());
            sumcount = customerMapper.countByExample(example);
        } else {
            list = myIndexMapper.finCustomerInfo(q, staff.getId(), pageBean.getBeginIndex(), pageBean.getPageSize());
            CustomerExample.Criteria criteria = example.createCriteria();
            criteria.andStaffidEqualTo(staff.getId());
            sumcount = customerMapper.countByExample(example);
        }
        pageBean.setTotal(sumcount);
        //查询总记录数
        for (Customer customer : list) {
            if (customer.getLastordertime() == null) {
                customer.setLasttime("暂无下单");
            } else {
                String calculateTime = CalculateTime(customer.getLastordertime());
                customer.setLasttime(calculateTime);
            }

        }
        return list;
    }

    @Override
    public int findCustomerisExist(String phone) {
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerphoneEqualTo(phone);
        List<Customer> customers = customerMapper.selectByExample(example);
        if (customers.size() != 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public int addCustomer(Customer customer) {
        customer.setId(GetUUID.getUUID());
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        customer.setStaffid(staff.getId());
        int row = customerMapper.insert(customer);
        return row;
    }

    /**
     * 删除 客户信息
     *
     * @param ids
     * @return
     */
    @Override
    public int deleteCustomer(String[] ids) {
        int row = 0;
        for (String id : ids) {
            row = customerMapper.deleteByPrimaryKey(id);
        }
        return row;
    }

    @Override
    public int updateCustomerInfo(Customer customer) {
        int rownum = customerMapper.updateByPrimaryKeySelective(customer);
        return rownum;
    }

    /**
     * 通过姓名和电话模糊搜索客户信息
     *
     * @param searchText
     * @return
     */
    public Customer findCustomerInfoBySearch(String searchText) {
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        List<Customer> customers = myIndexMapper.findCustomerInfoBySearch(searchText, staff.getId());
        if (customers.size() > 0) {
            return customers.get(0);
        }
        return null;
    }

    @Override
    public DataVo findAllCollectionMoney(String currMonthFirstDay, String currMonthLastDay) {
        List<MyOrders> list = myIndexMapper.findAllCollectionMoney(currMonthFirstDay, currMonthLastDay);

        if (list != null) {
            DataVo dataVo = new DataVo();
            List<Double> collectionmoney = new ArrayList<>();
            List<String> username = new ArrayList<>();
            for (MyOrders myOrders : list) {
                collectionmoney.add(myOrders.getCollectionmoney());
                username.add(myOrders.getUsername());
            }
            if (collectionmoney != null && username != null) {
                dataVo.setShipmentNumList(collectionmoney);
                dataVo.setUsernameList(username);
            }
            return dataVo;
        }


        return null;
    }

    @Override
    public DataVo findTypeRank(String beginDate, String currentDate) {
        List<Ordersproduct> list = null;
        //获得当前登录对象
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        String id = staff.getId();
        if (id.equals("admin") || id.equals("super")) {
            list = myIndexMapper.findTypeRank(beginDate, currentDate);
        } else {
            list = myIndexMapper.findTypeRankByStaffId(beginDate, currentDate, id);
        }
        DataVo dataVo = new DataVo();
        List<String> typeNameList = new ArrayList<>();
        List<String> typeNumList = new ArrayList<>();
        List<String> typeMoneyList = new ArrayList<>();
        for (Ordersproduct ordersproduct : list) {
            typeNameList.add(ordersproduct.getProducttype());
            typeNumList.add(ordersproduct.getNum().toString());
            typeMoneyList.add(ordersproduct.getSendnum().toString());
        }
        dataVo.setTypeNameList(typeNameList);
        dataVo.setTypeNumList(typeNumList);
        dataVo.setTypeMoneyList(typeMoneyList);
        return dataVo;
    }

    @Override
    public DataVo findDRtypenonameRank(String beginDate, String currentDate) {
        List<Ordersproduct> list = null;
        //获得当前登录对象
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        String id = staff.getId();
        if (id.equals("admin") || id.equals("super")) {
            list = myIndexMapper.findDRtypenonameRank(beginDate, currentDate);
        } else {
            list = myIndexMapper.findDRtypenonameRankByStaffno(beginDate, currentDate, id);
        }
        DataVo dataVo = new DataVo();
        List<String> typenonameList = new ArrayList<>();
        List<String> typeNumList = new ArrayList<>();
        List<String> typeMoneyList = new ArrayList<>();
        for (Ordersproduct ordersproduct : list) {
            typenonameList.add(ordersproduct.getTypenoname());
            typeNumList.add(ordersproduct.getNum().toString());
            typeMoneyList.add(ordersproduct.getSendnum().toString());
        }
        dataVo.setTypeNoNameList(typenonameList);
        dataVo.setTypeNumList(typeNumList);
        dataVo.setTypeMoneyList(typeMoneyList);
        return dataVo;
    }

    /**
     * 由过去的某一时间,计算距离当前的时间
     */
    public String CalculateTime(Date time) {
        long nowTime = System.currentTimeMillis(); // 获取当前时间的毫秒数
        String msg = null;
        long reset = time.getTime(); // 获取指定时间的毫秒数
        long dateDiff = nowTime - reset;
        if (dateDiff < 0) {
            msg = "输入的时间不对";
        } else {
            long dateTemp1 = dateDiff / 1000; // 秒
            long dateTemp2 = dateTemp1 / 60; // 分钟
            long dateTemp3 = dateTemp2 / 60; // 小时
            long dateTemp4 = dateTemp3 / 24; // 天数
            long dateTemp5 = dateTemp4 / 30; // 月数
            long dateTemp6 = dateTemp5 / 12; // 年数
            if (dateTemp6 > 0) {
                msg = dateTemp6 + "年前";
            } else if (dateTemp5 > 0) {
                msg = dateTemp5 + "个月前";
            } else if (dateTemp4 > 0) {
                msg = dateTemp4 + "天前";
            } else if (dateTemp3 > 0) {
                msg = dateTemp3 + "小时前";
            } else if (dateTemp2 > 0) {
                msg = dateTemp2 + "分钟前";
            } else if (dateTemp1 > 0) {
                msg = "刚刚";
            }
        }
        return msg;
    }


}
