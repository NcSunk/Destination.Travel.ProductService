package com.destination.travel.product.domain.line;

import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;

/**
 * 线路预订规则
 */
@TableName("travel_line_rule")
public class LineRule extends BaseEntity {
    /**
     * 线路ID
     */
    private long lineId;
    /**
     * 提前报名天数，设置0表示当天预定当天可以出发，设置1表示必须提前一天预定即可第二天出发
     */
    private int advanceDays;
    /**
     * 费用包含
     */
    private String feeInclude;
    /**
     * 费用不包含
     */
    private String feeNotInclude;
    /**
     * 预订须知
     */
    private String bookingInformation;
    /**
     * 预订限制
     */
    private String bookingLimit;
    /**
     * 标准条款 Json存储
     */
    private String standardClause;
    /**
     * 节假日条款 Json存储
     */
    private String holidayClause;

    public long getLineId() {
        return lineId;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }

    public int getAdvanceDays() {
        return advanceDays;
    }

    public void setAdvanceDays(int advanceDays) {
        this.advanceDays = advanceDays;
    }

    public String getFeeInclude() {
        return feeInclude;
    }

    public void setFeeInclude(String feeInclude) {
        this.feeInclude = feeInclude;
    }

    public String getFeeNotInclude() {
        return feeNotInclude;
    }

    public void setFeeNotInclude(String feeNotInclude) {
        this.feeNotInclude = feeNotInclude;
    }

    public String getBookingInformation() {
        return bookingInformation;
    }

    public void setBookingInformation(String bookingInformation) {
        this.bookingInformation = bookingInformation;
    }

    public String getBookingLimit() {
        return bookingLimit;
    }

    public void setBookingLimit(String bookingLimit) {
        this.bookingLimit = bookingLimit;
    }

    public String getStandardClause() {
        return standardClause;
    }

    public void setStandardClause(String standardClause) {
        this.standardClause = standardClause;
    }

    public String getHolidayClause() {
        return holidayClause;
    }

    public void setHolidayClause(String holidayClause) {
        this.holidayClause = holidayClause;
    }
}
