package com.destination.travel.product.domain.line;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.destination.travel.common.domain.BaseEntity;
import com.destination.travel.common.enums.DataStatusEnum;

@TableName("travel_line_file")
public class LineFile extends BaseEntity {
    private long lineId;
    private byte fileType;
    private String fileUrl;
    private String fileUid;
    private String description;
    private boolean isCover;
    private int sortNo;
    @TableField("data_status")
    private DataStatusEnum status;

    public long getLineId() {
        return lineId;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
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

    public boolean isCover() {
        return isCover;
    }

    public void setCover(boolean cover) {
        isCover = cover;
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
