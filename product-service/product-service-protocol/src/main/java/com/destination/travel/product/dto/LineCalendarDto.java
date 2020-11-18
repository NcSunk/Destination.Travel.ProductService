package com.destination.travel.product.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LineCalendarDto {
    /**
     * 班期id
     */
    private long id;
    /**
     * 日期
     */
    private Date Date;
    /**
     * 星期集合
     */
    private List<Integer> weekInfo;
    /**
     * 星期 拼接字符串 周一，周二，周三
     */
    private String week;
    /**
     * 成人售价
     */
    private BigDecimal adultPrice;
    /**
     * 儿童售价
     */
    private BigDecimal childPrice;
    /**
     * 成人库存量
     */
    private int adultQuantity;
    /**
     * 儿童库存量
     */
    private int childQuantity;
    /**
     * 单房差售价
     */
    private BigDecimal singleRoomDiffPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public List<Integer> getWeekInfo() {
        return weekInfo;
    }

    public void setWeekInfo(List<Integer> weekInfo) {
        this.weekInfo = weekInfo;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public BigDecimal getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(BigDecimal adultPrice) {
        this.adultPrice = adultPrice;
    }

    public BigDecimal getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(BigDecimal childPrice) {
        this.childPrice = childPrice;
    }

    public int getAdultQuantity() {
        return adultQuantity;
    }

    public void setAdultQuantity(int adultQuantity) {
        this.adultQuantity = adultQuantity;
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
}
