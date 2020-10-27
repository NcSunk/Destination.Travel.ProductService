package com.destination.travel.enums;

import com.baomidou.mybatisplus.annotation.IEnum;

/**
 * 数据状态
 */
public enum DataStatusEnum implements IEnum<Byte> {
    Enabled((byte)1),
    Disabled((byte)0);

    DataStatusEnum(final byte value)
    {
        this.value=value;
    }

    private final byte value;

    @Override
    public Byte getValue() {
        return value;
    }
}
