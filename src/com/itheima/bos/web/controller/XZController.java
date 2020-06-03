package com.itheima.bos.web.controller;

import com.alibaba.fastjson.JSON;
import com.itheima.bos.web.pojo.Application;
import com.itheima.bos.web.service.XZService;
import com.itheima.bos.web.utils.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class XZController {
    @Autowired
    XZService xzService;

    /**
     * 应聘人员
     */
    @RequestMapping("/xz_base_applicationinfo.action")
    public String applicationMan(){
        return "xingzheng/applicationman";
    }

    /**
     * 查看所有应聘人员的信息
     */
    @RequestMapping("/xz_findAllInfo.action")
    @ResponseBody
    public List<Application> findAllInfo(){
        List<Application> list = xzService.findAllInfo();
        return list;
    }
    /**
     * 删除应聘人员的信息
     */
    @RequestMapping("/xz_deleteApplication.action")
    public String  deleteApplicationById(String ids, Model model){
        String[] split = ids.split(",");
        int row = xzService.deleteApplicationById(split);
        model.addAttribute("status",row);
        return "xingzheng/applicationman";
    }
    /**
     * 添加应聘人员的信息
     */
    @RequestMapping("/xz_application.action")
    public String  saveAppliction(String row , Model model){
//        try {
//            row = new String(row.getBytes("ISO-8859-1"),"UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        Application application = JSON.parseObject(row, Application.class);
        application.setId(GetUUID.getUUID());
        int resrow = xzService.saveApplication(application);
        model.addAttribute("status",resrow);
        return "xingzheng/applicationman";
    }



}
