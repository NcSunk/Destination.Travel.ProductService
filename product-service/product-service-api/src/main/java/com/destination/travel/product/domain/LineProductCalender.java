package com.destination.travel.product.domain;

import com.destination.travel.common.domain.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 线路产品价格库存日历
 */
public class LineProductCalender extends BaseEntity {
    /**
     * 线路产品ID
     */
    private long lineProductId;
    /**
     * 出发城市ID
     */
    private long cityId;
    /**
     * 起始日期
     */
    private Date startDate;
    /**
     * 截止日期
     */
    private Date endDate;
    /**
     * 成人市场价
     */
    private BigDecimal adultPrice;
    /**
     * 成人结算价
     */
    private BigDecimal adultCost;
    /**
     * 成人库存
     */
    private int adultQuantity;
    /**
     * 儿童市场价
     */
    private BigDecimal childPrice;
    /**
     * 儿童结算价
     */
    private BigDecimal childCost;
    /**
     * 儿童库存
     */
    private int childQuantity;
    /**
     * 单房差市场价
     */
    private BigDecimal singleRoomDiffPrice;
    /**
     * 单房差结算价
     */
    private BigDecimal singleRoomDiffCost;
    /**
     * 可用星期几集合，Json存储
     */
    private String weeks;

    public long getLineProductId() {
        return lineProductId;
    }

    public void setLineProductId(long lineProductId) {
        this.lineProductId = lineProductId;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(BigDecimal adultPrice) {
        this.adultPrice = adultPrice;
    }

    public BigDecimal getAdultCost() {
        return adultCost;
    }

    public void setAdultCost(BigDecimal adultCost) {
        this.adultCost = adultCost;
    }

    public int getAdultQuantity() {
        return adultQuantity;
    }

    public void setAdultQuantity(int adultQuantity) {
        this.adultQuantity = adultQuantity;
    }

    public BigDecimal getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(BigDecimal childPrice) {
        this.childPrice = childPrice;
    }

    public BigDecimal getChildCost() {
        return childCost;
    }

    public void setChildCost(BigDecimal childCost) {
        this.childCost = childCost;
    }

    public int getChildQuantity() {
        return childQuantity;
    }

    public void setChildQuantity(int childQuantity) {
        this.childQuantity = childQuantity;
    }

    public BigDecimal getSingleRoomDiffPrice() {
        return singleRoomDiffPrice;
    }

    public void setSingleRoomDiffPrice(BigDecimal singleRoomDiffPrice) {
        this.singleRoomDiffPrice = singleRoomDiffPrice;
    }

    public BigDecimal getSingleRoomDiffCost() {
        return singleRoomDiffCost;
    }

    public void setSingleRoomDiffCost(BigDecimal singleRoomDiffCost) {
        this.singleRoomDiffCost = singleRoomDiffCost;
    }

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }
}
