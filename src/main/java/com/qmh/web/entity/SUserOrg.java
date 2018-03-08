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
 * T_S_USER_ORG
 * 
 * @author bianj
 * @version 1.0.0 2018-01-20
 */
public class SUserOrg implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1239734360561917156L;

    /** id */
    private String id;

    /** 用户id */
    private String userId;

    /** 部门id */
    private String orgId;

    /**
     * 获取id
     * 
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     *          id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户id
     * 
     * @return 用户id
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 设置用户id
     * 
     * @param userId
     *          用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取部门id
     * 
     * @return 部门id
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * 设置部门id
     * 
     * @param orgId
     *          部门id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}