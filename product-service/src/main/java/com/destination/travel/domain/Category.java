package com.destination.travel.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.destination.travel.enums.CategoryEnum;
import com.destination.travel.enums.DataStatusEnum;

/**
 * 类别
 */
public class Category extends BaseEntity{
    /**
     * 类别类型
     */
    CategoryEnum categoryType;
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

    public CategoryEnum getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryEnum categoryType) {
        this.categoryType = categoryType;
    }

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
