package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 儿童预订限制
 */
public enum ChildBookLimitEnum implements IEnum<Byte> {
    Ok((byte)1,"允许"),
    No((byte)2,"不允许");

    @EnumValue
    @JsonValue
    private final byte value;
    private final String desc;

    ChildBookLimitEnum(byte value,String desc)
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
