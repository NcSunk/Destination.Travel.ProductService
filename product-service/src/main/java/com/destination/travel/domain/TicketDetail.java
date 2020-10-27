package com.destination.travel.domain;

/**
 * 门票详情
 */
public class TicketDetail extends BaseEntity {
    /**
     * 门票ID
     */
    private long ticketId;
    /**
     * 适用人群限制，Json存储
     */
    private String applicableCrowdRes;
    /**
     * 费用包含
     */
    private String expensesInclude;
    /**
     * 费用包含补充
     */
    private String expensesIncludeReplenish;

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public String getApplicableCrowdRes() {
        return applicableCrowdRes;
    }

    public void setApplicableCrowdRes(String applicableCrowdRes) {
        this.applicableCrowdRes = applicableCrowdRes;
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
