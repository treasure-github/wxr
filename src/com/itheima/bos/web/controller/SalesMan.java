package com.itheima.bos.web.controller;

import com.alibaba.fastjson.JSON;
import com.itheima.bos.web.VO.MessagerData;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.AdminService;
import com.itheima.bos.web.service.SalesManService;
import com.itheima.bos.web.utils.DateUtils;
import com.itheima.bos.web.utils.GetUUID;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Controller
public class SalesMan {
    @Autowired
    SalesManService salesManService;
    @Autowired
	AdminService adminService;

	/**
	 * 显示订业务员业绩
	 * @return
	 */
	
	@RequestMapping("/ody_base_performance.action")
	public String showPerformance(){
		return "ywy/performance";
	}
	/**
	 * 下订单
	 * @return
	 */
	
	@RequestMapping("/ody_order_order.action")
	public String addOrder(){
		return "ywy/order";
	}
	
	/**
	 * 显示订单记录页面
	 * @return
	 */
	
	@RequestMapping("/ody_order_ordrecord.action")
	public String showOrder(){
		return "ywy/orderfollow";
	}

	/**
	 * 显示库存查询
	 */
	@RequestMapping("/ody_base_showkucun.action")
	public String showKuCun(){
		return "ywy/showkucun";
	}

    /**
     * 添加一个订单
     */
    @RequestMapping("/saveOrderInfo.action")
    @ResponseBody
    public MessagerData  saveOrderInfo(String row ,String customerInfo){
        List<Ordersproduct> list = JSON.parseArray(row, Ordersproduct.class);
        Orders orders = JSON.parseObject(customerInfo, Orders.class);
        //生成一个订单号(工号-时间戳)
        Staff staff = (Staff)SecurityUtils.getSubject().getPrincipal();

        String id = staff.getId();
        id +="-"+System.currentTimeMillis();
        orders.setId(id);
        orders.setStaffno(staff.getId());
        orders.setOrderdate(new Date());
        //完成状态，默认为0,1表示已完成
        orders.setWczt("0");
         int resrow = salesManService.saveOrderInfo(list,orders);
         if(resrow >0){
			 Staff user = (Staff) SecurityUtils.getSubject().getSession().getAttribute("loginUser");
			 Operationrecord operationrecord = new Operationrecord();
			 operationrecord.setId(GetUUID.getUUID());
			 operationrecord.setUsername(user.getUsername());
			 operationrecord.setMessager(user.getUsername()+"下单了，总共"+list.size()+"种商品，定金:"+orders.getDingjin()+"元，应收总金额"+orders.getSumprice());
			 operationrecord.setMenutype("下订单");
			 operationrecord.setOprationtype("下单");
			 operationrecord.setOprationtime(new Date());
			 adminService.insertOperationRecord(operationrecord);
		 }
		MessagerData data = new MessagerData();
		if(resrow >0){
			data.setStatus(200);
			data.setMessage("下单成功！");
         	return data;
		 }
		 data.setStatus(400);
		data.setMessage("下单失败，请重新下单");
        return data;
    }
    /**
     * 查看订单记录,默认显示一个月的订单
     */
    @RequestMapping("/salesMan_findOrderFollow.action")
    @ResponseBody
    public List<MyOrdersproduct> findOrderFollow(VoOrderRecorde voOrderRecorde){
        //获得当前用户id
        Staff user = (Staff)SecurityUtils.getSubject().getPrincipal();
		System.out.println(voOrderRecorde.toString());
        //获得当前时间
        String crudate = DateUtils.getCrudate();
        String lastMonth = DateUtils.getLastMonth();

        List<MyOrdersproduct> list = salesManService.selectOrderRecordNum(user.getId(),voOrderRecorde,crudate,lastMonth);
        return list;
    }





}
