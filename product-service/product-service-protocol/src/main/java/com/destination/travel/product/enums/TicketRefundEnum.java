package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TicketRefundEnum implements IEnum<Byte> {
    No((byte)1,"不可退"),
    Immediately((byte)2,"极速退"),
    Condition((byte)3,"有条件退");

    TicketRefundEnum(byte value,String desc)
    {
        this.value=value;
        this.desc=desc;
    }

    @EnumValue
    @JsonValue
    private final byte value;
    private final String desc;

    @Override
    public Byte getValue() {
        return value;
    }

    public String getDesc()
    {
        return desc;
    }
}
