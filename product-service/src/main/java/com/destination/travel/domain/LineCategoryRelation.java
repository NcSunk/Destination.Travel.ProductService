package com.destination.travel.domain;

/**
 * 线路-类别关系表
 */
public class LineCategoryRelation extends BaseEntity{
    /**
     * 线路ID
     */
    private long lineId;
    /**
     * 景区类别ID
     */
    private long categoryId;

    public long getLineId() {
        return lineId;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }
}
