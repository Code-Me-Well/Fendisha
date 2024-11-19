package com.feisel.fendisha.models;

public class DetailedDailyMModel {
    int image;
    String name;
    String description;
    String rating;
    String price;
    String timing;

    public DetailedDailyMModel(String timing, String price, String rating, String description, String name, int image) {
        this.timing = timing;
        this.price = price;
        this.rating = rating;
        this.description = description;
        this.name = name;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
}
