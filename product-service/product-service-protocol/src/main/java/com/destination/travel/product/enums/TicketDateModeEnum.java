package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 门票价格日期模式
 */
public enum TicketDateModeEnum implements IEnum<Byte> {
    ValidDate((byte)1,"有效期模式"),
    Calendar((byte)2,"日历模式");

    @EnumValue
    @JsonValue
    private final byte value;
    private final String desc;

    TicketDateModeEnum(byte value,String desc){
        this.value=value;
        this.desc=desc;
    }

    @Override
    public Byte getValue() {
        return value;
    }

    public String getDesc()
    {
        return desc;
    }
}
