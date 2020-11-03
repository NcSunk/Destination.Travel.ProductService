package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StayInClassifyEnum implements IEnum<Byte> {
    ;

    @EnumValue
    @JsonValue
    private final byte value;
    private final String desc;

    StayInClassifyEnum(byte value,String desc)
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
