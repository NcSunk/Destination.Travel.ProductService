package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 入园方式
 */
public enum AdmissionMethodTypeEnum implements IEnum<Byte> {
    NoExchange((byte)1,"无需换票，直接验证入园"),
    Exchange((byte)2,"换票入园");

    @EnumValue
    @JsonValue
    private final byte value;
    private final String desc;

    AdmissionMethodTypeEnum(byte value,String desc)
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
