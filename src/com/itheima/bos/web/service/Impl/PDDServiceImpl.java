package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.VO.PDDVO;
import com.itheima.bos.web.mapper.DsPddorderMapper;
import com.itheima.bos.web.mapper.MyDianShangMapper;
import com.itheima.bos.web.pojo.DsPddorder;
import com.itheima.bos.web.pojo.DsPddorderExample;
import com.itheima.bos.web.pojo.DsTborder;
import com.itheima.bos.web.pojo.DsTborderExample;
import com.itheima.bos.web.service.PDDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PDDServiceImpl implements PDDService {

    @Autowired
    MyDianShangMapper myDianShangMapper;
    @Autowired
    DsPddorderMapper dsPddorderMapper;
    /**
     * 显示淘宝订单
     * @param storeId
     * @param crudateBegin
     * @param crudateEnd
     * @return
     */
    public List<DsPddorder> findAllPddorde(String storeId, String crudateBegin, String crudateEnd) {
        List<DsPddorder> list = myDianShangMapper.findAllPddorde(storeId,crudateBegin,crudateEnd);
        return list;
    }

    @Override
    public int findPddorderById(String ordersid) {
            DsPddorderExample example = new DsPddorderExample();
        DsPddorderExample.Criteria criteria = example.createCriteria();
            criteria.andOrderidEqualTo(ordersid);
            List<DsPddorder> dsTborderList = dsPddorderMapper.selectByExample(example);
            if(dsTborderList.size()>0){
                return 1;
            }
        return 0;
    }

    @Override
    public int savePddOrder(DsPddorder dsPddorder) {
        int insert = dsPddorderMapper.insert(dsPddorder);
        return insert;
    }

    /**
     * 删除拼多多订单
     * @param split
     */
    public void deletePddOrder(String[] split) {
        for (String s : split) {
            dsPddorderMapper.deleteByPrimaryKey(s);
        }

    }

    /**
     * 修改拼多多订单信息
     * @param dsPddorder
     * @return
     */
    public int updateInputPddOrder(DsPddorder dsPddorder) {
        int i = dsPddorderMapper.updateByPrimaryKey(dsPddorder);
        return i;
    }

    /**
     * 查询所有刷单信息
     * @param storeId
     * @param beginTime
     * @param endTime
     * @return
     */
    public List<DsPddorder> findAllShuaDanPddorder(String storeId, String beginTime, String endTime) {
        List<DsPddorder> list = myDianShangMapper.findAllShuaDanPddorder(storeId,beginTime,endTime);
        return list;
    }
}
