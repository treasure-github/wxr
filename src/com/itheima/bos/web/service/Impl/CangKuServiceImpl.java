package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.mapper.*;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.CangKuService;
import com.itheima.bos.web.utils.DateUtils;
import com.itheima.bos.web.utils.GetUUID;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CangKuServiceImpl implements CangKuService {
    @Autowired
    TypenoMapper typenoMapper;
    @Autowired
    BrandMapper brandMapper;
    @Autowired
    StockMapper stockMapper;
    @Autowired
    StockaddressMapper stockaddressMapper;
    @Autowired
    ProducttypeMapper producttypeMapper;
    @Autowired
    MyCanggKuMapper myCanggKuMapper;
    @Autowired
    InputrecordMapper inputrecordMapper;
    @Autowired
    OrdersproductMapper ordersproductMapper;
    @Autowired
    OrderinputrecordMapper orderinputrecordMapper;
    @Autowired
    OutputrecordMapper outputrecordMapper;
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    Stock2orderrecordMapper stock2orderrecordMapper;
    @Autowired
    Order2stockrecordMapper order2stockrecordMapper;
    @Autowired
    PrintrecoredMapper printrecoredMapper;




    /**
     * 通过id过得型号信息
     * @param id
     * @return
     */
    public List<Typeno> findTypenoById(String id) {
        TypenoExample example = new TypenoExample();
        TypenoExample.Criteria criteria = example.createCriteria();
        criteria.andProducttypeidEqualTo(id);
        List<Typeno> list = typenoMapper.selectByExample(example);
        return list;
    }
    /**
     * 通过id过得拼皮埃信息
     * @param id
     * @return
     */
    public List<Brand> findBrandById(String id) {
        BrandExample example = new BrandExample();
        BrandExample.Criteria criteria = example.createCriteria();
        criteria.andTypeidEqualTo(id);
        List<Brand> list = brandMapper.selectByExample(example);
        return list;
    }

    /**
     * 保存一条数据到库存表,同时添加一条来货数据记录
     * @param stock
     * @param typename
     * @param typeno
     * @param brandid
     * @param address
     * @return
     */
    public int saveStock(Stock stock, String typename, String typeno, String brandid, String address) {
        //通过他们的id查找相对应的值，然后添加到库存表中
        Producttype producttype = producttypeMapper.selectByPrimaryKey(typename);
        Typeno retypeno = typenoMapper.selectByPrimaryKey(typeno);
        Brand brand = brandMapper.selectByPrimaryKey(brandid);
        Stockaddress stockaddress = stockaddressMapper.selectByPrimaryKey(address);
        //给库存表录入数据
        stock.setProductname(producttype.getTypename());
        stock.setProductpp(brand.getBrandname());
        stock.setProductno(retypeno.getTypenoname());
        stock.setStockaddress(stockaddress.getAddress());
        int row  = stockMapper.insert(stock);

        //添加来货记录数
        Inputrecord inputrecord = new Inputrecord();
        inputrecord.setId(GetUUID.getUUID());
        inputrecord.setTypename(producttype.getTypename());
        inputrecord.setBrand(brand.getBrandname());
        inputrecord.setTypenoname(retypeno.getTypenoname());
        inputrecord.setConf(stock.getConf());
        inputrecord.setStockaddress(stockaddress.getAddress());
        inputrecord.setNum(stock.getNum());
        inputrecord.setInputdate(new Date());
        row = inputrecordMapper.insert(inputrecord);
        return row;
    }

    /**
     * 离线条件查询
     * @return
     */
    public List<Stock> findAllStockByq(PageBean pageBean,String q) {
        if(null != q &&!"".equals(q.trim())){
            q = q.trim();
        }
        if(null != q && "".equals(q.trim())){
            q=null;
        }
        List<Stock> list = myCanggKuMapper.findAllStockByq(pageBean.getBeginIndex(),pageBean.getPageSize(),q);
        //查询总记录数
        StockExample example = new StockExample();
        int row = stockMapper.countByExample(example);
        pageBean.setTotal(row);

        return list;
    }

    /**
     * 查看来货记录数据,默认显示当月所有的数据
     */
    public List<Stock> findInputRecord(PageBean pageBean,String keyWords){
        if(null != keyWords &&!"".equals(keyWords.trim())){
            keyWords = keyWords.trim();
        }
        if(null != keyWords && "".equals(keyWords.trim())){
            keyWords=null;
        }
        List<Stock> list = myCanggKuMapper.findInputRecord(pageBean.getBeginIndex(),pageBean.getPageSize(),keyWords);
        //查询总记录数
        InputrecordExample example = new InputrecordExample();
        int row = inputrecordMapper.countByExample2(keyWords);
        pageBean.setTotal(row);
        return list;
    }

    /**
     * 查看未完成的订单，可以离线查询订单号，客户，业务员
     * @param q
     * @return
     */
    public List<MyOrders> findAllNotFinishOrder(String q) {
        if(null != q && "".equals(q.trim())){
            q = null;
        }
        if(null != q && !"".equals(q.trim())){
            q = q.trim();
        }
        List<MyOrders> list = myCanggKuMapper.findAllNotFinishOrder(q);
        return list;
    }

    /**
     * 通过id查询商品信息
     * @param id
     * @return
     */
    public List<Ordersproduct> findAllOrdersproductById(String id) {
        OrdersproductExample example = new OrdersproductExample();
        OrdersproductExample.Criteria criteria = example.createCriteria();
        criteria.andOrdersidEqualTo(id);
        List<Ordersproduct> list = ordersproductMapper.selectByExample(example);
        return list;
    }

    /**
     * 添加货物单，同时添加来货记录
     * @param list
     * @return
     */
    public int updateOrderProduct(List<Ordersproduct> list) {
        //将实到数进行更改，客户需求数置为null
        int row = 1 ;
        for (Ordersproduct ordersproduct : list) {

            //如果货物没有一次性到完的话，则另外生成一条为到完的商品。

            int  sdnum = ordersproduct.getSdnum();
            int num  = ordersproduct.getNum();
            if(num!=sdnum){
                ordersproduct.setNum(sdnum);
                int oldprice = Integer.parseInt(ordersproduct.getPrice().toString());
                int oldlessprice = oldprice*sdnum;
                BigDecimal oldless = new BigDecimal(oldlessprice);
                ordersproduct.setLessprice(oldless);
                Ordersproduct newOrdersproduct = new Ordersproduct();
                BeanUtils.copyProperties(ordersproduct,newOrdersproduct);
                newOrdersproduct.setId(GetUUID.getUUID());
                newOrdersproduct.setSdnum(0);
                newOrdersproduct.setWczt("0");
                newOrdersproduct.setRemark(null);
                newOrdersproduct.setStockaddress(null);
                newOrdersproduct.setNum(num-sdnum);
                int price = Integer.parseInt(newOrdersproduct.getPrice().toString());
                int sumnum = newOrdersproduct.getNum();
                int lessPrice = price*sumnum;
                BigDecimal less = new BigDecimal(lessPrice);
                newOrdersproduct.setLessprice(less);
                newOrdersproduct.setSendnum(0);
                int row1 = ordersproductMapper.insert(newOrdersproduct);

            }

          row =  myCanggKuMapper.updateOrderProduct(ordersproduct.getSdnum(),ordersproduct.getWczt(),
                  ordersproduct.getRemark(),ordersproduct.getId(),ordersproduct.getStockaddress(),ordersproduct.getNum(),ordersproduct.getLessprice());


            //添加一条订单来货记录表,表示有数据进来才添加
            if(ordersproduct.getSdnum() != 0 ){
                MyOrders myOrders = myCanggKuMapper.findCustnameAndUsernameByOrdersproductId(ordersproduct.getOrdersid());
                Orderinputrecord orderinputrecord = new Orderinputrecord();
                orderinputrecord.setId(GetUUID.getUUID());
                orderinputrecord.setCustomername(myOrders.getCustomername());
                orderinputrecord.setOrdersid(ordersproduct.getOrdersid());
                orderinputrecord.setUsername(myOrders.getUsername());
                orderinputrecord.setTypename(ordersproduct.getProducttype());
                orderinputrecord.setTypenoname(ordersproduct.getTypenoname());
                orderinputrecord.setBrand(ordersproduct.getBrand());
                orderinputrecord.setConf(ordersproduct.getConf());
                orderinputrecord.setStockaddress(ordersproduct.getStockaddress());
                orderinputrecord.setNum(ordersproduct.getSdnum());
                orderinputrecord.setRksj(new Date());
                row = orderinputrecordMapper.insert(orderinputrecord);
            }
        }
        return row;
    }

    /**
     * 查询订单来货记录，可以分页查询
     * @param pageBean
     */
    public  List<Orderinputrecord> findOrderInputRecord(PageBean pageBean,String keyWords) {
        if(null != keyWords &&!"".equals(keyWords.trim())){
            keyWords = keyWords.trim();
        }
        if(null != keyWords &&"".equals(keyWords.trim())){
            keyWords=null;
        }
        List<Orderinputrecord> list = myCanggKuMapper.findOrderInputRecord(pageBean.getBeginIndex(),pageBean.getPageSize(),keyWords);
        //查询总记录数
        OrderinputrecordExample example = new OrderinputrecordExample();
        int count = orderinputrecordMapper.countByExample_key(keyWords);
        pageBean.setTotal(count);
        return list;
    }


    /**
     * 打单
     * @param list
     * @return
     */
    public int dd_updateOrderProduct(List<Ordersproduct> list,Sumno sumno) {
        int row = 1;
        //打单出货,修改发货数
        for (Ordersproduct ordersproduct : list) {
            int sendNum = ordersproduct.getSendnum()+ordersproduct.getSdnum();
            Ordersproduct ordersproduct1 = new Ordersproduct();
            ordersproduct1.setId(ordersproduct.getId());
            ordersproduct1.setSendnum(sendNum);
            ordersproduct1.setWczt("3");
            row = ordersproductMapper.updateByPrimaryKeySelective(ordersproduct1);
            //向打单记录添加一条数据
            Outputrecord outputrecord = new Outputrecord();
            outputrecord.setDdrecordid(GetUUID.getUUID());
            outputrecord.setProductorderid(ordersproduct.getId());
            outputrecord.setOutputdate(new Date());
            outputrecord.setOutputnum(ordersproduct.getSdnum());
            outputrecord.setPrintorderno(sumno.getPrintorderno());
            row = outputrecordMapper.insert(outputrecord);

        }
        Subject subject = SecurityUtils.getSubject();//获得当前用户对象,状态为“未认证”
        Staff staff = (Staff)subject.getPrincipal();

        //向打印订单号记录中添加一个记录
        Printrecored printrecored = new Printrecored();
        printrecored.setPrintorderno(sumno.getPrintorderno());
        printrecored.setIsdelete("正常");
        printrecored.setPrintdate(new Date());
        printrecored.setUsername(staff.getUsername());
        printrecoredMapper.insert(printrecored);

        return row;
    }

    /**
     * 查询 出货记录表
     * @param pageBean
     * @param q
     */
    public void showOutputRecord(PageBean<MyOrdersproduct> pageBean, String q) {
        if(null != q &&!"".equals(q.trim())){
            q = q.trim();
        }
        if(null != q &&"".equals(q.trim())){
            q=null;
        }
        List<MyOrdersproduct> list = myCanggKuMapper.showOutputRecord(pageBean.getBeginIndex(),pageBean.getPageSize(),q);
        pageBean.setRows(list);
        //查询总记录数
        OutputrecordExample example = new OutputrecordExample();
        int i = outputrecordMapper.countByExample_key(q);
        pageBean.setTotal(i);
    }

    /**
     * 离线条件查询库存转订单
     * @param pageBean
     * @param q
     */
    public void findStock2OrderRecord(PageBean<Stock2orderrecord> pageBean, String q) {
        if(null != q &&!"".equals(q.trim())){
            q = q.trim();
        }
        if(null != q &&"".equals(q.trim())){
            q=null;
        }
        List<Stock2orderrecord> list = myCanggKuMapper.findStock2OrderRecord(pageBean.getBeginIndex(),pageBean.getPageSize(),q);
        pageBean.setRows(list);
        //查询总记录数
        Stock2orderrecordExample example = new Stock2orderrecordExample();
        int i = stock2orderrecordMapper.countByExample_key(q);
        pageBean.setTotal(i);
    }

    /**
     * 更改库存转订单记录的处理情况信息
     */
    public int changeStock2OrderrecordWCQK(Stock2orderrecord stock2orderrecord) {
        int row = stock2orderrecordMapper.updateByPrimaryKeySelective(stock2orderrecord);
        return row;
    }


    public void findOrderToStockRecord(PageBean<Order2stockrecord> pageBean, String q) {
        if(null != q &&!"".equals(q.trim())){
            q = q.trim();
        }
        if(null != q &&"".equals(q.trim())){
            q=null;
        }
        List<Order2stockrecord> list = myCanggKuMapper.findOrderToStockRecord(pageBean.getBeginIndex(),pageBean.getPageSize(),q);
        pageBean.setRows(list);
        //查询总记录数
        Order2stockrecordExample example = new Order2stockrecordExample();
        int i = order2stockrecordMapper.countByExample_key(q);
        pageBean.setTotal(i);
    }

    /**
     *
     *更改订单转库存的信息。
     */
    public int changeOrder2StockrecordWCQK(Order2stockrecord order2stockrecord) {
        int row = order2stockrecordMapper.updateByPrimaryKeySelective(order2stockrecord);
        return row;
    }

    @Override
    public int ch_updateOrderProduct(List<Outputrecord> list, String wlno, String skfs) {
        int row = 1;
        //给订单号添加物流信息、
        String ordersid = null;
        for (Outputrecord outputrecord : list) {
            outputrecord.setProductorderid(outputrecord.getProductorderid());
            outputrecord.setOutputdate(null);
            outputrecord.setOutputnum(null);
            outputrecord.setSkfs(skfs);
            outputrecord.setWlno(wlno);
            outputrecordMapper.updateByPrimaryKeySelective(outputrecord);
            //将已经打单，并且已经发货的订单该为已经发货。
            Ordersproduct ordersproduct = ordersproductMapper.selectByPrimaryKey(outputrecord.getId());
            ordersid=ordersproduct.getOrdersid();
            if(ordersproduct.getSdnum().equals(ordersproduct.getNum())){
                ordersproduct.setWczt("4");
                ordersproductMapper.updateByPrimaryKeySelective(ordersproduct);
            }

            //遍历循环出该订单所有的商品，如果所有的商品都已经已发，则修改订单的完成状态为1
            if(null != ordersid){
                int flag = 1;
                OrdersproductExample example = new OrdersproductExample();
                OrdersproductExample.Criteria criteria = example.createCriteria();
                criteria.andOrdersidEqualTo(ordersid);
                List<Ordersproduct> list1 = ordersproductMapper.selectByExample(example);
                for (Ordersproduct ordersproduct1 : list1) {
                    if(!"4".equals(ordersproduct1.getWczt())){
                        flag=0;
                        break;
                    }
                }
                if(flag == 1){
                    Orders orders = new Orders();
                    orders.setId(ordersid);
                    orders.setWczt("1");
                    row = ordersMapper.updateByPrimaryKeySelective(orders);
                }
            }
        }
        return row;
    }
	/**
	 * 删除库存来货记录
	 */
	public void deleteInputRecord(String[] split) {
        int i =0;
		for (String s : split) {
            i = inputrecordMapper.deleteByPrimaryKey(s);
        }
		
	}
	/**
	 * 删除库存
	 */
	public void deleteShowKucun(String[] split) {
		for (String string : split) {
			stockMapper.deleteByPrimaryKey(string);
		}
		
	}

    @Override
    public Ordersproduct getOrdersIdByProductId(String productorderid) {
        Ordersproduct ordersproduct = ordersproductMapper.selectByPrimaryKey(productorderid);
        return ordersproduct;
    }

    @Override
    public boolean isPrintNo(List<Ordersproduct> list) {
        for (Ordersproduct ordersproduct : list) {
            Ordersproduct ordersproduct1 = ordersproductMapper.selectByPrimaryKey(ordersproduct.getId());
            if(ordersproduct1.getWczt().equals("3") || ordersproduct1.getNum() == ordersproduct1.getSendnum()){
                return true;

            }
        }
        return false;
    }

}

    /**
     *查询所有订单来货记录
     */


