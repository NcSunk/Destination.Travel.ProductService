package com.destination.travel.enums;

/**
 * 门票库存模式
 */
public enum TicketInventoryModeEnum {
    /**
     * 无库存限制
     */
    NoLimit((byte)1),
    /**
     * 有库存限制
     */
    Limit((byte)2);

    TicketInventoryModeEnum(byte value){}
}
