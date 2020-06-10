package com.example.skin_v5.model;

public class Mod {

    private String id;
    private String title;
    private int bigImages;;
    private String description;
    private int[] descriptionImages;

    public Mod(String id, String title, int bigImages, String description, int[] descriptionImages) {
        this.id = id;
        this.title = title;
        this.bigImages = bigImages;
        this.description = description;
        this.descriptionImages = descriptionImages;
    }
    public String getId() { return id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getBigImages() { return bigImages; }

    public void setBigImages(int bigImages) { this.bigImages = bigImages; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int[] getDescriptionImages() { return descriptionImages; }

    public void setDescriptionImages(int[] descriptionImages) { this.descriptionImages = descriptionImages; }
}
