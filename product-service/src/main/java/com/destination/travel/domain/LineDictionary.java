package com.destination.travel.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.destination.travel.enums.DataStatusEnum;
import com.destination.travel.enums.LineDictionaryEnum;

/**
 * 线路字典
 */
public class LineDictionary extends BaseEntity{
    /**
     * 字典类型
     */
    private LineDictionaryEnum dictionaryType;
    /**
     * 名称
     */
    private String name;
    /**
     * 排序因子
     */
    private int sortNo;
    @TableField("data_status")
    private DataStatusEnum status;

    public LineDictionaryEnum getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(LineDictionaryEnum dictionaryType) {
        this.dictionaryType = dictionaryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSortNo() {
        return sortNo;
    }

    public void setSortNo(int sortNo) {
        this.sortNo = sortNo;
    }

    public DataStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DataStatusEnum status) {
        this.status = status;
    }
}
