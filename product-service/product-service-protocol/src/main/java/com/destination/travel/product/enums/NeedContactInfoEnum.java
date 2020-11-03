package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 需要联系人信息
 */
public enum NeedContactInfoEnum implements IEnum<Byte> {
    NoNeed((byte)0,"不需要"),
    Need((byte)1,"需要");

    NeedContactInfoEnum(byte value,String desc)
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
