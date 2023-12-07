package com.example.multiple.dto;

public class FileDto {
    private int id;
    private String orgName;
    private String savedFileName;
    private String savedPathName;
    private long savedFileSize;
    private String folderName;
    private String ext;
    private String configCode;

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getSavedFileName() {
        return savedFileName;
    }

    public void setSavedFileName(String savedFileName) {
        this.savedFileName = savedFileName;
    }

    public String getSavedPathName() {
        return savedPathName;
    }

    public void setSavedPathName(String savedPathName) {
        this.savedPathName = savedPathName;
    }

    public long getSavedFileSize() {
        return savedFileSize;
    }

    public void setSavedFileSize(long savedFileSize) {
        this.savedFileSize = savedFileSize;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
}
