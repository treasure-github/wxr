package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Inputrecord;
import com.itheima.bos.web.pojo.InputrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InputrecordMapper {
    int countByExample(InputrecordExample example);
    int countByExample2(@Param("keyWords") String keyWords);

    int deleteByExample(InputrecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Inputrecord record);

    int insertSelective(Inputrecord record);

    List<Inputrecord> selectByExample(InputrecordExample example);

    Inputrecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Inputrecord record, @Param("example") InputrecordExample example);

    int updateByExample(@Param("record") Inputrecord record, @Param("example") InputrecordExample example);

    int updateByPrimaryKeySelective(Inputrecord record);

    int updateByPrimaryKey(Inputrecord record);
}