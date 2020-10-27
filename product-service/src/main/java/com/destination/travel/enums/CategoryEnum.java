package com.destination.travel.enums;

/**
 * 类别
 */
public enum CategoryEnum {
    /**
     * 景区
     */
    Scenic((byte)1),
    /**
     * 线路
     */
    Line((byte)2),
    /**
     * 商品
     */
    Goods((byte)3),
    /**
     * 酒店
     */
    Hotel((byte)4);
    CategoryEnum(byte value){}
}
