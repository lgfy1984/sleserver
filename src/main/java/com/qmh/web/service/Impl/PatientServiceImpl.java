package com.qmh.web.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qmh.web.dao.SPatientDMapper;
import com.qmh.web.dao.SPatientMapper;
import com.qmh.web.entity.SPatient;
import com.qmh.web.entity.SPatientD;
import com.qmh.web.service.IPatientService;

@Service("patientService")
public class PatientServiceImpl implements IPatientService {

	@Resource
	private SPatientMapper patientMapper;
	@Resource
	private SPatientDMapper patientDMapper;
	
	public List<SPatient> searchById(String ptid,String newptid,String departid){
		return patientMapper.findSPatientByCondition(ptid,newptid,departid);
	}
	
	public List<SPatient> searchByQuery(String ptid,String newptid,String departid){
		return patientMapper.findSPatientByOrCondition(ptid,newptid,departid);
	}
	public List<SPatientD> getPatientD(String id,String order){
		return patientDMapper.findSPatientDByCondition(id,order);
	}
	
	
	public int save(SPatientD  sPatientD){
		return patientDMapper.insertSPatientD(sPatientD);
	}
	
	public int save(SPatient  sPatient){
		return patientMapper.insertSPatient(sPatient);
	}
	
	public int update(SPatientD  sPatientD){
		return patientDMapper.updateSPatientD(sPatientD);
	}
	
	public int update(SPatient  sPatient){
		return patientMapper.updateSPatient(sPatient);
	}
	
}