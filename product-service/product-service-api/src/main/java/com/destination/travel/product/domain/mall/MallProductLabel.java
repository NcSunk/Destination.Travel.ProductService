package com.destination.travel.product.domain.mall;

import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;

@TableName("mall_product_label")
public class MallProductLabel extends BaseEntity {
    private long productId;
    private long labelId;
    private String labelName;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getLabelId() {
        return labelId;
    }

    public void setLabelId(long labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
