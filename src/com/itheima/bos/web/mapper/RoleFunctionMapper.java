package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.RoleFunction;
import com.itheima.bos.web.pojo.RoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleFunctionMapper {
    int countByExample(RoleFunctionExample example);

    int deleteByExample(RoleFunctionExample example);

    int insert(RoleFunction record);

    int insertSelective(RoleFunction record);

    List<RoleFunction> selectByExample(RoleFunctionExample example);

    int updateByExampleSelective(@Param("record") RoleFunction record, @Param("example") RoleFunctionExample example);

    int updateByExample(@Param("record") RoleFunction record, @Param("example") RoleFunctionExample example);
}