package com.example.buddy.Model;

public class Images {

    int Image;
    int type;

    public Images(int image, int type) {
        Image = image;
        this.type = type;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
