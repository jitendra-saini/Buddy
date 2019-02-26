package com.example.buddy.Model;

public class Horizontal_recycler_view {


    String title;
    int imageUri;

    public Horizontal_recycler_view(String title, int imageUri) {
        this.title = title;
        this.imageUri = imageUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageUri() {
        return imageUri;
    }

    public void setImageUri(int imageUri) {
        this.imageUri = imageUri;
    }
}
