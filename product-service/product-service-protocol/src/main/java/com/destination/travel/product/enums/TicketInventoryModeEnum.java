package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TicketInventoryModeEnum implements IEnum<Byte> {
    NoLimit((byte)1,"无库存限制"),
    Limit((byte)2,"有库存限制");

    @EnumValue
    @JsonValue
    private final byte value;
    private final String desc;

    TicketInventoryModeEnum(byte value,String desc)
    {
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
