package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 需要游玩人信息
 */
public enum NeedTouristInfoEnum implements IEnum<Byte> {
    NoNeed((byte)1,"不需要"),
    OnlyOne((byte)2,"只需要一位游玩人信息"),
    NeedAll((byte)3,"需要全部游玩人信息");

    @EnumValue
    @JsonValue
    private final byte value;
    private final String desc;

    NeedTouristInfoEnum(byte value,String desc)
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
