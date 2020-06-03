package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.controller.SalesMan;
import com.itheima.bos.web.mapper.CustomerMapper;
import com.itheima.bos.web.mapper.MySalesManMapper;
import com.itheima.bos.web.mapper.OrdersMapper;
import com.itheima.bos.web.mapper.OrdersproductMapper;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.SalesManService;
import com.itheima.bos.web.utils.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class SalesManServiceImpl implements SalesManService {
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    OrdersproductMapper ordersproductMapper;
    @Autowired
    MySalesManMapper mySalesManMapper;
    @Autowired
    CustomerMapper customerMapper;


    /**
     * 添加订单信息
     * @return
     */
    public int saveOrderInfo(List<Ordersproduct> list, Orders orders) {
        int row = 1;
        row = ordersMapper.insert(orders);
        for (Ordersproduct ordersproduct : list) {
            //补充信息
            ordersproduct.setId(GetUUID.getUUID());
            ordersproduct.setOrdersid(orders.getId());
            ordersproduct.setSkqk(orders.getFhfs());
            ordersproduct.setSdnum(0);
            ordersproduct.setSendnum(0);
            //完成状态，默认为0未完成，1入库未丝印，2入库完成，3已打单，4已发货
            ordersproduct.setWczt("0");
            //处理情况，默认是0未处理，1已处理
            ordersproduct.setClqk("0");
           row =  ordersproductMapper.insert(ordersproduct);
        }
        //判断当前用户是否已经存在，根据电话号码判断，如果不存在，则录入该客户的信息

        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerphoneEqualTo(orders.getCustomerphone());
        List<Customer> customers = customerMapper.selectByExample(example);
        Customer customer = new Customer();
        if(customers == null || customers.size() == 0){
            //添加一个新用户

            customer.setId(GetUUID.getUUID());
            customer.setCustomername(orders.getCustomername());
            customer.setCustomerphone(orders.getCustomerphone());
            customer.setCustomeraddress(orders.getCustomeraddress());
            customer.setWuliuname(orders.getWuliuname());
            customer.setWuliuphone(orders.getWuliuphone());
            customer.setWuliuaddress(orders.getWuliuaddress());
            customer.setLastordertime(new Date());
            customer.setStaffid(orders.getStaffno());
            customerMapper.insert(customer);
        }else{
            //用户刚刚下单，更新用户的最后下单时间
            customer.setLastordertime(new Date());
            customerMapper.updateByExampleSelective(customer,example);
        }
        return row;
    }

    /**
     * 查询出所有订单
     * @param id
     * @return
     */
    public List<MyOrdersproduct> selectOrderRecordNum(String id, VoOrderRecorde voOrderRecorde, String crudate, String lastMonth) {
        //判断传进来的值是否为空，去空格
        if(null == voOrderRecorde.getBegintime() || "".equals(voOrderRecorde.getBegintime().trim())||null == voOrderRecorde.getEndtime() || "".equals(voOrderRecorde.getEndtime().trim())){
            //时间为空，默认显示最近一个月的时间
            voOrderRecorde.setBegintime(lastMonth);
            voOrderRecorde.setEndtime(crudate);
        }
        if(null != voOrderRecorde.getCustomername()&&!"".equals(voOrderRecorde.getCustomername().trim())){
            voOrderRecorde.setCustomername(voOrderRecorde.getCustomername().trim());
        }
        if(null != voOrderRecorde.getWczt()&&"".equals(voOrderRecorde.getWczt().trim()) ){
            voOrderRecorde.setWczt(null);
        }
        //执行查询
        voOrderRecorde.setId(id);
       List<MyOrdersproduct> list =  mySalesManMapper.selectOrderRecordNum(voOrderRecorde);
        return list;
    }




}
