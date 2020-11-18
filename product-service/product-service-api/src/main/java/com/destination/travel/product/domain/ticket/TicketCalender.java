package com.destination.travel.product.domain.ticket;

import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

@TableName("travel_ticket_calendar")
public class TicketCalender extends BaseEntity {
    /**
     * 门票ID
     */
    private long ticketId;
    /**
     * 可用开始日期
     */
    private Date startDate;
    /**
     * 可用截至日期
     */
    private Date endDate;
    /**
     * 市场价
     */
    private BigDecimal marketPrice;
    /**
     * 销售价
     */
    private BigDecimal salePrice;
    /**
     * 结算价
     */
    private BigDecimal costPrice;
    /**
     * 库存
     */
    private int quantity;
    /**
     * 可用日期 星期 Json存储
     */
    private String weeks;
    /**
     * 不可用日期 日期 Json存储
     */
    private String disabledDate;

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }

    public String getDisabledDate() {
        return disabledDate;
    }

    public void setDisabledDate(String disabledDate) {
        this.disabledDate = disabledDate;
    }
}
