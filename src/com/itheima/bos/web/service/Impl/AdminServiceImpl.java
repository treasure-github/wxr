package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.mapper.*;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.AdminService;
import com.itheima.bos.web.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class
AdminServiceImpl implements AdminService {
    @Autowired
    AuthRoleMapper authRoleMapper;
    @Autowired
    StaffMapper staffMapper;
    @Autowired
    MyAdminMapper myAdminMapper;
    @Autowired
    UserRoleMapper userRoleMapper;
    @Autowired
    RoleFunctionMapper roleFunctionMapper;
    @Autowired
    OperationrecordMapper operationrecordMapper;


    /**
     * 获得所有角色名字
     * @return
     */
    public List<AuthRole> findAllRole() {
        AuthRoleExample example = new AuthRoleExample();
        List<AuthRole> list = authRoleMapper.selectByExample(example);
        return list;
    }

    /**
     * 添加一个员工
     * @param staff
     * @return
     */
    public int saveStaff(Staff staff,String[] roleids) {
        int i = staffMapper.insert(staff);
        //同时添加一个角色关系表
        for (String roleid : roleids) {
            UserRole userRole = new UserRole();
            userRole.setUserId(staff.getId());
            userRole.setRoleId(roleid);
            i = userRoleMapper.insert(userRole);
        }
        return i;
    }

    /**
     * 获得所有员工信息
     * @return
     */
    public List<Staff> findAllStaffInfo() {
        StaffExample example = new StaffExample();
        List<Staff> list = staffMapper.selectByExample(example);
        for (int i = 0 ;i<list.size() ; i++) {
            //查询该用户是什么角色
            List<AuthRole> roleList = myAdminMapper.findStaffRole(list.get(i).getId());
            String[] roleids = new String[roleList.size()];
            for (int j = 0; j <roleList.size() ; j++) {
                if(j == 0){
                    list.get(i).setRolename(roleList.get(j).getRolename());
                }else {
                    list.get(i).setRolename(list.get(i).getRolename()+","+roleList.get(j).getRolename());
                }
                roleids[j]=roleList.get(j).getRoleid();

            }
            //给用户添加角色id，方便编辑页面时后回显
            list.get(i).setRoleids(roleids);

        }
        return list;
    }

    /**
     * 更新业务员的信息
     * @param staff
     * @return
     */
    public int updateStaff(Staff staff) {
        //更新用户的权限列表
        String[] roleids = staff.getRoleids();
        //将原来表中所有的数据进行删除
        UserRoleExample example = new UserRoleExample();
        example.createCriteria().andUserIdEqualTo(staff.getId());
        int row = userRoleMapper.deleteByExample(example);
        if(null != roleids){
        	for (String roleid : roleids) {
        	    //TODO 表关联问题无法插入 mgr_base_staffinfo
        		row = myAdminMapper.insertOneRole(roleid,staff.getId());
        	}
        }
        //成功添加数据，更新其他数据
        row = staffMapper.updateByPrimaryKeySelective(staff);
        return row;
    }

    /**
     * 重置用户密码
     * @param split
     * @return
     */
    public int restpassword(String[] split) {
        int row = 1;
        for (String s : split) {
            Staff staff = new Staff();
            staff.setId(s);
            staff.setUpassword(MD5Utils.md5("12345678"));
            row = staffMapper.updateByPrimaryKeySelective(staff);

        }
        return row;
    }

    /**
     * 添加角色
     * @param functionids
     * @param role
     * @return
     */
    public int addRole(String[] functionids, AuthRole role) {
        //默认添加成功
        int row = 1;
        //添加角色
        row = authRoleMapper.insert(role);
        for (String functionid : functionids) {
            row = myAdminMapper.addFunctionRoleByRoleId(role.getRoleid(),functionid);
        }
        return row;
    }

    /**
     * 删除角色
     * @param split
     * @return
     */
    public int deleteRole(String[] split) {
        int row = 0;
        for (String s : split) {
            //删除角色，删除角色和用户的关联表，删除角色和权限的关联表信息
            UserRoleExample example = new UserRoleExample();
            UserRoleExample.Criteria criteria = example.createCriteria();
            criteria.andRoleIdEqualTo(s);
            //删除用户角色关系表数据
            row = userRoleMapper.deleteByExample(example);
            //删除权限角色关系表数据
            RoleFunctionExample example1 = new RoleFunctionExample();
            RoleFunctionExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andRoleIdEqualTo(s);
            row = roleFunctionMapper.deleteByExample(example1);
            //删除角色。
            row = authRoleMapper.deleteByPrimaryKey(s);
        }
        return row;
    }

    /**
     * 检验工号是否存在
     */
    public int checkUserIsExist(String id) {
        Staff staff = staffMapper.selectByPrimaryKey(id);
        if(null != staff){
            return 1;
        }
        return 0;
    }

    /**
     * 删除员工信息
     * @param ids
     * @return
     */
    public int deletestaff(String[] ids) {
        int row = 0;
        for (String id : ids) {
            //删除员工的角色关系
            UserRoleExample example = new UserRoleExample();
            UserRoleExample.Criteria criteria = example.createCriteria();
            criteria.andUserIdEqualTo(id);
            row = userRoleMapper.deleteByExample(example);
            row = staffMapper.deleteByPrimaryKey(id);
        }
        return row;
    }

    @Override
    public List<Operationrecord> operationrecord(PageBean<Operationrecord> pageBean, String q) {
        if(null != q &&!"".equals(q.trim())){
            q = q.trim();
        }
        if(null != q && "".equals(q.trim())){
            q=null;
        }
        List<Operationrecord> list = myAdminMapper.operationrecord(pageBean.getBeginIndex(),pageBean.getPageSize(),q);
        //查询总记录数
        OperationrecordExample example = new OperationrecordExample();
        int row = operationrecordMapper.countByExample(example);
        pageBean.setTotal(row);
        return list;
    }


    public int insertOperationRecord(Operationrecord operationrecord) {
        //TODO 插入报错
        return  operationrecordMapper.insertSelective(operationrecord);
    }
}
