package com.itheima.bos.web.controller;

import com.alibaba.fastjson.JSON;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.AdminService;
import com.itheima.bos.web.utils.GetUUID;
import com.itheima.bos.web.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
	/**
	 * 显示角色设置页面
	 * @return
	 */
	@RequestMapping("/adm_role_rolemanager.action")
	public String roleManger(){
		return "admin/role";
	}
	@RequestMapping("page_permission_manager.action")
	public String permissionManger(){
		return "admin/function";
	}
    /**
     * 跳转添加员工页面
     */
    @RequestMapping("/mgr_base_staffadd.action")
    public String showStaffAdd(){
        return "manager/staffadd";
    }

    /**
     * 获得所有角色名字
     * @return
     */
    @RequestMapping("/adminController_rolelist.action")
    @ResponseBody
    public List<AuthRole> findAllRole(){
        List<AuthRole> list = adminService.findAllRole();
        return list;
    }
    /**
     * 添加一个员工
     */
    @RequestMapping("/admin_addstaff.action")
    public String saveStaff(Staff staff,String[] roleids, Model model){
        //初始化员工的密码，为12345678
        staff.setUpassword(MD5Utils.md5("12345678"));
       int row = adminService.saveStaff(staff,roleids);
        model.addAttribute("status",row);
        return "manager/staffinfo";
    }
    /**
     * 查询所用用户信息
     */
    @RequestMapping("/mgr_base_findstaffinfo.action")
    @ResponseBody
    public List<Staff> findAllStaffInfo(){
        List<Staff>  list = adminService.findAllStaffInfo();
        for (int i = 0; i < list.size(); i++) {
			if("admin".equals(list.get(i).getId())){
				list.remove(i);
				break;
			}
		}
        return list;
    }
    /**
     * 更新员工信息
     */
    @RequestMapping("/admin_updatestaff.action")
    public ModelAndView updateStaff(String data){
        Staff staff = JSON.parseObject(data,Staff.class);
        System.out.println(staff.toString());
        int row = adminService.updateStaff(staff);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",row);
        modelAndView.setViewName("manager/staffinfo");
        return modelAndView;

    }
    /**
     *删除员工
     *
     */
    @RequestMapping("/admin_base_deletestaff.action")
    public String deletestaff(String ids){
        int row = 0;
        if (null != ids){
            String[] split = ids.split(",");
            row = adminService.deletestaff(split);
        }
        return "manager/staffinfo";
    }
    /**
     * 重置员工密码
     */
    @RequestMapping("/admin_base_restpassword.action")
    public String restpassword(String ids,Model model){

        if(ids!=null){
            String[] split = ids.split(",");
            int row ;
            row = adminService.restpassword(split);
            //
            model.addAttribute("status",row);
        }
        return "manager/staffinfo";

    }
    /**
     * 显示添加角色页面
     */
    @RequestMapping("/admin_showAddRole.action")
    public String showAddRole(){
        return "admin/role_add";
    }
    /**
     * 通过ztree获得权限id，添加角色时，同时添加权限。
     */
    @RequestMapping("/admin_addRole.action")
    @ResponseBody
    public Integer addRole(String p){
        //将角色json用ReciveRole接收
        ReciveRole reciveRole = JSON.parseObject(p, ReciveRole.class);
        //返回页面信息。
        int row = 0;
        //判断传送过来的值是否合理，不合理，则进行返回错误信息。
        if(reciveRole.getFunctionIds() != null && !"".equals(reciveRole.getFunctionIds().trim())){
            String[] split = reciveRole.getFunctionIds().split(",");
            //创建一个角色对象，
            AuthRole role = new AuthRole();
            //初始化角色的值
            role.setRoleid(GetUUID.getUUID());
            role.setRolename(reciveRole.getName());
            role.setDescription(reciveRole.getDescription());
            row = adminService.addRole(split,role);

        }
            return row;


    }
    /**
     * 删除角色信息
     */
    @RequestMapping("/admin_deleteRole.action")
    @ResponseBody
    public Integer deleteRole(String ids){
        int row = 0;
        if(ids != null){
            String[] split = ids.split(",");
            row = adminService.deleteRole(split);

        }
        return row;
    }
    /**
     * 校验工号是否存在
     */
    @RequestMapping("/admin_checkUserIsExist.action")
    @ResponseBody
    public Integer checkUserIsExist(String id){
        int row = adminService.checkUserIsExist(id);
        return row;
    }
    /**
     * 显示操作记录页面
     */
    @RequestMapping("/admin_showoperation.action")
    public String showoperation(){
        return "admin/operationrecord";
    }
    /**
     *
     */
    @RequestMapping("/admin_operationrecord.action")
    @ResponseBody
    public PageBean<Operationrecord> operationrecord(String q,Integer page, Integer rows){
        PageBean<Operationrecord> pageBean = new PageBean<Operationrecord>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        //获得当月的数据
        List<Operationrecord> list = adminService.operationrecord(pageBean, q);
        pageBean.setRows(list);
        return pageBean;
    }

	

}
