package com.example.student.express;


public class Product {
    private final String title;
    private final String category;
    private final String description;
    private int[] imageArrayId = new int[3];
    private String videoUrl;
    private String allDescription;
    private boolean isFavourite;
    private boolean isStore;
    private float star;
    private final int price;


    public void setAllDescription(String allDescription) {
        this.allDescription = allDescription;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public void setStore(boolean store) {
        isStore = store;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int[] getImageArrayId() {
        return imageArrayId;
    }

    public String getAllDescription() {
        return allDescription;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public boolean isStore() {
        return isStore;
    }

    public float getStar() {
        return star;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public Product(final String title, final String description, final String category, final int price, final int[] imageArrayId) {
        this.category = category;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imageArrayId = imageArrayId;

    }
}

