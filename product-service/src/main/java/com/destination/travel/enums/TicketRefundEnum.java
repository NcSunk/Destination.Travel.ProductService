package com.destination.travel.enums;

/**
 * 门票退款类型
 */
public enum TicketRefundEnum {
    /**
     * 不可退
     */
    No((byte)1),
    /**
     * 极速退
     */
    Immediately((byte)2),
    /**
     * 有条件退
     */
    Condition((byte)3);

    TicketRefundEnum(byte value){}
}
