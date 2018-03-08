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

import java.util.Date;

/**
 * T_S_ROLE
 * 
 * @author bianj
 * @version 1.0.0 2018-01-20
 */
public class SRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6359730683095879031L;

    /** ID */
    private String id;

    /** 角色编码 */
    private String rolecode;

    /** 角色名字 */
    private String rolename;

    /** 修改人 */
    private String updateName;

    /** 修改时间 */
    private Date updateDate;

    /** 修改人id */
    private String updateBy;

    /** 创建人 */
    private String createName;

    /** 创建时间 */
    private Date createDate;

    /** 创建人id */
    private String createBy;

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
     * 获取角色编码
     * 
     * @return 角色编码
     */
    public String getRolecode() {
        return this.rolecode;
    }

    /**
     * 设置角色编码
     * 
     * @param rolecode
     *          角色编码
     */
    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    /**
     * 获取角色名字
     * 
     * @return 角色名字
     */
    public String getRolename() {
        return this.rolename;
    }

    /**
     * 设置角色名字
     * 
     * @param rolename
     *          角色名字
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * 获取修改人
     * 
     * @return 修改人
     */
    public String getUpdateName() {
        return this.updateName;
    }

    /**
     * 设置修改人
     * 
     * @param updateName
     *          修改人
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    /**
     * 获取修改时间
     * 
     * @return 修改时间
     */
    public Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置修改时间
     * 
     * @param updateDate
     *          修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取修改人id
     * 
     * @return 修改人id
     */
    public String getUpdateBy() {
        return this.updateBy;
    }

    /**
     * 设置修改人id
     * 
     * @param updateBy
     *          修改人id
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取创建人
     * 
     * @return 创建人
     */
    public String getCreateName() {
        return this.createName;
    }

    /**
     * 设置创建人
     * 
     * @param createName
     *          创建人
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * 获取创建时间
     * 
     * @return 创建时间
     */
    public Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置创建时间
     * 
     * @param createDate
     *          创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取创建人id
     * 
     * @return 创建人id
     */
    public String getCreateBy() {
        return this.createBy;
    }

    /**
     * 设置创建人id
     * 
     * @param createBy
     *          创建人id
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}