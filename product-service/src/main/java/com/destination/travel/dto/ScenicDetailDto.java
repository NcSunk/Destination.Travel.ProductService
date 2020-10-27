package com.destination.travel.dto;

import com.destination.travel.enums.ScenicGradeEnum;

import java.util.List;

public class ScenicDetailDto {
    /**
     * 景区ID
     */
    private long id;
    /**
     * 景区名称
     */
    private String name;
    /**
     * 最佳游玩时间
     */
    private String bestTime;
    /**
     * 建议游玩时长
     */
    private String durationAdvise;
    /**
     * 景区地址
     */
    private String address;
    /**
     * 景区简介
     */
    private String description;
    /**
     * 购票须知
     */
    private String bookNotice;
    /**
     * 优惠政策
     */
    private List<PreferentialPolicyDto> preferentialPolicy;
    /**
     * 联系电话
     */
    private String contactPhone;
    /**
     * 游玩提示
     */
    private String playTips;
    /**
     * 小贴士
     */
    private String tips;
    /**
     * 景区级别
     */
    private ScenicGradeEnum grade;
    /**
     * 景区级别
     */
    private String gradeName;
    /**
     * 服务设施
     */
    private List<ServiceFacilityDto> serviceFacility;
    /**
     * 园内交通
     */
    private List<TrafficDto> traffic;
    /**
     * 开放时间
     */
    private List<OpenTimeDto> openTime;
    /**
     * 图片
     */
    private List<ScenicFileDto> images;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime;
    }

    public String getDurationAdvise() {
        return durationAdvise;
    }

    public void setDurationAdvise(String durationAdvise) {
        this.durationAdvise = durationAdvise;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBookNotice() {
        return bookNotice;
    }

    public void setBookNotice(String bookNotice) {
        this.bookNotice = bookNotice;
    }

    public List<PreferentialPolicyDto> getPreferentialPolicy() {
        return preferentialPolicy;
    }

    public void setPreferentialPolicy(List<PreferentialPolicyDto> preferentialPolicy) {
        this.preferentialPolicy = preferentialPolicy;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getPlayTips() {
        return playTips;
    }

    public void setPlayTips(String playTips) {
        this.playTips = playTips;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public ScenicGradeEnum getGrade() {
        return grade;
    }

    public void setGrade(ScenicGradeEnum grade) {
        this.grade = grade;
    }

    public String getGradeName() {
        return grade.getDesc();
    }

    public List<ServiceFacilityDto> getServiceFacility() {
        return serviceFacility;
    }

    public void setServiceFacility(List<ServiceFacilityDto> serviceFacility) {
        this.serviceFacility = serviceFacility;
    }

    public List<TrafficDto> getTraffic() {
        return traffic;
    }

    public void setTraffic(List<TrafficDto> traffic) {
        this.traffic = traffic;
    }

    public List<OpenTimeDto> getOpenTime() {
        return openTime;
    }

    public void setOpenTime(List<OpenTimeDto> openTime) {
        this.openTime = openTime;
    }

    public List<ScenicFileDto> getImages() {
        return images;
    }

    public void setImages(List<ScenicFileDto> images) {
        this.images = images;
    }
}
