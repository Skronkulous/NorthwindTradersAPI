package com.pluralsight.model;

public class Product {
    private int productID, categoryID;
    private String productName, qpu;
    private double unitPrice;

    public Product(int productID, int categoryID, String productName, String qpu, double unitPrice) {
        this.productID = productID;
        this.categoryID = categoryID;
        this.productName = productName;
        this.qpu = qpu;
        this.unitPrice = unitPrice;
    }

    public Product(){

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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getQpu() {
        return qpu;
    }

    public void setQpu(String qpu) {
        this.qpu = qpu;
    }
}
