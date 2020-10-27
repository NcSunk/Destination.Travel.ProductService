package com.destination.travel.domain;

import com.destination.travel.enums.DataStatusEnum;
import com.destination.travel.enums.TicketDateModeEnum;
import com.destination.travel.enums.TicketInventoryModeEnum;
import com.destination.travel.enums.TicketRefundEnum;

import java.math.BigDecimal;

/**
 * 门票
 */
public class Ticket extends BaseEntity{
    /**
     * 名称
     */
    private String name;
    /**
     * 供应商第三方系统产品编号
     */
    private String supplierProductNo;
    /**
     * 景区ID
     */
    private long scenicId;
    /**
     * 景区名称
     */
    private String scenicName;
    /**
     * 票种ID
     */
    private long ticketTypeId;
    /**
     * 所在地(市)ID
     */
    private long cityId;
    /**
     * 所在地(市)名称
     */
    private String cityName;
    /**
     * 退款类型
     */
    private TicketRefundEnum refundType;
    /**
     *价格日期模式
     */
    private TicketDateModeEnum dateMode;
    /**
     * 库存模式
     */
    private TicketInventoryModeEnum inventoryMode;
    /**
     * 销售最低价
     */
    private BigDecimal salePrice;
    /**
     * 市场最低价
     */
    private BigDecimal marketPrice;
    /**
     * 销量
     */
    private int saleCount;
    private DataStatusEnum status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplierProductNo() {
        return supplierProductNo;
    }

    public void setSupplierProductNo(String supplierProductNo) {
        this.supplierProductNo = supplierProductNo;
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

    public long getTicketTypeId() {
        return ticketTypeId;
    }

    public void setTicketTypeId(long ticketTypeId) {
        this.ticketTypeId = ticketTypeId;
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

    public TicketDateModeEnum getDateMode() {
        return dateMode;
    }

    public void setDateMode(TicketDateModeEnum dateMode) {
        this.dateMode = dateMode;
    }

    public TicketInventoryModeEnum getInventoryMode() {
        return inventoryMode;
    }

    public void setInventoryMode(TicketInventoryModeEnum inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }

    public DataStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DataStatusEnum status) {
        this.status = status;
    }
}
