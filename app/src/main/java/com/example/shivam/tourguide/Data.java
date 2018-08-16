package com.example.shivam.tourguide;

public class Data {

    private int ratings;
    public String description;
    private int imageResourceId;
    private String phone_no;

    public Data(int ratings, String description, int imageResourceId, String phone_no) {
        this.ratings = ratings;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.phone_no = phone_no;
    }

    public int getRatings() {
        return ratings;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getPhone_no() {
        return phone_no;
    }

}
