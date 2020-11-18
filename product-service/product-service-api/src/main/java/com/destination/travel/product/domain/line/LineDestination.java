package com.destination.travel.product.domain.line;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.common.enums.DataStatusEnum;

@TableName("travel_line_destination")
public class LineDestination extends BaseEntity {
    /**
     * 类型：1-城市，2-自定义
     */
    private byte classify;
    private long provinceId;
    private long provinceName;
    private long cityId;
    private String cityName;
    private boolean isHot;
    private int sortNo;
    @TableField("data_status")
    private DataStatusEnum status;

    public byte getClassify() {
        return classify;
    }

    public void setClassify(byte classify) {
        this.classify = classify;
    }

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public long getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(long provinceName) {
        this.provinceName = provinceName;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
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
