package com.destination.travel.product.domain.mall;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.common.enums.DataStatusEnum;

@TableName("mall_product_file")
public class MallProductFile extends BaseEntity {
    private long productId;
    private byte classify;
    private byte fileType;
    private String fileUrl;
    private String fileUid;
    private String description;
    private int sortNo;
    @TableField("data_status")
    private DataStatusEnum status;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public byte getClassify() {
        return classify;
    }

    public void setClassify(byte classify) {
        this.classify = classify;
    }

    public byte getFileType() {
        return fileType;
    }

    public void setFileType(byte fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileUid() {
        return fileUid;
    }

    public void setFileUid(String fileUid) {
        this.fileUid = fileUid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
