package com.qmh.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qmh.web.entity.SPatientD;

public interface SPatientDMapper {
	

	List<SPatientD> findSPatientDByCondition(@Param(value = "stptid") String id,@Param(value = "order") String order);
	
	int insertSPatientD(SPatientD sPatientD);
	
	int updateSPatientD(SPatientD sPatientD);
	
}