package com.itheima.bos.web.mapper;

import com.itheima.bos.web.VO.ProfitVo;
import com.itheima.bos.web.VO.VoOrderBack;
import com.itheima.bos.web.pojo.*;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyDianShangMapper {

    List<Operationrecord> operationrecord(Integer beginIndex, Integer pageSize, @Param("q") String q);

    List<ProfitVo> findLiRunByQ(String storeid, String profittime, String endTime);

    DsStraightcart findStraightCartNumByStoreId(String storeid, String profittime, String endtime);

    List<ProfitVo> findLiRunByQAndPDD(String storeid, String tmpProfittime, String endtime);

    List<DsTborder> findAllTBorder(String storeId, String crudateBegin, String crudateEnd);

    int updateStraightNum(String storeId, String crudateBegin, String crudateEnd, double num);

    DsStraightcart checkStraight(String storeId, String crudateBegin, String crudateEnd);

    List<DsPddorder> findAllPddorde(String storeId, String crudateBegin, String crudateEnd);

    List<DsTborder> countShuaDanCost(String storeId, String crudateBegin, String crudateEnd);

    List<DsTborder> findAllShuaDanTBorder(@Param("storeId") String storeId,@Param("crudateBegin") String crudateBegin,@Param("crudateEnd") String crudateEnd);

    List<DsPddorder> findAllShuaDanPddorder(String storeId, String beginTime, String endTime);

    List<Orderback> findOrderBackInfo(VoOrderBack var1);
}
