package com.itheima.bos.web.service;

import com.itheima.bos.web.pojo.AuthRole;
import com.itheima.bos.web.pojo.Operationrecord;
import com.itheima.bos.web.pojo.PageBean;
import com.itheima.bos.web.pojo.Staff;

import java.util.List;

public interface AdminService {
    List<AuthRole> findAllRole();

    int saveStaff(Staff staff,String[] roleids);

    List<Staff> findAllStaffInfo();

    int updateStaff(Staff staff);

    int restpassword(String[] split);

    int addRole(String[] split, AuthRole role);

    int deleteRole(String[] split);

    int checkUserIsExist(String id);
    int deletestaff(String[] ids);

    List<Operationrecord> operationrecord(PageBean<Operationrecord> pageBean, String q);

    int insertOperationRecord(Operationrecord operationrecord);
}
