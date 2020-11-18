package com.destination.travel.product.dto;

import java.util.List;

public class TicketRuleDto {
    /**
     * 门票ID
     */
    private long ticketId;
    /**
     * 提前购买方式
     */
    private byte advanceBuyType;
    /**
     * 提前购买方式名称
     */
    private String advanceBuyTypeName;
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
     * 提前购买时间,Ex:需提前1天12:30前购买
     */
    private String advanceTimeDesc;
    /**
     * 提前购买补充规则，只做前端显示
     */
    private String supplementaryRules;
    /**
     * 是否需要联系人信息:不需要/需要
     */
    private byte needContactInfo;
    /**
     * 联系人证件信息：1-姓名，2-手机号，json数组
     */
    private String contactInfo;
    /**
     * 联系人身份信息说明：姓名,手机号
     */
    private String contactIdentityInfoName;
    /**
     * 是否需要游客信息：0-不需要，1-只需要一位游玩人信息，2-需要全部游玩人信息
     */
    private byte needTouristInfo;
    /**
     * 是否需要游客信息说明
     */
    private String needTouristInfoName;
    /**
     * 游客身份信息,1：姓名，2，手机号，json数组
     */
    private String touristIdentityInfo;
    /**
     * 身份信息说明：身份证,手机号
     */
    private String touristIdentityInfoName;
    /**
     * 游客证件信息,1：身份证，2：护照，3：台胞证，4:港澳通行证，5：大陆居民往来台湾通行证，json数组
     */
    private String touristCredentialsInfo;
    /**
     * 游客证件信息说明,1：身份证，2：护照，3：台胞证，4:港澳通行证，5：大陆居民往来台湾通行证，若勾选多个证件，用户在购买时只需任选一个证件填写
     */
    private String touristCredentialsInfoName;
    /**
     * 订单自动取消时间(分钟)
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
    private byte admissionMethodType;
    /**
     * 入园方式名称
     */
    private String admissionMethodTypeName;
    /**
     * 入园方式补充说明,1: 景区官方入园通道直接入园，2：三方特殊入园通道直接入园
     */
    private byte admissionMethodTypeReplenish;
    /**
     * 入园方式补充说明，1: 景区官方入园通道直接入园，2：三方特殊入园通道直接入园，3-景区官方途径换票入园（例如景区售票处），4-三方途径换票入园（例如去一个非景区地址换票）
     */
    private String admissionMethodTypeReplenishName;
    /**
     * 换票地址
     */
    private String admissionChangeTicketAddress;
    /**
     * 入园凭证类型，1：土驴券码，2.身份证，3.手机号，4.其他证件，json数组
     */
    private String admissionCertificateType;
    /**
     * 入园凭证身份证证件类型，1-原件，2-证件号
     */
    private byte idCardType;
    /**
     * 入园凭证身份证证件类型，1-原件，2-证件号
     */
    private String idCardTypeName;
    /**
     * 入园凭证描述，根据类型选择，Ex:无需换票，持 「土驴券码」 直接入园
     */
    private String admissionCertificateDesc;
    /**
     * 入园凭证携带类型，1：任选一种，2：全部携带
     */
    private byte admissionCertificateNeed;
    /**
     * 入园凭证携带类型，1：任选一种，2：全部携带
     */
    private String admissionCertificateNeedName;
    /**
     * 入园凭证补充说明
     */
    private String admissionCertificateNode;
    /**
     * 入园时间
     */
    private List<AdmissionTimeDto> admissionTimes;
    /**
     * 入园时间补充信息
     */
    private String admissionTimeReplenish;
    /**
     * 入园地址，Json字符串
     */
    private String admissionPlace;
    /**
     * 其他说明
     */
    private String otherDescription;
    /**
     * 费用包含
     */
    private String expensesIncludes;
    /**
     * 适用人群限制
     */
    private List<ApplicableCrowdResDto> applicableCrowds;

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public byte getAdvanceBuyType() {
        return advanceBuyType;
    }

    public void setAdvanceBuyType(byte advanceBuyType) {
        this.advanceBuyType = advanceBuyType;
    }

    public String getAdvanceBuyTypeName() {
        return advanceBuyTypeName;
    }

