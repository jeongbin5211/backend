package com.example.fileupload.dto;

public class FileDto {
    private String originalName;
    private String newName;
    private String savedPathFileName;
    private Long savedFileSize;

    public FileDto(String originalName, String newName, String savedPathFileName, Long savedFileSize) {
        this.originalName = originalName;
        this.newName = newName;
        this.savedPathFileName = savedPathFileName;
        this.savedFileSize = savedFileSize;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getSavedPathFileName() {
        return savedPathFileName;
    }

    public void setSavedPathFileName(String savedPathFileName) {
        this.savedPathFileName = savedPathFileName;
    }

    public Long getSavedFileSize() {
        return savedFileSize;
    }

    public void setSavedFileSize(Long savedFileSize) {
        this.savedFileSize = savedFileSize;
    }
}
