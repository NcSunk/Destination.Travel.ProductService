package com.destination.travel.product.domain.ticket;

import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.product.enums.AdmissionMethodTypeEnum;
import com.destination.travel.product.enums.AdvanceBuyTypeEnum;
import com.destination.travel.product.enums.NeedContactInfoEnum;
import com.destination.travel.product.enums.NeedTouristInfoEnum;

/**
 * 门票规则
 */
@TableName("travel_ticket_rule")
public class TicketRule extends BaseEntity {
    /**
     * 门票ID
     */
    private long ticketId;
    /**
     * 提前购买方式
     */
    private AdvanceBuyTypeEnum advanceBuyType;
    /**
     * 提前购买天数
     */
    private int advanceDay;
    /**
     * 提前购买小时数
     */
    private int advanceHour;
    /**
     * 提前购买分钟数
     */
    private int advanceMinute;
    /**
     * 补充规则,只做前端显示,
     * 保存json字符串{"AdvanceHour":1,"AdvanceMinute":30}
     * 用户购买后需等待x小时x分钟方可使用
     */
    private String supplementaryRules;
    /**
     * 是否需要联系人信息
     */
    private NeedContactInfoEnum needContactInfo;
    /**
     * 联系人证件信息：1-身份证，2-手机号，json存储
     */
    private String contactInfo;
    /**
     * 需要游客信息
     */
    private NeedTouristInfoEnum needTouristInfo;
    /**
     * 游客身份信息,1：姓名，2，手机号，json存储
     */
    private String touristIdentityInfo;
    /**
     * 游客证件信息,1：身份证，2：护照，3：台胞证，4:港澳通行证，5：大陆居民往来台湾通行证，json存储
     */
    private String touristCredentialsInfo;
    /**
     * 订单自动取消时间
     */
    private int cancelMinute;
    /**
     * 每单最小预定数量
     */
    private int minTicketOrder;
    /**
     * 每单最多预定数量，0-不限制
     */
    private int maxTicketOrder;
    /**
     * 每账号最多预定数量，0-不限制
     */
    private int maxTicketAccount;
    /**
     * 每账号最多购买多少单，0-不限制
     */
    private int maxOrderAccount;
    /**
     * 每手机号码最多购买数量，0-不限制
     */
    private int maxTicketPhone;
    /**
     * 每手机号码最多购买多少单，0-不限制
     */
    private int maxOrderPhone;
    /**
     * 每身份证最多购买数量，0-不限制
     */
    private int maxTicketIdCard;
    /**
     * 每身份证最多购买多少单，0-不限制
     */
    private int maxOrderIdCard;
    /**
     * 每账号购买限制天数，0-不限制
     */
    private int daysAccount;
    /**
     * 每手机号码购买限制天数，0-不限制
     */
    private int daysPhone;
    /**
     * 每身份证号购买限制天数，0-不限制
     */
    private int daysIdCard;
    /**
     * 入园方式
     */
    private AdmissionMethodTypeEnum admissionMethodType;
    /**
     * 入园方式补充说明,1: 景区官方入园通道直接入园，2：三方特殊入园通道直接入园，3-景区官方途径换票入园（例如景区售票处），4-三方途径换票入园（例如去一个非景区地址换票）
     */
    private String admissionMethodTypeReplenish;
    /**
     * 换票地址
     */
    private String admissionChangeTicketAddress;
    /**
     * 入园凭证类型，1：土驴券码，2.身份证，3.手机号，4.其他证件，json存储
     */
    private String admissionCertificateType;
    /**
     * 入园凭证身份证证件类型，1-原件，2-证件号
     */
    private byte idCardType;
    /**
     * 入园凭证描述，根据类型选择，Ex:无需换票，持 「土驴券码」 直接入园
     */
    private String admissionCertificateDesc;
    /**
     * 入园凭证携带类型，1：任选一种，2：全部携带
     */
    private byte admissionCertificateNeed;
    /**
     * 入园凭证补充说明
     */
    private String admissionCertificateNode;
    /**
     * 入园时间，Json存储
     */
    private String admissionTime;
    /**
     * 入园时间补充信息
     */
    private String admissionTimeReplenish;
    /**
     * 入园地址
     */
    private String admissionPlace;
    /**
     * 其他说明
     */
    private String otherDescription;

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public AdvanceBuyTypeEnum getAdvanceBuyType() {
        return advanceBuyType;
    }

    public void setAdvanceBuyType(AdvanceBuyTypeEnum advanceBuyType) {
        this.advanceBuyType = advanceBuyType;
    }

    public int getAdvanceDay() {
        return advanceDay;
    }

    public void setAdvanceDay(int advanceDay) {
        this.advanceDay = advanceDay;
    }

    public int getAdvanceHour() {
        return advanceHour;
    }

    public void setAdvanceHour(int advanceHour) {
        this.advanceHour = advanceHour;
    }

    public int getAdvanceMinute() {
        return advanceMinute;
    }

    public void setAdvanceMinute(int advanceMinute) {
        this.advanceMinute = advanceMinute;
    }

    public String getSupplementaryRules() {
        return supplementaryRules;
    }

    public void setSupplementaryRules(String supplementaryRules) {
        this.supplementaryRules = supplementaryRules;
    }

    public NeedContactInfoEnum getNeedContactInfo() {
        return needContactInfo;
    }

