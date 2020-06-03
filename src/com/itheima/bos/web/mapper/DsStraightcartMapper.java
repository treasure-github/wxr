package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.DsStraightcart;
import com.itheima.bos.web.pojo.DsStraightcartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DsStraightcartMapper {
    int countByExample(DsStraightcartExample example);

    int deleteByExample(DsStraightcartExample example);

    int insert(DsStraightcart record);

    int insertSelective(DsStraightcart record);

    List<DsStraightcart> selectByExample(DsStraightcartExample example);

    int updateByExampleSelective(@Param("record") DsStraightcart record, @Param("example") DsStraightcartExample example);

    int updateByExample(@Param("record") DsStraightcart record, @Param("example") DsStraightcartExample example);
}