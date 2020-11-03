package com.destination.travel.product.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.destination.travel.common.domain.BaseEntity;

/**
 * 线路服务保障
 */
public class LineService extends BaseEntity {
    /**
     * 名称
     */
    private String name;
    /**
     * 简介
     */
    private String introduction;
    /**
     * 启用状态
     */
    @TableField("data_status")
    private byte status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
