package com.qmh.web.entity;
/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.0
 */

/**
 * InnoDB free: 587776 kB; (`userid`) REFER `jeecg/t_s_user`(`i(T_S_ROLE_USER)
 * 
 * @author bianj
 * @version 1.0.0 2018-01-20
 */
public class SRoleUser implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -65911871473415439L;

    /** ID */
    private String id;

    /** 角色ID */
    private String roleid;

    /** 用户ID */
    private String userid;

    /**
     * 获取ID
     * 
     * @return ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置ID
     * 
     * @param id
     *          ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取角色ID
     * 
     * @return 角色ID
     */
    public String getRoleid() {
        return this.roleid;
    }

    /**
     * 设置角色ID
     * 
     * @param roleid
     *          角色ID
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取用户ID
     * 
     * @return 用户ID
     */
    public String getUserid() {
        return this.userid;
    }

    /**
     * 设置用户ID
     * 
     * @param userid
     *          用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
}