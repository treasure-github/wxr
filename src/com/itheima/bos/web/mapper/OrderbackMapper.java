package com.itheima.bos.web.mapper;


import com.itheima.bos.web.pojo.Orderback;
import com.itheima.bos.web.pojo.OrderbackExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderbackMapper {
    int countByExample(OrderbackExample var1);

    int deleteByExample(OrderbackExample var1);

    int deleteByPrimaryKey(String var1);

    int insert(Orderback var1);

    int insertSelective(Orderback var1);

    List<Orderback> selectByExample(OrderbackExample var1);

    Orderback selectByPrimaryKey(String var1);

    int updateByExampleSelective(@Param("record") Orderback var1, @Param("example") OrderbackExample var2);

    int updateByExample(@Param("record") Orderback var1, @Param("example") OrderbackExample var2);

    int updateByPrimaryKeySelective(Orderback var1);

    int updateByPrimaryKey(Orderback var1);
}
