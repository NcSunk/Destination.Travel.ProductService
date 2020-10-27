package com.destination.travel.dto;

public class ScenicFileDto {
    private byte fileType;
    private String fileUrl;
    private String description;
    private int sortNo;

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
}
