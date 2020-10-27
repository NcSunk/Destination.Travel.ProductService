package com.destination.travel.domain;

import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 景区-类别关系表
 */
public class ScenicCategoryRelation extends BaseEntity{
    /**
     * 景区ID
     */
    private long scenicId;
    /**
     * 景区类别ID
     */
    private long categoryId;

    public long getScenicId() {
        return scenicId;
    }

    public void setScenicId(long scenicId) {
        this.scenicId = scenicId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }
}
