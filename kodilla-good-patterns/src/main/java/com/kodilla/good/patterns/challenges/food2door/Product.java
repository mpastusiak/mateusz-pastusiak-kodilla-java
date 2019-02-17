package com.kodilla.good.patterns.challenges.food2door;

class Product {
    private final String productName;
    private final int productNumber;
    private final Supplier supplier;

    public Product(String productName, int productNumber, Supplier supplier) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