    public void setNeedContactInfo(NeedContactInfoEnum needContactInfo) {
        this.needContactInfo = needContactInfo;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public NeedTouristInfoEnum getNeedTouristInfo() {
        return needTouristInfo;
    }

    public void setNeedTouristInfo(NeedTouristInfoEnum needTouristInfo) {
        this.needTouristInfo = needTouristInfo;
    }

    public String getTouristIdentityInfo() {
        return touristIdentityInfo;
    }

    public void setTouristIdentityInfo(String touristIdentityInfo) {
        this.touristIdentityInfo = touristIdentityInfo;
    }

    public String getTouristCredentialsInfo() {
        return touristCredentialsInfo;
    }

    public void setTouristCredentialsInfo(String touristCredentialsInfo) {
        this.touristCredentialsInfo = touristCredentialsInfo;
    }

    public int getCancelMinute() {
        return cancelMinute;
    }

    public void setCancelMinute(int cancelMinute) {
        this.cancelMinute = cancelMinute;
    }

    public int getMinTicketOrder() {
        return minTicketOrder;
    }

    public void setMinTicketOrder(int minTicketOrder) {
        this.minTicketOrder = minTicketOrder;
    }

    public int getMaxTicketOrder() {
        return maxTicketOrder;
    }

    public void setMaxTicketOrder(int maxTicketOrder) {
        this.maxTicketOrder = maxTicketOrder;
    }

    public int getMaxTicketAccount() {
        return maxTicketAccount;
    }

    public void setMaxTicketAccount(int maxTicketAccount) {
        this.maxTicketAccount = maxTicketAccount;
    }

    public int getMaxOrderAccount() {
        return maxOrderAccount;
    }

    public void setMaxOrderAccount(int maxOrderAccount) {
        this.maxOrderAccount = maxOrderAccount;
    }

    public int getMaxTicketPhone() {
        return maxTicketPhone;
    }

    public void setMaxTicketPhone(int maxTicketPhone) {
        this.maxTicketPhone = maxTicketPhone;
    }

    public int getMaxOrderPhone() {
        return maxOrderPhone;
    }

    public void setMaxOrderPhone(int maxOrderPhone) {
        this.maxOrderPhone = maxOrderPhone;
    }

    public int getMaxTicketIdCard() {
        return maxTicketIdCard;
    }

    public void setMaxTicketIdCard(int maxTicketIdCard) {
        this.maxTicketIdCard = maxTicketIdCard;
    }

    public int getMaxOrderIdCard() {
        return maxOrderIdCard;
    }

    public void setMaxOrderIdCard(int maxOrderIdCard) {
        this.maxOrderIdCard = maxOrderIdCard;
    }

    public int getDaysAccount() {
        return daysAccount;
    }

    public void setDaysAccount(int daysAccount) {
        this.daysAccount = daysAccount;
    }

    public int getDaysPhone() {
        return daysPhone;
    }

    public void setDaysPhone(int daysPhone) {
        this.daysPhone = daysPhone;
    }

    public int getDaysIdCard() {
        return daysIdCard;
    }

    public void setDaysIdCard(int daysIdCard) {
        this.daysIdCard = daysIdCard;
    }

    public AdmissionMethodTypeEnum getAdmissionMethodType() {
        return admissionMethodType;
    }

    public void setAdmissionMethodType(AdmissionMethodTypeEnum admissionMethodType) {
        this.admissionMethodType = admissionMethodType;
    }

    public String getAdmissionMethodTypeReplenish() {
        return admissionMethodTypeReplenish;
    }

    public void setAdmissionMethodTypeReplenish(String admissionMethodTypeReplenish) {
        this.admissionMethodTypeReplenish = admissionMethodTypeReplenish;
    }

    public String getAdmissionChangeTicketAddress() {
        return admissionChangeTicketAddress;
    }

    public void setAdmissionChangeTicketAddress(String admissionChangeTicketAddress) {
        this.admissionChangeTicketAddress = admissionChangeTicketAddress;
    }

    public String getAdmissionCertificateType() {
        return admissionCertificateType;
    }

    public void setAdmissionCertificateType(String admissionCertificateType) {
        this.admissionCertificateType = admissionCertificateType;
    }

    public byte getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(byte idCardType) {
        this.idCardType = idCardType;
    }

    public String getAdmissionCertificateDesc() {
        return admissionCertificateDesc;
    }

    public void setAdmissionCertificateDesc(String admissionCertificateDesc) {
        this.admissionCertificateDesc = admissionCertificateDesc;
    }

    public byte getAdmissionCertificateNeed() {
        return admissionCertificateNeed;
    }

    public void setAdmissionCertificateNeed(byte admissionCertificateNeed) {
        this.admissionCertificateNeed = admissionCertificateNeed;
    }

    public String getAdmissionCertificateNode() {
        return admissionCertificateNode;
    }

    public void setAdmissionCertificateNode(String admissionCertificateNode) {
        this.admissionCertificateNode = admissionCertificateNode;
    }

    public String getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(String admissionTime) {
        this.admissionTime = admissionTime;
    }

    public String getAdmissionTimeReplenish() {
        return admissionTimeReplenish;
    }

    public void setAdmissionTimeReplenish(String admissionTimeReplenish) {
        this.admissionTimeReplenish = admissionTimeReplenish;
    }

    public String getAdmissionPlace() {
        return admissionPlace;
    }

    public void setAdmissionPlace(String admissionPlace) {
        this.admissionPlace = admissionPlace;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }
}
