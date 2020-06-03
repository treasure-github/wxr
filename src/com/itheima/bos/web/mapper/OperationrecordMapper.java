package com.itheima.bos.web.mapper;



import com.itheima.bos.web.pojo.Operationrecord;
import com.itheima.bos.web.pojo.OperationrecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperationrecordMapper {
    int countByExample(OperationrecordExample example);

    int deleteByExample(OperationrecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Operationrecord record);

    int insertSelective(Operationrecord record);

    List<Operationrecord> selectByExample(OperationrecordExample example);

    Operationrecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Operationrecord record, @Param("example") OperationrecordExample example);

    int updateByExample(@Param("record") Operationrecord record, @Param("example") OperationrecordExample example);

    int updateByPrimaryKeySelective(Operationrecord record);

    int updateByPrimaryKey(Operationrecord record);
}