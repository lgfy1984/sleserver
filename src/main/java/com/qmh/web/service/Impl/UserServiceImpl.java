package com.qmh.web.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qmh.web.dao.SUpdateMapper;
import com.qmh.web.dao.SUserMapper;
import com.qmh.web.entity.SUpdate;
import com.qmh.web.entity.SUser;
import com.qmh.web.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private SUserMapper userMapper;
	@Resource
	private SUpdateMapper updateMapper;
	
	public SUser searchById(String username,String password){
		return userMapper.findSUserByCondition(username,password,"","","","","");
	}
	
	@Transactional
	public SUpdate findSUpdateByCondition(int versionType) {
		// TODO Auto-generated method stub
		return updateMapper.findSUpdateByCondition(versionType);
	}
	
	@Transactional
	public int insert(SUser user) {
		return userMapper.insert(user);
	}
	
//	@Transactional
//	public int update(User user) {
//		return userMapper.updateByPrimaryKey(user);
//	}
	
	@Transactional
	public int delete(String id){
		return userMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	public SUser searchByIdPwd(String uid,String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.findSUserByCondition(username,password,"","","",uid,"");
	}

	@Transactional
	public int updateSUser(String uid, String password) {
		// TODO Auto-generated method stub
		return userMapper.updateSUser(uid, password,"");
	}
	
	
	
}