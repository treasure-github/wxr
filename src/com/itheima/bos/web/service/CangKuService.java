package com.itheima.bos.web.service;

import com.itheima.bos.web.pojo.*;

import java.util.List;

public interface CangKuService {
    List<Typeno> findTypenoById(String id);

    List<Brand> findBrandById(String id);

    int saveStock(Stock stock, String typename, String typeno, String brandid, String address);

    List<Stock> findAllStockByq(PageBean pageBean,String q);
    List<Stock> findInputRecord(PageBean pageBean,String q);

    List<MyOrders> findAllNotFinishOrder(String q);

    List<Ordersproduct> findAllOrdersproductById(String id);

    int updateOrderProduct(List<Ordersproduct> list);

    List<Orderinputrecord> findOrderInputRecord(PageBean pageBean,String q);

    int dd_updateOrderProduct(List<Ordersproduct> list,Sumno sumno);

    void showOutputRecord(PageBean<MyOrdersproduct> pageBean, String q);

    void findStock2OrderRecord(PageBean<Stock2orderrecord> pageBean, String q);

    int changeStock2OrderrecordWCQK(Stock2orderrecord stock2orderrecord);

    void findOrderToStockRecord(PageBean<Order2stockrecord> pageBean, String q);

    int changeOrder2StockrecordWCQK(Order2stockrecord order2stockrecord);

    int ch_updateOrderProduct(List<Outputrecord> list, String wlno, String skfs);

	void deleteInputRecord(String[] split);

	void deleteShowKucun(String[] split);

    Ordersproduct getOrdersIdByProductId(String productorderid);


    boolean isPrintNo(List<Ordersproduct> list);
}
