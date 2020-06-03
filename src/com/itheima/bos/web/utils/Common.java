package com.itheima.bos.web.utils;

import com.itheima.bos.web.pojo.DsMessage;
import com.itheima.bos.web.pojo.Staff;
import org.apache.shiro.SecurityUtils;

public class Common {
    /***
     * 公共消息方法
     */
    public static DsMessage publicMessage(){
        //添加至日志
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        String username = staff.getUsername();
        DsMessage dsMessage=new DsMessage();
        dsMessage.setMessageid(GetUUID.getUUID());
        dsMessage.setUsername(username);
        return dsMessage;
    }
}
