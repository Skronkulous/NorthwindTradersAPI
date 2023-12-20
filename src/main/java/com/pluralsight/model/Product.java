package com.pluralsight.model;

public class Product {
    private int productID, categoryID;
    private String productName, categoryName;
    private double unitPrice;

    public Product(int productID, int categoryID, String productName, String categoryName, double unitPrice) {
        this.productID = productID;
        this.categoryID = categoryID;
        this.productName = productName;
        this.categoryName = categoryName;
        this.unitPrice = unitPrice;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
