package com.destination.travel.product.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TicketCalendarDto {
    /**
     * 班期ID
     */
    private long id;
    /**
     * 价格
     */
    @JsonAlias("price")
    private BigDecimal salePrice;
    /**
     * 班期开始日期
     */
    private Date startDate;
    /**
     * 班期截止日期
     */
    private Date endDate;
    /**
     * 可用日期
     */
    private String weeks;
    /**
     * 不可用日期
     */
    private List<String> disabledDates;
    /**
     * 库存
     */
    private int quantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
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

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }

    public List<String> getDisabledDates() {
        return disabledDates;
    }

    public void setDisabledDates(List<String> disabledDates) {
        this.disabledDates = disabledDates;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
