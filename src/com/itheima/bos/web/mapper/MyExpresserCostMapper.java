package com.itheima.bos.web.mapper;

import java.math.BigDecimal;

public interface MyExpresserCostMapper {
    BigDecimal findExpressCost(String shengfen, String kuaidi);
    BigDecimal findModelCost(String xinghao);
}
