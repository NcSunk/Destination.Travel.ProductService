package com.destination.travel.product.domain.mall;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.common.enums.DataStatusEnum;

@TableName("mall_label")
public class MallLabel extends BaseEntity {
    private String name;
    @TableField("data_status")
    private DataStatusEnum status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DataStatusEnum status) {
        this.status = status;
    }
}
