package com.example.tugas1;

public class Student {
    private String name;
    private String nim;
    private String imageUrl;

    public Student(String name, String nim, String imageUrl) {
        this.name = name;
        this.nim = nim;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
