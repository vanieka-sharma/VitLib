package com.example.vit_lib;

public class UploadMat {
    public String name;
    public String url;

    public UploadMat() {
    }

    public UploadMat(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }
    public String getUrl() {
        return url;
    }

}