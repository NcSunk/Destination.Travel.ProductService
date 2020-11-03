package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 提前购买类型
 */
public enum AdvanceBuyTypeEnum implements IEnum<Byte> {
    Any((byte)1,"任意时间购买"),
    TheDay((byte)2,"当天提前购买"),
    PointTime((byte)3,"指定游玩日期购买");

    @EnumValue
    @JsonValue
    private final byte value;
    private final String desc;

    AdvanceBuyTypeEnum(byte value,String desc)
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
