package com.itheima.bos.web.service;

import com.itheima.bos.web.VO.PDDVO;
import com.itheima.bos.web.pojo.DsPddorder;

import java.util.List;

public interface PDDService {
    List<DsPddorder> findAllPddorde(String storeId, String crudateBegin, String crudateEnd);

    int findPddorderById(String ordersid);

    int savePddOrder(DsPddorder dsPddorder);

    void deletePddOrder(String[] split);

    int updateInputPddOrder(DsPddorder dsPddorder);

    List<DsPddorder> findAllShuaDanPddorder(String storeId, String beginTime, String endTime);
}
