package com.qmh.web.service;
import java.util.List;

import com.qmh.web.entity.SPatient;
import com.qmh.web.entity.SPatientD;

public interface IPatientService {

	List<SPatient> searchById(String pid,String newptid,String departid);
	

	List<SPatient> searchByQuery(String pid,String newptid,String departid);


	List<SPatientD> getPatientD(String id,String order);
	
	int save(SPatientD  sPatientD);
	
	int save(SPatient  sPatient);
	
	int update(SPatientD  sPatientD);
	
	int update(SPatient  sPatient);
}