package com.qmh.web.dao;

import org.apache.ibatis.annotations.Param;

import com.qmh.web.entity.SUpdate;

public interface SUpdateMapper {
	

	SUpdate findSUpdateByCondition(@Param(value = "versionType") int versionType);
	
}