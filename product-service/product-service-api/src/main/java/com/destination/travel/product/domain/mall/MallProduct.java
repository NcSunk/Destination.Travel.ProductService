package com.destination.travel.product.domain.mall;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.common.enums.DataStatusEnum;

import java.math.BigDecimal;
import java.util.Date;

@TableName("mall_product")
public class MallProduct extends BaseEntity {
    private String no;
    private String name;
    private String description;
    private String image;
    private long supplierId;
    private String supplierName;
    private long brandId;
    private long categoryId;
    private int limitCount;
    private int pageViewCount;
    private int salesCount;
    private int commentCount;
    private int stockThresholdCount;
    private int virtualSalesCount;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
    private Date upOrDownTime;
    private long freightPolicyId;
    private int sortNo;
    private String remark;
    @TableField("data_status")
    private DataStatusEnum status;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public int getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(int limitCount) {
        this.limitCount = limitCount;
    }

    public int getPageViewCount() {
        return pageViewCount;
    }

    public void setPageViewCount(int pageViewCount) {
        this.pageViewCount = pageViewCount;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getStockThresholdCount() {
        return stockThresholdCount;
    }

    public void setStockThresholdCount(int stockThresholdCount) {
        this.stockThresholdCount = stockThresholdCount;
    }

    public int getVirtualSalesCount() {
        return virtualSalesCount;
    }

    public void setVirtualSalesCount(int virtualSalesCount) {
        this.virtualSalesCount = virtualSalesCount;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Date getUpOrDownTime() {
        return upOrDownTime;
    }

    public void setUpOrDownTime(Date upOrDownTime) {
        this.upOrDownTime = upOrDownTime;
    }

    public long getFreightPolicyId() {
        return freightPolicyId;
    }

    public void setFreightPolicyId(long freightPolicyId) {
        this.freightPolicyId = freightPolicyId;
    }

    public int getSortNo() {
        return sortNo;
    }

    public void setSortNo(int sortNo) {
        this.sortNo = sortNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public DataStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DataStatusEnum status) {
        this.status = status;
    }
}
