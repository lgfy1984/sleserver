package com.qmh.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qmh.web.entity.SUser;
import com.qmh.web.entity.User;

public interface SUserMapper {
	
    int deleteByPrimaryKey(@Param(value="id")String id);

    int insert(SUser user);

    SUser findSUserByCondition(@Param(value = "username") String username,
    		@Param(value = "password") String password,   
            @Param(value = "realname") String realname,   
            @Param(value = "status") String status,  
            @Param(value = "userkey") String userkey,  
            @Param(value = "id") String id ,  
            @Param(value = "departid") String departid  
            );
     
    List<User> selectAll();
    
    int updateSUser(
            @Param(value = "id") String id , 
    		@Param(value = "password") String password , 
            @Param(value = "username") String username);
	
}