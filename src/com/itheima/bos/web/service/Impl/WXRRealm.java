package com.itheima.bos.web.service.Impl;

import java.util.List;

import com.itheima.bos.web.mapper.AuthFunctionMapper;
import com.itheima.bos.web.mapper.MyStaffMapper;
import com.itheima.bos.web.pojo.AuthFunction;
import com.itheima.bos.web.pojo.Staff;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class WXRRealm extends AuthorizingRealm{
	@Autowired
	private MyStaffMapper myStaffMapper;
	@Autowired
	private AuthFunctionMapper authFunctionMapper;
	
	//认证方法
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("自定义的realm中认证方法执行了。。。。");
		UsernamePasswordToken passwordToken = (UsernamePasswordToken)token;
		System.out.println("passwordToken :"+passwordToken);
		//获得页面输入的用户名
		String username = passwordToken.getUsername();
		System.out.println("username :"+username);

		//根据用户名查询数据库中的密码
		Staff user = myStaffMapper.findUserByUsername(username);
		System.out.println("user :"+user);

		if(user == null){
			//页面输入的用户名不存在
			throw new UnknownAccountException();
		}
		//简单认证信息对象
		AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getUpassword(), this.getName());
		//框架负责比对数据库中的密码和页面输入的密码是否一致
		return info;
	}

	//授权方法
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//获取当前登录用户对象
		Staff user = (Staff) SecurityUtils.getSubject().getPrincipal();
		//User user2 = (User) principals.getPrimaryPrincipal();
		// 根据当前登录用户查询数据库，获取实际对应的权限
		
		if(user.getId().equals("admin")||user.getId().equals("9718")||user.getId().equals("97008")){
		
			//超级管理员内置用户，查询所有权限数据
			info.addStringPermission("delete-inputrecord");
			info.addStringPermission("delete-showkucun");
		}
		if(user.getId().equals("admin")){
			info.addStringPermission("show-cost");
		}

		return info;
	}
}
