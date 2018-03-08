package com.qmh.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qmh.web.entity.SPatient;

public interface SPatientMapper {
	

	List<SPatient> findSPatientByCondition(@Param(value = "ptid") String ptid,@Param(value = "newptid") String newptid,@Param(value = "departid") String departid);
	

	List<SPatient> findSPatientByOrCondition(@Param(value = "ptid") String ptid,@Param(value = "newptid") String newptid,@Param(value = "departid") String departid);
     
	
	int insertSPatient(SPatient sPatient);
	
	int updateSPatient(SPatient sPatient);
	
}