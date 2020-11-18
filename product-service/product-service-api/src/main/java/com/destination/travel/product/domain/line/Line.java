package com.destination.travel.product.domain.line;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.common.enums.DataStatusEnum;
import com.destination.travel.product.enums.ChildBookLimitEnum;
import com.destination.travel.product.enums.CloudWayEnum;
import com.destination.travel.product.enums.MeansOfTransportationEnum;

import java.math.BigDecimal;

/**
 * 线路
 */
@TableName("travel_line")
public class Line extends BaseEntity {
    /**
     * 类别
     */
    private long categoryId;
    /**
     * 成团方式
     */
    private CloudWayEnum cloudWay;
    /**
     * 儿童预定限制
     */
    private ChildBookLimitEnum childBookLimit;
    /**
     * 名称
     */
    private String name;
    /**
     * 出发地 Json存储
     */
    private String departure;
    /**
     * 目的地 Json存储
     */
    private String destination;
    /**
     * 行程天晚 天
     */
    private int days;
    /**
     * 行程天晚 晚
     */
    private int nights;
    /**
     * 线路主题 Json存储
     */
    private String theme;
    /**
     * 适用人群 Json存储
     */
    private String applyCrowd;
    /**
     * 主图
     */
    private String image;
    /**
     * 去程交通
     */
    private MeansOfTransportationEnum goTraffic;
    /**
     * 返程交通
     */
    private MeansOfTransportationEnum returnTraffic;
    /**
     * 最低销售价
     */
    private BigDecimal minPrice;
    /**
     * 最高销售价
     */
    private BigDecimal maxPrice;
    @TableField("data_status")
    private DataStatusEnum status;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public CloudWayEnum getCloudWay() {
        return cloudWay;
    }

    public void setCloudWay(CloudWayEnum cloudWay) {
        this.cloudWay = cloudWay;
    }

    public ChildBookLimitEnum getChildBookLimit() {
        return childBookLimit;
    }

    public void setChildBookLimit(ChildBookLimitEnum childBookLimit) {
        this.childBookLimit = childBookLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getApplyCrowd() {
        return applyCrowd;
    }

    public void setApplyCrowd(String applyCrowd) {
        this.applyCrowd = applyCrowd;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MeansOfTransportationEnum getGoTraffic() {
        return goTraffic;
    }

    public void setGoTraffic(MeansOfTransportationEnum goTraffic) {
        this.goTraffic = goTraffic;
    }

    public MeansOfTransportationEnum getReturnTraffic() {
        return returnTraffic;
    }

    public void setReturnTraffic(MeansOfTransportationEnum returnTraffic) {
        this.returnTraffic = returnTraffic;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public DataStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DataStatusEnum status) {
        this.status = status;
    }
}
