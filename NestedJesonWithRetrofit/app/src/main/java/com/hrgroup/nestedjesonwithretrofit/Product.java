package com.hrgroup.nestedjesonwithretrofit;


public class Product {
    private String title;
    private String image;
    private String description;
    private String price;

    private Rating rating;

    public Product(String title, String image, String description, String price, Rating rating) {
        this.title = title;
        this.image = image;
        this.description = description;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
