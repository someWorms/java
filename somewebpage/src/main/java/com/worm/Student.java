package com.worm;

import org.springframework.web.multipart.MultipartFile;

import java.beans.Transient;

public class Student {
    private String name;


    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
