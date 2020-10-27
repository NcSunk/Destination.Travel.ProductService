package com.destination.travel.dto;

import java.util.List;

public class OpenTimeDto {
    private long id;
    /**
     * 开始日期
     */
    private String openDateStart;
    /**
     * 截止日期
     */
    private String openDateEnd;
    /**
     * 星期集合
     */
    private List<Integer> openWeek;
    /**
     * 开始时间 小时
     */
    private String openHoursStart;
    /**
     * 截止时间 小时
     */
    private String openHoursEnd;
    /**
     * 截止入园时间
     */
    private String cutoffAdmissionTime;
}
