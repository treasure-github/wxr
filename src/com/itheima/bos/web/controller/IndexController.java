package com.itheima.bos.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.itheima.bos.web.VO.DataVo;
import com.itheima.bos.web.VO.MessagerData;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.AdminService;
import com.itheima.bos.web.service.IndexService;
import com.itheima.bos.web.utils.DateUtils;
import com.itheima.bos.web.utils.MD5Utils;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class IndexController {

    @Autowired
    IndexService indexService;
    @Autowired
    AdminService adminService;

    /**
     * 返回登录页面
     *
     * @param name
     * @param password
     * @param response
     * @return
     */
    @RequestMapping(value = "/login.action")
    public String login(String name, String password, HttpServletResponse response) {
        return "common/login";
    }

    @RequestMapping("/index.action")
    public String showAdvertisment(String username, String password, HttpServletRequest request, HttpServletResponse response){
        Staff loginUser = (Staff) SecurityUtils.getSubject().getSession().getAttribute("loginUser");
        //使用shiro框架提供的方式进行认证操作
        Subject subject = SecurityUtils.getSubject();//获得当前用户对象,状态为“未认证”
        AuthenticationToken token = new UsernamePasswordToken(username, MD5Utils.md5(password));//创建用户名密码令牌对象
        ModelAndView modelAndView = new ModelAndView();
        try {
            subject.login(token);
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            modelAndView.setViewName("common/login");
//            modelAndView.addObject("msg","用户名不存在");
//            return modelAndView;
            return "common/login";
        }
        Staff user = (Staff) subject.getPrincipal();

        if (loginUser != null && !user.getId().equals(loginUser.getId())) {
            modelAndView.setViewName("common/error");
            return "common/error";
        }
        request.getSession().setAttribute("loginUser", user);
        request.getSession().setAttribute("userName", user.getUsername());
        modelAndView.setViewName("common/home");
        return "common/home";
    }

    @RequestMapping("/home.action")
    public String showHome(String username, String password, HttpServletRequest request) {
        return "common/home";
    }

    /**
     * 显示收款排行页面
     */
    @RequestMapping("/page_common_collectionmoney.action")
    public String showCollectionmoney() {
        return "common/collectionmoney";
    }

    /**
     * 获得菜单
     */
    @RequestMapping("/getMenu.action")
    @ResponseBody
    public List<MenuList> getMenu() {
        //获得当前用户登录对象
        Staff user = (Staff) SecurityUtils.getSubject().getPrincipal();
        //如果当前用户登录对象是admin,则直接查询所有
        List<MenuList> list = null;
        if ("admin".equals(user.getId())) {
            list = indexService.findAllMenu();
        } else {
            list = indexService.findAllMenuById(user.getId());
        }
        return list;
    }

    /**
     * 获得所有菜单 授权用
     */
    @RequestMapping("/getAllMenu.action")
    @ResponseBody
    public List getAllMenu() {
        List list = indexService.findMenuTree();
        return list;
    }

    /**
     * @Description: <getRole 获取角色信息，授权用>
     * @Param null <描述>
     * @Return
     */
    @RequestMapping("/getRole.action")
    public @ResponseBody
    List getRole() {
        List role = indexService.getRole();
        return role;
    }

    /**
     * @Description: <给角色授权>
     * @Param rowData <选中的数据>
     * @Param role <角色id>
     * @Return java.lang.String
     */
    @RequestMapping("/rootManagement.action")
    public @ResponseBody
    String rootManagement(String rowData, String userID) {
        List checkData = JSON.parseArray(rowData);
        //先删除原有的权限
        indexService.deleteUserFunction(userID);
        //重新授权
        Map map = null;
        int size = checkData.size();
        for (int i = 0; i < size; i++) {
            map = (Map) checkData.get(i);
            indexService.insertUserFunction(map.get("id") + "", userID, map.get("name") + "");
        }
        return "200";
    }

    /**
     * @Description: <获取用户已有权限>
     * @Param roleId <用户id>
     * @Return java.util.List
     */
    @RequestMapping("/getUserFunctionId.action")
    public @ResponseBody
    List getRoleFunctionId(String userID) {
        List userFunctionId = indexService.getUserFunctionId(userID);
        return userFunctionId;
    }

    /**
     * 显示主页页面，
     */
    @RequestMapping("/page_common_home.action")
    public String showHome() {
        return "common/home";
    }

    /**
     * 退出系统
     */
    @RequestMapping("/admin_logout.action")
    public String logout() {
        SecurityUtils.getSubject().getSession().removeAttribute("loginUser");
        Staff user = (Staff) SecurityUtils.getSubject().getSession().getAttribute("loginUser");
        return "common/login";
    }

    /**
     * 修改密码
     */
    @RequestMapping("/staff_updateStaffPassword.action")
    @ResponseBody
    public Integer updateUpassword(String oldPassword, String password) {
        //获得当前登录对象，判断密码是否正确
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();

        if (!staff.getUpassword().equals(MD5Utils.md5(oldPassword))) {
            return -1;
        }
        Staff staff1 = new Staff();
        staff1.setId(staff.getId());
        staff1.setUpassword(MD5Utils.md5(password));
        int row = indexService.updateUpassword(staff1);
        return row;
    }

    /**
     * 显示个人信息选项卡
     */
    @RequestMapping("/staffSelfjsp.action")
    public String showSelfInfo() {
        return "common/selfinfo";
    }

    /**
     * 获得个人信息
     */
    @RequestMapping("/staffSelfInfo.action")
    @ResponseBody
    public Staff findSelfinfo() {
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        return staff;
    }


    /**
     * 获得所有员工当月总的销售金额
     */
    @RequestMapping("/index_findAllStaffShipmentNum.action")
    @ResponseBody
    public DataVo findAllStaffShipmentNum() {
        //获得当前月的第一天和最后一天
        String currMonthFirstDay = DateUtils.getCurrMonthFirstDay();
        String currMonthLastDay = DateUtils.getCurrMonthLastDay();
        DataVo dataVo = indexService.findAllStaffShipmentNum(currMonthFirstDay, currMonthLastDay);
        return dataVo;
    }

    /***
     * 显示员工页面
     */
    @RequestMapping("ody_base_mycustomer.action")
    public String showCustomer() {
        return "common/customer";
    }

    /**
     * 显示添加客户页面
     */
    @RequestMapping("/mgr_base_customerAdd.action")
    public String showCustomerAdd() {
        return "common/customeradd";
    }

    /**
     * 查询改用户下的员工
     */
    @RequestMapping("/common_findCustomerInfo.action")
    @ResponseBody
    public PageBean<Customer> findCustomerInfo(String q, Integer page, Integer rows) {
        PageBean<Customer> pageBean = new PageBean<Customer>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        pageBean.setRows(indexService.findCustomerInfo(pageBean, q));
        return pageBean;
    }

    /**
     * 添加客户
     */
    @RequestMapping("/index_addCustomerInfo.action")
    @ResponseBody
    public MessagerData addCustomerInfo(String p) {
        Customer customer = JSON.parseObject(p, Customer.class);
        MessagerData messagerData = new MessagerData();
        if (customer == null) {
            messagerData.setMessage("网络错误或者信息不完全");
            messagerData.setStatus(400);
            return messagerData;
        }
        //查询客户是否已经存在
        String phone = customer.getCustomerphone();
        int row = indexService.findCustomerisExist(phone);
        if (row == 1) {
            messagerData.setMessage("该客户已经存在。");
            messagerData.setStatus(400);
            return messagerData;
        }
        //客户不存在，添加客户
        int row1 = indexService.addCustomer(customer);

        if (row1 == 1) {
            //添加成功
            messagerData.setStatus(200);
            messagerData.setMessage("添加成功");
            return messagerData;
        } else {
            messagerData.setMessage("添加失败");
            messagerData.setStatus(400);
            return messagerData;
        }


    }

    @RequestMapping("/index_deleteCustomer.action")
    @ResponseBody
    public MessagerData deleteCustomer(String ids) {
        MessagerData messagerData = new MessagerData();
        if (ids == null || "".equals(ids.trim())) {
            messagerData.setStatus(400);
            messagerData.setMessage("删除失败，没有选中");
            return messagerData;
        }
        String[] id = ids.split(",");
        int row = indexService.deleteCustomer(id);
        if (row == 1) {
            messagerData.setMessage("删除成功!");
            messagerData.setStatus(200);
            return messagerData;
        } else {
            messagerData.setStatus(400);
            messagerData.setMessage("删除失败，没有选中");
            return messagerData;
        }
    }

    /**
     * 更新客户信息
     */
    @RequestMapping("/index_updateCustomer.action")
    @ResponseBody
    public MessagerData updateCustomerInfo(Customer customer) {
        MessagerData messagerData = new MessagerData();
        if (customer == null) {
            messagerData.setStatus(400);
            messagerData.setMessage("网络错误，请重试");
            return messagerData;
        }
        int rownum = indexService.updateCustomerInfo(customer);
        if (rownum == 1) {
            messagerData.setMessage("修改成功！");
        } else {
            messagerData.setMessage("修改失败！");
        }
        return messagerData;
    }

    /**
     * 通过内容，模糊搜索用户信息
     */
    @RequestMapping("/index_findCustomerInfoBySearch.action")
    @ResponseBody
    public Customer findCustomerInfoBySearch(String searchText) {
        if ("".equals(searchText.trim()) || null == searchText) {
            return null;
        }
        Customer customer = indexService.findCustomerInfoBySearch(searchText);
        return customer;
    }

    /**
     * 查询收款排行
     */
    @RequestMapping("/index_findAllCollectionMoney.action")
    @ResponseBody
    public DataVo findAllCollectionMoney() {
        //获得当前月的第一天和最后一天
        String currMonthFirstDay = DateUtils.getCurrMonthFirstDay();
        String currMonthLastDay = DateUtils.getCurrMonthLastDay();
        DataVo dataVo = indexService.findAllCollectionMoney(currMonthFirstDay, currMonthLastDay);
        return dataVo;
    }

    /**
     * 获得类别销量排行
     */
    @RequestMapping("/index_findTypeRank.action")
    @ResponseBody
    public DataVo findTypeRank(String type) {
        //获得当前的时间
        String currentDate = DateUtils.getCrudate();
        String beginDate = getBeginDate(type);
        DataVo dataVo = indexService.findTypeRank(beginDate, currentDate);
        return dataVo;

    }

    /**
     * 查看电热排行
     */
    @RequestMapping("/index_findDRtypenonameRank.action")
    @ResponseBody
    public DataVo findDRtypenonameRank(String type) {
        //获得当前的时间
        String currentDate = DateUtils.getCrudate();
        String beginDate = getBeginDate(type);
        DataVo dataVo = indexService.findDRtypenonameRank(beginDate, currentDate);
        return dataVo;
    }

    public String getBeginDate(String type) {
        String beginDate = "";
        if (null == type || "".equals(type.trim()) || type.equals("4")) {
            //查询最近一个月的销量
            beginDate = DateUtils.getLastMonth();
        } else if (type.equals("3")) {
            //查询最近三个月的销量
            beginDate = DateUtils.getRecentThreeMonth();
        } else if (type.equals("2")) {
            //查询最近半年的销量
            beginDate = DateUtils.getRecentSixMonth();
        } else if (type.equals("1")) {
            //查询最近一年的销量
            beginDate = DateUtils.getRecentLastYear();
        }
        return beginDate;
    }
}
