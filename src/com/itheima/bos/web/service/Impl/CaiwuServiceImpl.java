package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.mapper.*;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.CaiwuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class CaiwuServiceImpl implements CaiwuService {
    @Autowired
    MyCaiwuMapper myCaiwuMapper;
    @Autowired
    PrintrecoredMapper printrecoredMapper;
    @Autowired
    OutputrecordMapper outputrecordMapper;
    @Autowired
    OrdersproductMapper ordersproductMapper;
    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public List<Printrecored> findPrintInfo(PageBean<Printrecored> pageBean, String q) {
        if(null != q &&!"".equals(q.trim())){
            q = q.trim();
        }
        if(null != q &&"".equals(q.trim())){
            q=null;
        }
        List<Printrecored> list = myCaiwuMapper.findPrintInfo(pageBean.getBeginIndex(),pageBean.getPageSize(),q);
        //查询总记录数
        PrintrecoredExample example = new PrintrecoredExample();
        int count = printrecoredMapper.countByExample_key(q);
        pageBean.setTotal(count);
        return list;
    }

    @Override
    public int isDeletePrintNO(String id) {
        Printrecored printrecored = new Printrecored();
        printrecored.setPrintorderno(id);
        printrecored.setIsdelete("作废");
        int row  = printrecoredMapper.updateByPrimaryKeySelective(printrecored);
        //作废之后，可以重新打印订单
        //获取商品的id

        OutputrecordExample example1 = new OutputrecordExample();
        OutputrecordExample.Criteria criteria = example1.createCriteria();
        criteria.andPrintordernoEqualTo(id);
        List<Outputrecord> outputrecords = outputrecordMapper.selectByExample(example1);
        for (Outputrecord outputrecord : outputrecords) {
            Ordersproduct ordersproduct = new Ordersproduct();
            ordersproduct.setId(outputrecord.getProductorderid());
            ordersproduct.setSendnum(0);
            ordersproduct.setWczt("2");
            ordersproductMapper.updateByPrimaryKeySelective(ordersproduct);
        }
        return row;
    }

    /**
     * 查询订单
     * @param crudate
     * @param lastMonth
     * @param voOrderRecorde
     * @return
     */
    public List<MyOrdersproduct> findAllOrderByQ(String crudate, String lastMonth, VoOrderRecorde voOrderRecorde) {
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
        List<MyOrdersproduct> list = myCaiwuMapper.findAllOrderByQ(voOrderRecorde);
        return list;
    }

    @Override
    public int updateOrderInfo(Orders orders) {
        int row = ordersMapper.updateByPrimaryKeySelective(orders);
        return row;
    }
}
