package com.destination.travel.product.domain;

import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.product.enums.StayInClassifyEnum;

/**
 * 线路产品行程
 */
public class LineProductTrip extends BaseEntity {
    /**
     * 线路产品ID
     */
    private long lineProductId;
    /**
     * 第几天
     */
    private int day;
    /**
     * 成人餐饮包含 Json存储(不含则存0)
     */
    private String adultRepastInclude;
    /**
     * 儿童餐饮包含 Json存储(不含则存0)
     */
    private String childRepastInclude;
    /**
     * 住宿方式
     */
    private StayInClassifyEnum stayInClassify;
    /**
     * 入住城市ID
     */
    private long cityId;
    /**
     * 入住城市名称
     */
    private String cityName;
    /**
     * 入住酒店名称
     */
    private String hotelName;
    /**
     * 入住房型名称
     */
    private String roomTypeName;
    /**
     * 行程描述
     */
    private String instruction;

    public long getLineProductId() {
        return lineProductId;
    }

    public void setLineProductId(long lineProductId) {
        this.lineProductId = lineProductId;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getAdultRepastInclude() {
        return adultRepastInclude;
    }

    public void setAdultRepastInclude(String adultRepastInclude) {
        this.adultRepastInclude = adultRepastInclude;
    }

    public String getChildRepastInclude() {
        return childRepastInclude;
    }

    public void setChildRepastInclude(String childRepastInclude) {
        this.childRepastInclude = childRepastInclude;
    }

    public StayInClassifyEnum getStayInClassify() {
        return stayInClassify;
    }

    public void setStayInClassify(StayInClassifyEnum stayInClassify) {
        this.stayInClassify = stayInClassify;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
