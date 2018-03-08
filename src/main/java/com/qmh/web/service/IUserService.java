package com.qmh.web.service;
import com.qmh.web.entity.SUpdate;
import com.qmh.web.entity.SUser;

public interface IUserService {

	SUser searchById(String username,String password);

	SUpdate findSUpdateByCondition(int versionType);
	
	SUser searchByIdPwd(String uid,String username,String password);
	
//	Page search(Page pager);
	
	int insert(SUser user);
	
	int updateSUser(String uid,String password);

//	int update(User user);
	
	int delete(String id);
	
}