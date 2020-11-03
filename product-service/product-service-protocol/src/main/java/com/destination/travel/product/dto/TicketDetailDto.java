package com.destination.travel.product.dto;

import com.destination.travel.product.enums.TicketDateModeEnum;
import com.destination.travel.product.enums.TicketRefundEnum;

import java.util.List;

public class TicketDetailDto {
    /**
     * 门票ID
     */
    private long id;
    /**
     * 门票名称
     */
    private String name;
    /**
     * 景区ID
     */
    private long scenicId;
    /**
     * 景区名称
     */
    private String scenicName;
    /**
     * 景区图片
     */
    private String scenicImage;
    /**
     * 票种ID
     */
    private long ticketTypeId;
    /**
     * 票种名称
     */
    private String ticketTypeName;
    /**
     * 所在城市ID
     */
    private long cityId;
    /**
     * 所在城市名称
     */
    private String cityName;
    /**
     * 退款方式
     */
    private TicketRefundEnum refundType;
    /**
     * 退款方式名称
     */
    private String refundTypeName;
    /**
     * 价格模式
     */
    private TicketDateModeEnum dateMode;
    /**
     * 销量
     */
    private int saleCount;
    /**
     * 适合人群
     */
    private String applicableCrowdRes;
    /**
     * 适用人群
     */
    private List<ApplicableCrowdResDto> applicableCrowds;
    /**
     * 费用包含
     */
    private String expensesInclude;
    /**
     * 费用包含补充
     */
    private String expensesIncludeReplenish;

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

    public long getScenicId() {
        return scenicId;
    }

    public void setScenicId(long scenicId) {
        this.scenicId = scenicId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public String getScenicImage() {
        return scenicImage;
    }

    public void setScenicImage(String scenicImage) {
        this.scenicImage = scenicImage;
    }

    public long getTicketTypeId() {
        return ticketTypeId;
    }

    public void setTicketTypeId(long ticketTypeId) {
        this.ticketTypeId = ticketTypeId;
    }

    public String getTicketTypeName() {
        return ticketTypeName;
    }

    public void setTicketTypeName(String ticketTypeName) {
        this.ticketTypeName = ticketTypeName;
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

    public TicketRefundEnum getRefundType() {
        return refundType;
    }

    public void setRefundType(TicketRefundEnum refundType) {
        this.refundType = refundType;
    }

    public String getRefundTypeName() {
        return refundTypeName;
    }

    public void setRefundTypeName(String refundTypeName) {
        this.refundTypeName = refundTypeName;
    }

    public TicketDateModeEnum getDateMode() {
        return dateMode;
    }

    public void setDateMode(TicketDateModeEnum dateMode) {
        this.dateMode = dateMode;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }

    public String getApplicableCrowdRes() {
        return applicableCrowdRes;
    }

    public void setApplicableCrowdRes(String applicableCrowdRes) {
        this.applicableCrowdRes = applicableCrowdRes;
    }

    public List<ApplicableCrowdResDto> getApplicableCrowds() {
        return applicableCrowds;
    }

    public void setApplicableCrowds(List<ApplicableCrowdResDto> applicableCrowds) {
        this.applicableCrowds = applicableCrowds;
    }

    public String getExpensesInclude() {
        return expensesInclude;
    }

    public void setExpensesInclude(String expensesInclude) {
        this.expensesInclude = expensesInclude;
    }

    public String getExpensesIncludeReplenish() {
        return expensesIncludeReplenish;
    }

    public void setExpensesIncludeReplenish(String expensesIncludeReplenish) {
        this.expensesIncludeReplenish = expensesIncludeReplenish;
    }
}