    public void setAdvanceBuyTypeName(String advanceBuyTypeName) {
        this.advanceBuyTypeName = advanceBuyTypeName;
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

    public String getAdvanceTimeDesc() {
        return advanceTimeDesc;
    }

    public void setAdvanceTimeDesc(String advanceTimeDesc) {
        this.advanceTimeDesc = advanceTimeDesc;
    }

    public String getSupplementaryRules() {
        return supplementaryRules;
    }

    public void setSupplementaryRules(String supplementaryRules) {
        this.supplementaryRules = supplementaryRules;
    }

    public byte getNeedContactInfo() {
        return needContactInfo;
    }

    public void setNeedContactInfo(byte needContactInfo) {
        this.needContactInfo = needContactInfo;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getContactIdentityInfoName() {
        return contactIdentityInfoName;
    }

    public void setContactIdentityInfoName(String contactIdentityInfoName) {
        this.contactIdentityInfoName = contactIdentityInfoName;
    }

    public byte getNeedTouristInfo() {
        return needTouristInfo;
    }

    public void setNeedTouristInfo(byte needTouristInfo) {
        this.needTouristInfo = needTouristInfo;
    }

    public String getNeedTouristInfoName() {
        return needTouristInfoName;
    }

    public void setNeedTouristInfoName(String needTouristInfoName) {
        this.needTouristInfoName = needTouristInfoName;
    }

    public String getTouristIdentityInfo() {
        return touristIdentityInfo;
    }

    public void setTouristIdentityInfo(String touristIdentityInfo) {
        this.touristIdentityInfo = touristIdentityInfo;
    }

    public String getTouristIdentityInfoName() {
        return touristIdentityInfoName;
    }

    public void setTouristIdentityInfoName(String touristIdentityInfoName) {
        this.touristIdentityInfoName = touristIdentityInfoName;
    }

    public String getTouristCredentialsInfo() {
        return touristCredentialsInfo;
    }

    public void setTouristCredentialsInfo(String touristCredentialsInfo) {
        this.touristCredentialsInfo = touristCredentialsInfo;
    }

    public String getTouristCredentialsInfoName() {
        return touristCredentialsInfoName;
    }

    public void setTouristCredentialsInfoName(String touristCredentialsInfoName) {
        this.touristCredentialsInfoName = touristCredentialsInfoName;
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

    public byte getAdmissionMethodType() {
        return admissionMethodType;
    }

    public void setAdmissionMethodType(byte admissionMethodType) {
        this.admissionMethodType = admissionMethodType;
    }

    public String getAdmissionMethodTypeName() {
        return admissionMethodTypeName;
    }

    public void setAdmissionMethodTypeName(String admissionMethodTypeName) {
        this.admissionMethodTypeName = admissionMethodTypeName;
    }

    public byte getAdmissionMethodTypeReplenish() {
        return admissionMethodTypeReplenish;
    }

    public void setAdmissionMethodTypeReplenish(byte admissionMethodTypeReplenish) {
        this.admissionMethodTypeReplenish = admissionMethodTypeReplenish;
    }

    public String getAdmissionMethodTypeReplenishName() {
        return admissionMethodTypeReplenishName;
    }

    public void setAdmissionMethodTypeReplenishName(String admissionMethodTypeReplenishName) {
        this.admissionMethodTypeReplenishName = admissionMethodTypeReplenishName;
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

    public String getIdCardTypeName() {
        return idCardTypeName;
    }

    public void setIdCardTypeName(String idCardTypeName) {
        this.idCardTypeName = idCardTypeName;
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

    public String getAdmissionCertificateNeedName() {
        return admissionCertificateNeedName;
    }

    public void setAdmissionCertificateNeedName(String admissionCertificateNeedName) {
        this.admissionCertificateNeedName = admissionCertificateNeedName;
    }

    public String getAdmissionCertificateNode() {
        return admissionCertificateNode;
    }

    public void setAdmissionCertificateNode(String admissionCertificateNode) {
        this.admissionCertificateNode = admissionCertificateNode;
    }

    public List<AdmissionTimeDto> getAdmissionTimes() {
        return admissionTimes;
    }

    public void setAdmissionTimes(List<AdmissionTimeDto> admissionTimes) {
        this.admissionTimes = admissionTimes;
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

    public String getExpensesIncludes() {
        return expensesIncludes;
    }

    public void setExpensesIncludes(String expensesIncludes) {
        this.expensesIncludes = expensesIncludes;
    }

    public List<ApplicableCrowdResDto> getApplicableCrowds() {
        return applicableCrowds;
    }

    public void setApplicableCrowds(List<ApplicableCrowdResDto> applicableCrowds) {
        this.applicableCrowds = applicableCrowds;
    }
}
