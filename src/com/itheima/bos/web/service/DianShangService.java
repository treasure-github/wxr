package com.itheima.bos.web.service;

import com.github.pagehelper.PageInfo;
import com.itheima.bos.web.VO.DataVo;
import com.itheima.bos.web.VO.ProfitVo;
import com.itheima.bos.web.VO.VoOrderBack;
import com.itheima.bos.web.pojo.*;

import java.math.BigDecimal;
import java.util.List;

public interface DianShangService {
    //库存信息
    List<DsStock> findAllDsStock();
    void deleteDsKucun(String[] split);
    int saveStock(DsStock dsStock, String typename, String typeno, String brand, int num);


    //快递信息
    List<DsExpress> findAllKuaidi();

    BigDecimal findKuaidiCost(String shengfen, String kuaidi);//查询某个快递成本

    void deleteKuaidi(String[] split);

    int saveKuaidi(DsExpress dsExpress, String province, String expressname, BigDecimal expresscost);


    //型号信息
    List<DsModelinfo> findXinghaoxinxi();

    int saveXinghaoxinxi(DsModelinfo dsModelinfo);

    BigDecimal findModelCost(String xinghao);

    void deleteXinghaoxinxi(String[] split);


    //日志信息
    PageBean findMessage(VoMessage voMessage, PageBean pageBean);



    int updateOrderInfo(DsModelinfo dsModelinfo);

    List<DsStore> findAllStroe();

    void deleteStore(String[] split);

    int updateStore(DsStore dsStore);

    int addStore(DsStore dsStore);

    int updateKuaidiInfo(DsExpress dsExpress);

    int updateStockInfo(DsStock dsStock);

    int saveTbOrder(DsTborder dsTborder);

    void deleteTaobaoOrder(String[] split);

    int updateInputTaobaoOrder(DsTborder dsTborder);

    List<DsStore> findStoreNameByTypeId(String id);

    DataVo findLiRunByQ(String storeid, String profittime, String storetype);

    int findTborderById(String orderId);

    List<DsTborder> findAllTBorder(String storeId, String crudateBegin, String crudateEnd);

    DsStraightcart findStraightNum(String storeId, String crudateBegin, String crudateEnd);

    int updateStraightNum(String storeId, String crudateBegin, String crudateEnd, double num);

    ProfitVo countShuaDanCost(String storeId, String crudateBegin, String crudateEnd);

    List<DsTborder> findAllShuaDanTBorder(String storeId, String crudateBegin, String crudateEnd);

    /**
     * @Description: <订单回退查询>
     * @Param var1 <描述>
     * @Param var2 <描述>
     * @Param var3 <描述>
     * @Return java.util.List<com.itheima.bos.web.pojo.Orderback>
     */
    PageBean findOrderBackInfo(String var1, String var2, VoOrderBack var3, PageBean pageBean);

    int addOrderBack(Orderback var1);

    int updateOrderBackSignOrReject(Orderback var1);

    int updateOrderRefund(Orderback var1);
}
