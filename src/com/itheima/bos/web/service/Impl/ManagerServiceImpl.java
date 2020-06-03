package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.mapper.*;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.ManagerService;
import com.itheima.bos.web.utils.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    MyManagerMapper myManagerMapper;
    @Autowired
    OrdersproductMapper ordersproductMapper;
    @Autowired
    StockMapper stockMapper;
    @Autowired
    Stock2orderrecordMapper stock2orderrecordMapper;
    @Autowired
    Order2stockrecordMapper order2stockrecordMapper;
    @Autowired
    OrdersMapper ordersMapper;



    /**
     * 默认查询一个月订单数，日期降序查询
     */
    public List<MyOrdersproduct> findAllOrderByQ(String crudate , String lastMonth, VoOrderRecorde voOrderRecorde) {
        //判断传进来的值是否为空，去空格
        if(null == voOrderRecorde.getBegintime() || "".equals(voOrderRecorde.getBegintime().trim())||null == voOrderRecorde.getEndtime() || "".equals(voOrderRecorde.getEndtime().trim())){
            //时间为空，默认显示最近一个月的时间
            voOrderRecorde.setBegintime(lastMonth);
            voOrderRecorde.setEndtime(crudate);
        }
        if(null != voOrderRecorde.getUsername()&&!"".equals(voOrderRecorde.getUsername().trim())){
            voOrderRecorde.setUsername(voOrderRecorde.getUsername().trim());
        }
        if(null != voOrderRecorde.getWczt() && "".equals(voOrderRecorde.getWczt().trim())){
            voOrderRecorde.setWczt(null);
        }
        List<MyOrdersproduct> list= myManagerMapper.findAllOrderByQ(voOrderRecorde);
        for (MyOrdersproduct ordersproduct : list) {
            //根据商品名称和商品型号查询库存，
            int sum = myManagerMapper.findkuCunSum(ordersproduct.getProducttype(),ordersproduct.getTypenoname());
            ordersproduct.setKunum(sum);
        }
        return list;
    }

    /**
     * 查询订单基本信息
     * @param crudate
     * @param lastMonth
     * @param voOrderRecorde
     * @return
     */
    public List<Orders> findAllOrderInfo(String crudate, String lastMonth, VoOrderRecorde voOrderRecorde) {
        //判断传进来的值是否为空，去空格
        if(null == voOrderRecorde.getBegintime() || "".equals(voOrderRecorde.getBegintime().trim())||null == voOrderRecorde.getEndtime() || "".equals(voOrderRecorde.getEndtime().trim())){
            //时间为空，默认显示最近一个月的时间
            voOrderRecorde.setBegintime(lastMonth);
            voOrderRecorde.setEndtime(crudate);
        }
        if(null != voOrderRecorde.getUsername()&&!"".equals(voOrderRecorde.getUsername().trim())){
            voOrderRecorde.setUsername(voOrderRecorde.getUsername().trim());
        }
        if(null != voOrderRecorde.getWczt() && "".equals(voOrderRecorde.getWczt().trim())){
            voOrderRecorde.setWczt(null);
        }
        List<Orders> list = myManagerMapper.findAllOrderInfo(voOrderRecorde);

        return list;
    }

    /**
     * 库存转订单
     * @param ordersproduct  更新的商品信息实体类
     * @param changeNum 原来转化的数量
     * @param stock 需要更改的库存数据
     * @return
     */

    public int stockToOrder(Ordersproduct ordersproduct, Integer changeNum, Stock stock) {
        int row = 1;
        row = ordersproductMapper.updateByPrimaryKeySelective(ordersproduct);
        //更改库存的数据，判断是否为0，如果为0，则删除该条记录
        if(stock.getNum()-changeNum == 0){
            row = stockMapper.deleteByPrimaryKey(stock.getId());
        }
        stock.setNum(stock.getNum()-changeNum);
        //更新库存表的数据
        stockMapper.updateByPrimaryKeySelective(stock);
        //来库存转订单表添加一条记录
        Stock2orderrecord stock2orderrecord = new Stock2orderrecord();
        stock2orderrecord.setId(GetUUID.getUUID());
        stock2orderrecord.setOldtypename(stock.getProductname());
        stock2orderrecord.setOldtypenoname((stock.getProductno()));
        stock2orderrecord.setOlrbrand(stock.getProductpp());
        stock2orderrecord.setChangnum(changeNum);
        stock2orderrecord.setNewconf(ordersproduct.getConf());
        stock2orderrecord.setUsername(ordersproduct.getUsername());
        stock2orderrecord.setNewtypename(ordersproduct.getProducttype());
        stock2orderrecord.setNewtypenoname(ordersproduct.getTypenoname());
        stock2orderrecord.setNewbrand(ordersproduct.getBrand());
        //转换处理情况，0未处理，1，已经处理
        stock2orderrecord.setWcqk("0");
        stock2orderrecord.setStockaddress(stock.getStockaddress());
        stock2orderrecord.setOrdersid(ordersproduct.getOrdersid());
        stock2orderrecord.setCustomername(ordersproduct.getCustomername());
        stock2orderrecord.setChangetime(new Date());

        row = stock2orderrecordMapper.insert(stock2orderrecord);

        return row;
    }

    /**
     * 订单转库存，删除该条数据，添加一条订单转库存的记录。
     * @param list
     * @return
     */
    public int orderToStock(List<Ordersproduct> list) {
        int row = 0;
        for (Ordersproduct ordersproduct : list) {
            //添加订单转库存记录的的数据
            Order2stockrecord order2stockrecord = new Order2stockrecord();
            order2stockrecord.setId(GetUUID.getUUID());
            order2stockrecord.setCustomername(ordersproduct.getCustomername());
            order2stockrecord.setUsername(ordersproduct.getUsername());
            order2stockrecord.setOldtypename(ordersproduct.getProducttype());
            order2stockrecord.setOldtypenoname(ordersproduct.getTypenoname());
            order2stockrecord.setOlrbrand(ordersproduct.getBrand());
            order2stockrecord.setOldconf(ordersproduct.getConf());
            order2stockrecord.setOrdersid(ordersproduct.getOrdersid());
            //默认处理情况，0未处理，1已经处理
            order2stockrecord.setWcqk("0");
            order2stockrecord.setStockaddress(ordersproduct.getStockaddress());
            order2stockrecord.setChangetime(new Date());
            order2stockrecord.setChangnum(ordersproduct.getNum()-ordersproduct.getSendnum());
            row = order2stockrecordMapper.insert(order2stockrecord);
            //删除该条订单记录。
            row  = ordersproductMapper.deleteByPrimaryKey(ordersproduct.getId());
        }
        return row;
    }

    /**
     * 修改订单的处理状态
     * @param list
     * @return
     */
    public int updateOrderCLQK(List<MyOrdersproduct> list) {
        int row = 1;
        for (MyOrdersproduct myOrdersproduct : list) {
            Ordersproduct ordersproduct = new Ordersproduct();
            ordersproduct.setId(myOrdersproduct.getId());
            //处理情况，1表示已经处理，0表示未处理
            ordersproduct.setClqk("1");
            row = ordersproductMapper.updateByPrimaryKeySelective(ordersproduct);
        }
        return row;
    }

    /**
     * 删除订单商品
     * @param split
     */
    public void deleteOrderProduct(String[] split) {
        for (String s : split) {
            ordersproductMapper.deleteByPrimaryKey(s);
        }
    }

    /**
     * 删除订单，校验该订单是否还有商品
     * @param split
     * @return
     */
    public int deleteOrder(String[] split) {
        int row = 0;
        for (String s : split) {
            OrdersproductExample example = new OrdersproductExample();
            OrdersproductExample.Criteria criteria = example.createCriteria();
            criteria.andOrdersidEqualTo(s);
            List<Ordersproduct> list = ordersproductMapper.selectByExample(example);
            //如果大于0，有值，直接返回。
            if(list.size()>0){
                return 0;
            }
        }
        for (String s : split) {
            row = ordersMapper.deleteByPrimaryKey(s);
        }
        return row;
    }

	/**
	 * 通过id获得所有的订单信息
	 */
	public List<MyOrdersproduct> getMyOrderProductByIds(String[] split) {
		List<MyOrdersproduct> list = new ArrayList<MyOrdersproduct>();
		for (String id : split) {
			MyOrdersproduct ordersproduct = myManagerMapper.getMyOrderProductByIds(id);
			list.add(ordersproduct);
		}
		
		return list;
	}


}
