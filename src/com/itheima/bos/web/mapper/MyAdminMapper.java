package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.AuthRole;
import com.itheima.bos.web.pojo.Operationrecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyAdminMapper {
    List<AuthRole> findStaffRole(String id);

    int insertOneRole(String roleid, String id);

    int addFunctionRoleByRoleId(String roleid, String functionid);

    List<Operationrecord> operationrecord(Integer beginIndex, Integer pageSize,  @Param("q")String q);
}
