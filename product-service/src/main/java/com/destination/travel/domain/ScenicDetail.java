package com.destination.travel.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.enums.ScenicGradeEnum;

/**
 * 景区详情
 */
@TableName("travel_scenic_detail")
public class ScenicDetail extends BaseEntity{
    /**
     * 景区ID
     */
    private long scenicId;
    /**
     * 级别
     */
    private ScenicGradeEnum grade;
    /**
     * 描述
     */
    private String description;
    /**
     * 开放日期 Json存储
     */
    private String openTime;
    /**
     * 入场时间类型(0-不限)
     */
    private byte admissionTimeType;
    /**
     * 入园提前小时
     */
    private int admissionHour;
    /**
     * 入园提前分钟
     */
    private int admissionMinutes;
    /**
     * 联系电话
     */
    private String contactPhone;
    /**
     * 优惠政策 Json存储
     */
    private String preferentialPolicy;
    /**
     * 游玩提示
     */
    private String playTips;
    /**
     * 小贴士
     */
    private String tips;
    /**
     * 最佳游玩时间
     */
    private String bestTime;
    /**
     * 建议游玩时长
     */
    private String durationAdvise;
    /**
     * 服务设施标签，json字符串，设施包含
     */
    private String serviceFacility;
    /**
     * 园内交通标签，json字符串
     */
    private String traffic;
    /**
     * 购票须知
     */
    private String bookNotice;

    public long getScenicId() {
        return scenicId;
    }

    public void setScenicId(long scenicId) {
        this.scenicId = scenicId;
    }

    public ScenicGradeEnum getGrade() {
        return grade;
    }

    public void setGrade(ScenicGradeEnum grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public byte getAdmissionTimeType() {
        return admissionTimeType;
    }

    public void setAdmissionTimeType(byte admissionTimeType) {
        this.admissionTimeType = admissionTimeType;
    }

    public int getAdmissionHour() {
        return admissionHour;
    }

    public void setAdmissionHour(int admissionHour) {
        this.admissionHour = admissionHour;
    }

    public int getAdmissionMinutes() {
        return admissionMinutes;
    }

    public void setAdmissionMinutes(int admissionMinutes) {
        this.admissionMinutes = admissionMinutes;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getPreferentialPolicy() {
        return preferentialPolicy;
    }

    public void setPreferentialPolicy(String preferentialPolicy) {
        this.preferentialPolicy = preferentialPolicy;
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

    public String getServiceFacility() {
        return serviceFacility;
    }

    public void setServiceFacility(String serviceFacility) {
        this.serviceFacility = serviceFacility;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getBookNotice() {
        return bookNotice;
    }

    public void setBookNotice(String bookNotice) {
        this.bookNotice = bookNotice;
    }
}
