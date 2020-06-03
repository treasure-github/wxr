package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.AuthRole;
import com.itheima.bos.web.pojo.AuthRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthRoleMapper {
    int countByExample(AuthRoleExample example);

    int deleteByExample(AuthRoleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(AuthRole record);

    int insertSelective(AuthRole record);

    List<AuthRole> selectByExample(AuthRoleExample example);

    AuthRole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByExample(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKey(AuthRole record);
}