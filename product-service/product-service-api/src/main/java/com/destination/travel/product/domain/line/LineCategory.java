package com.destination.travel.product.domain.line;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.common.enums.DataStatusEnum;

/**
 * 线路分类
 */
@TableName("travel_line_category")
public class LineCategory extends BaseEntity {
    /**
     * 名称
     */
    private String name;
    /**
     * 上级ID
     */
    private long parentId;
    /**
     * 图标地址
     */
    private String icon;
    /**
     * 排序因子
     */
    private int sortNo;
    /**
     * 状态
     */
    @TableField("data_status")
    private DataStatusEnum status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getSortNo() {
        return sortNo;
    }

    public void setSortNo(int sortNo) {
        this.sortNo = sortNo;
    }

    public DataStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DataStatusEnum status) {
        this.status = status;
    }
}
