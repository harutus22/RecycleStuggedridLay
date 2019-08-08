package com.example.recyclestuggedridlay;

public class MovieExample {

    private int imageId;
    private String imageName;

    public MovieExample(int imageId, String imageName){
        this.imageId = imageId;
        this.imageName = imageName;
    }

    public int getImageId() {
        return imageId;
    }

    public String getImageName() {
        return imageName;
    }
}
