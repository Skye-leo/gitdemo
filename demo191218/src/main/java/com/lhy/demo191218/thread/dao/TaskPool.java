package com.lhy.demo191218.thread.dao;

import java.io.Serializable;
import java.util.Date;

/**
* @author liuhaoyang
*/
public class TaskPool implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 1为完成 0为待执行
     */
    private Integer status;

    /**
     * 操作人名称
     */
    private String modifyName;

    /**
     * 
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public static class Builder {
        private TaskPool obj;

        public Builder() {
            this.obj = new TaskPool();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder status(Integer status) {
            obj.status = status;
            return this;
        }

        public Builder modifyName(String modifyName) {
            obj.modifyName = modifyName;
            return this;
        }

        public Builder updateTime(Date updateTime) {
            obj.updateTime = updateTime;
            return this;
        }

        public TaskPool build() {
            return this.obj;
        }
    }
}