package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.AuthFunction;
import com.itheima.bos.web.pojo.AuthFunctionExample;
import java.util.List;

import com.itheima.bos.web.pojo.MenuList;
import org.apache.ibatis.annotations.Param;

public interface AuthFunctionMapper {
    int countByExample(AuthFunctionExample example);

    int deleteByExample(AuthFunctionExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthFunction record);

    int insertSelective(AuthFunction record);

    List<MenuList> selectByExample();

    List findMenuTree();

    List getRole();

    void deleteUserFunction(@Param("userID") String userID);

    List getUserFunctionId(@Param("userID") String userID);

    int insertUserPermission(@Param("userID") String userID,@Param("functionId")String functionId,@Param("functionName") String functionName);

    AuthFunction selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthFunction record, @Param("example") AuthFunctionExample example);

    int updateByExample(@Param("record") AuthFunction record, @Param("example") AuthFunctionExample example);

    int updateByPrimaryKeySelective(AuthFunction record);

    int updateByPrimaryKey(AuthFunction record);
}