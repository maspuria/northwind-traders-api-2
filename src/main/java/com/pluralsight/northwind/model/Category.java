package com.pluralsight.northwind.model;

public class Category {
    // field members
    private int categoryId;
    private String categoryName;
    // constructor
    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    // getter and setter
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    // toString

    @Override
    public String toString() {
        return "\nCategory {" +
                "categoryId = " + categoryId +
                ", categoryName = '" + categoryName + '\'' +
                '}';
    }
}
