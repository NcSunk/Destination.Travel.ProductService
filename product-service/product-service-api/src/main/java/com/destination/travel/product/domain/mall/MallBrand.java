package com.destination.travel.product.domain.mall;

import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.common.enums.DataStatusEnum;

@TableName("mall_brand")
public class MallBrand extends BaseEntity {
    private String Name;
    private String logo;
    private int sortNo;
    private DataStatusEnum status;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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
