package com.destination.travel.product.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 交通方式
 */
public enum MeansOfTransportationEnum implements IEnum<Byte> {
    AirPlane((byte)1,"飞机"),
    Train((byte)2,"火车"),
    Bus((byte)3,"汽车"),
    Ship((byte)4,"轮船");;

    @EnumValue
    @JsonValue
    private final byte value;
    private final String desc;

    MeansOfTransportationEnum(byte value,String desc)
    {
        this.value=value;
        this.desc=desc;
    }

    @Override
    public Byte getValue() {
        return null;
    }
}
