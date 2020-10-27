package com.destination.travel.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ScenicGradeEnum implements IEnum<Byte> {
    A((byte)1,"A"),
    AA((byte)2,"2A"),
    AAA((byte)3,"3A"),
    AAAA((byte)4,"4A"),
    AAAAA((byte)5,"5A"),;

    ScenicGradeEnum(byte value,String desc)
    {
        this.value=value;
        this.desc=desc;
    }

    private final byte value;
    private final String desc;

    @Override
    @JsonValue
    public Byte getValue() {
        return value;
    }

    public String getDesc(){return desc;}
}
