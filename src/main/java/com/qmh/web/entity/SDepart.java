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
 * T_S_DEPART
 * 
 * @author bianj
 * @version 1.0.0 2018-01-20
 */
public class SDepart implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3378970073904398785L;

    /** ID */
    private String id;

    /** 部门名称 */
    private String departname;

    /** 描述 */
    private String description;

    /** 父部门ID */
    private String parentdepartid;

    /** 机构编码 */
    private String orgCode;

    /** 机构类型 */
    private String orgType;

    /** 手机号 */
    private String mobile;

    /** 传真 */
    private String fax;

    /** 地址 */
    private String address;

    /** 排序 */
    private String departOrder;

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
     * 获取部门名称
     * 
     * @return 部门名称
     */
    public String getDepartname() {
        return this.departname;
    }

    /**
     * 设置部门名称
     * 
     * @param departname
     *          部门名称
     */
    public void setDepartname(String departname) {
        this.departname = departname;
    }

    /**
     * 获取描述
     * 
     * @return 描述
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置描述
     * 
     * @param description
     *          描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取父部门ID
     * 
     * @return 父部门ID
     */
    public String getParentdepartid() {
        return this.parentdepartid;
    }

    /**
     * 设置父部门ID
     * 
     * @param parentdepartid
     *          父部门ID
     */
    public void setParentdepartid(String parentdepartid) {
        this.parentdepartid = parentdepartid;
    }

    /**
     * 获取机构编码
     * 
     * @return 机构编码
     */
    public String getOrgCode() {
        return this.orgCode;
    }

    /**
     * 设置机构编码
     * 
     * @param orgCode
     *          机构编码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取机构类型
     * 
     * @return 机构类型
     */
    public String getOrgType() {
        return this.orgType;
    }

    /**
     * 设置机构类型
     * 
     * @param orgType
     *          机构类型
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    /**
     * 获取手机号
     * 
     * @return 手机号
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * 设置手机号
     * 
     * @param mobile
     *          手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取传真
     * 
     * @return 传真
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * 设置传真
     * 
     * @param fax
     *          传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 获取地址
     * 
     * @return 地址
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 设置地址
     * 
     * @param address
     *          地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取排序
     * 
     * @return 排序
     */
    public String getDepartOrder() {
        return this.departOrder;
    }

    /**
     * 设置排序
     * 
     * @param departOrder
     *          排序
     */
    public void setDepartOrder(String departOrder) {
        this.departOrder = departOrder;
    }
}