package com.destination.travel.product.dto;

import com.destination.travel.product.enums.CloudWayEnum;

/**
 * 适用人群政策
 */
public class ApplicableCrowdResDto {
    /**
     * 政策名称
     */
    private String name;
    /**
     * 适用人群类型
     */
    private CloudWayEnum crowd;
    /**
     * 适用人群限制
     */
    private String crowdName;
    /**
     * 限制年龄
     */
    private String age;
    /**
     * 出生日期
     */
    private String birthday;
    /**
     * 生肖
     */
    private String zodiac;
    /**
     * 地区
     */
    private String area;
    /**
     * 性别:0-不限，1:男，2-女
     */
    private String sex;
    /**
     * 证件
     */
    private String card;
    /**
     * 限制身高
     */
    private String height;
    /**
     * 其他
     */
    private String other;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CloudWayEnum getCrowd() {
        return crowd;
    }

    public void setCrowd(CloudWayEnum crowd) {
        this.crowd = crowd;
    }

    public String getCrowdName() {
        return crowdName;
    }

    public void setCrowdName(String crowdName) {
        this.crowdName = crowdName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
