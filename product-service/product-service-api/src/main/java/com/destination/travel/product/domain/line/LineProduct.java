package com.destination.travel.product.domain.line;

import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;

/**
 * 线路产品
 */
@TableName("travel_line_product")
public class LineProduct extends BaseEntity {
    /**
     * 线路ID
     */
    private long lineId;
    /**
     * 名称
     */
    private String name;
    /**
     * 适用人群 Json存储
     */
    private String applyCrowd;
    /**
     * 出发地
     */
    private String departure;
    /**
     * 销量
     */
    private int saleCount;

    public long getLineId() {
        return lineId;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplyCrowd() {
        return applyCrowd;
    }

    public void setApplyCrowd(String applyCrowd) {
        this.applyCrowd = applyCrowd;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }
}
