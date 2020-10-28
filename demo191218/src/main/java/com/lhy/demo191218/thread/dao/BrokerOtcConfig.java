package com.lhy.demo191218.thread.dao;

import java.io.Serializable;
import java.util.Date;

/**
* @author liuhaoyang
*/
public class BrokerOtcConfig implements Serializable {
    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 角色等级
     */
    private Integer levelCode;

    /**
     * 币种id
     */
    private Integer symbolId;

    /**
     * 币种名称
     */
    private String symbolName;

    /**
     * 分红比例
     */
    private Double scale;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 修改时间
     */
    private Date mtime;

    /**
     * 状态(0.有效 1.无效)
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(Integer levelCode) {
        this.levelCode = levelCode;
    }

    public Integer getSymbolId() {
        return symbolId;
    }

    public void setSymbolId(Integer symbolId) {
        this.symbolId = symbolId;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName == null ? null : symbolName.trim();
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public static class Builder {
        private BrokerOtcConfig obj;

        public Builder() {
            this.obj = new BrokerOtcConfig();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder roleId(Integer roleId) {
            obj.roleId = roleId;
            return this;
        }

        public Builder levelCode(Integer levelCode) {
            obj.levelCode = levelCode;
            return this;
        }

        public Builder symbolId(Integer symbolId) {
            obj.symbolId = symbolId;
            return this;
        }

        public Builder symbolName(String symbolName) {
            obj.symbolName = symbolName;
            return this;
        }

        public Builder scale(Double scale) {
            obj.scale = scale;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public Builder status(Integer status) {
            obj.status = status;
            return this;
        }

        public BrokerOtcConfig build() {
            return this.obj;
        }
    }
}