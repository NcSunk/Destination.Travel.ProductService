package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 成团方式
 */
public enum CloudWayEnum implements IEnum<Byte> {
    Departure((byte)1,"出发地成团"),
    Destination((byte)2,"目的地成团");

    CloudWayEnum(byte value,String desc)
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
