package com.qmh.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.qmh.util.PasswordUtil;
import com.qmh.web.entity.SUpdate;
import com.qmh.web.entity.SUser;
import com.qmh.web.service.IUserService;


/**
 * TODO
 * <p>Title: UserController.java</p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company: Tianjian</p>
 * <p>team: TianjianTeam</p>
 * @author: LengJiong
 * @date 2018年1月22日下午9:43:34
 * @version 1.0 
 */
@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	/**
	 * 跳转到用户管理模块
	 */
	@RequestMapping("toUserManager")
	public String toUserManager(){
		return "jsp/user/userManager";
	}

	@RequestMapping("login")
	public String login(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		if ("1".equals(name) && "1".equals(pwd)) {
			request.getSession().setAttribute("userName", name);
			return "ok";
		}else{
			return "error";
		}
		
	}
	
	@RequestMapping("logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException{
		request.getSession().setAttribute("userName", null);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(JSON.toJSONString("{msg:true}"));
		out.flush();
		out.close();
	}
	
	/**
	 * 获取用户列表
	 */
	@RequestMapping("/session")
	public void getJson(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
//		List<Tuser> list = userService.getAllUser();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		password = PasswordUtil.encrypt(username, password, PasswordUtil.getStaticSalt());
		SUser suser = userService.searchById(username,password);
		
		response.setContentType("application/json;charset=utf-8");
		if(suser==null){
			response.setStatus(401);
		}
		PrintWriter out = response.getWriter();
		if(suser!=null){
		  out.println(JSON.toJSONString(suser));
		}
		out.flush();
		out.close();
	}
	
	/**
	 * 修改密码
	 */
	@RequestMapping("/modifypwd")
	public void modifypwd(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
//		List<Tuser> list = userService.getAllUser();
		String uid = request.getParameter("uid");
		String username = request.getParameter("username");
		String pwdold = request.getParameter("pwdold");
		String pwdnew = request.getParameter("pwdnew");
		pwdold = PasswordUtil.encrypt(username, pwdold, PasswordUtil.getStaticSalt());
		pwdnew = PasswordUtil.encrypt(username, pwdnew, PasswordUtil.getStaticSalt());
		SUser suser = userService.searchByIdPwd(uid,username,pwdold);
		int temp= 0;
		if(suser!=null){
			suser.setPassword(pwdnew);
			temp = userService.updateSUser(uid, pwdnew);
		}else{
			temp=2;
		}
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(JSON.toJSONString(temp));
		out.flush();
		out.close();
	}

	
	/**
	 * 版本更新
	 */
	@RequestMapping("/app_version/new/android")
	public void updateVersion(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		SUpdate sUpdate = userService.findSUpdateByCondition(1);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(sUpdate!=null){
			out.println(JSON.toJSONString(sUpdate));
		}
		out.flush();
		out.close();
	}
}
