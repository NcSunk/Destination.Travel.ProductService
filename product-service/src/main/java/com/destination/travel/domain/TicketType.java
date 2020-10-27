package com.destination.travel.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.destination.travel.enums.DataStatusEnum;

/**
 * 票种
 */
public class TicketType extends BaseEntity{
    /**
     * 景区ID
     */
    private long scenicId;
    /**
     * 上级ID
     */
    private long parentId;
    /**
     * 排序因子
     */
    private int sortNo;
    @TableField("data_status")
    private DataStatusEnum status;

    public long getScenicId() {
        return scenicId;
    }

    public void setScenicId(long scenicId) {
        this.scenicId = scenicId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
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
