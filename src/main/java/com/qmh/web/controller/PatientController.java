package com.qmh.web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qmh.util.JSONHelper;
import com.qmh.web.entity.SPatient;
import com.qmh.web.entity.SPatientD;
import com.qmh.web.service.IPatientService;

/**
 * TODO
 * <p>Title: PatientController.java</p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company: Tianjian</p>
 * <p>team: TianjianTeam</p>
 * @author: LengJiong
 * @date 2018年1月22日下午9:43:00
 * @version 1.0 
 */
@Controller
public class PatientController {

	@Autowired
	private IPatientService patientService;
	
	/**
	 * 获取用户列表
	 */
	@RequestMapping("/patient")
	public void getJson(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String ptid = "";
		String newptid = "";
		String departid = request.getParameter("departid");
		
		List<SPatient>  patientl = patientService.searchById(ptid,newptid,departid);
		
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(JSONHelper.toJSONString(patientl));
		out.flush();
		out.close();
	}/**
	 * 搜索病人列表
	 */
	@RequestMapping("/searchpatients")
	public void searchPatient(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String query = request.getParameter("query");
		String departid = request.getParameter("departid");
		
		List<SPatient>  patientl = patientService.searchByQuery(query,query,departid);
		
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(JSONHelper.toJSONString(patientl));
		out.flush();
		out.close();
	}
	/**
	 * 获取用户详细列表
	 */
	@RequestMapping("/getpatientd")
	public void getPatientd(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String id = request.getParameter("id");
		String order = request.getParameter("order");
		List<SPatientD>  patiendl = patientService.getPatientD(id,order);
		
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(JSONHelper.toJSONString(patiendl));
		out.flush();
		out.close();
	}
	/**
	 * 保存明细信息
	 */
	@RequestMapping("/putpatientd")
	public void putpatientd(@RequestBody SPatientD sPatientD, HttpServletResponse response)
			throws IOException {

		System.out.println("-------putpatientd------dddddddddd----");

		int  flag = 0;
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(sPatientD!=null && !sPatientD.equals(null)){
		
		   flag = patientService.save(sPatientD);
		   out.println(JSONHelper.toJSONString(flag));
		}
		
		
		out.flush();
		out.close();
	}
	/**
	 * 保存基本信息
	 */
	@RequestMapping("/putpatient")
	public void putpatient(@RequestBody SPatient sPatient, HttpServletResponse response)
			throws IOException {

		System.out.println("-------putpatient------11111111111----");

		//int  flag = 0;
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		List<SPatient>  patientl = patientService.searchById(sPatient.getPtid(),sPatient.getNewptid(),sPatient.getDepartid());
		if(patientl!=null && patientl.size()>0){
			SPatient sPatientdb = patientl.get(0);
			if(sPatient.getBirthday()!=null) sPatientdb.setBirthday(sPatient.getBirthday());
			if(sPatient.getSexId()!=null && !sPatient.getSexId().equals("")) sPatientdb.setSexId(sPatient.getSexId());
			if(sPatient.getCountryId()!=null && !sPatient.getCountryId().equals("")) sPatientdb.setCountryId(sPatient.getCountryId());
			out.println(JSONHelper.toJSONString(sPatientdb));
		   
		}else{
			if(sPatient!=null && !sPatient.equals(null)){
				   patientService.save(sPatient);
				   out.println(JSONHelper.toJSONString(sPatient));
			 }
		}
		
		out.flush();
		out.close();
	}
	/**
	 * 更新明细信息
	 */
	@RequestMapping("/updatepatientd")
	public void updatepatientd(@RequestBody SPatientD sPatientD, HttpServletResponse response)
			throws IOException {

		System.out.println("-------updatepatientd------ddddddddd----");

		int  flag = 0;
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(sPatientD!=null && !sPatientD.equals(null)){
		
		   flag = patientService.update(sPatientD);
		   out.println(JSONHelper.toJSONString(flag));
		}
		
		
		out.flush();
		out.close();
	}
	/**
	 * 更新基本信息
	 */
	@RequestMapping("/updatepatient")
	public void updatepatient(@RequestBody SPatient sPatient, HttpServletResponse response)
			throws IOException {

		System.out.println("-------updatepatient------u----");

		int  flag = 0;
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(sPatient!=null && !sPatient.equals(null)){
		
		   flag = patientService.update(sPatient);
		   out.println(JSONHelper.toJSONString(flag));
		}
		
		
		out.flush();
		out.close();
	}

}
