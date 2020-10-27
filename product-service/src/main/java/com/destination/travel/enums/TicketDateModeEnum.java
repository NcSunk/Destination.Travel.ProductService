package com.destination.travel.enums;

/**
 * 门票价格日期模式
 */
public enum TicketDateModeEnum {
    /**
     * 有效期模式
     */
    ValidDate((byte)1),
    /**
     * 日历模式
     */
    Calendar((byte)2);

    TicketDateModeEnum(byte value){}
}
