package com.kodilla.good.patterns.challenges.order.service;

public class Product {
    private final String name;
    private final int catalogNumber;
    private final int quantityInStock;

    public Product(String name, int catalogNumber, int quantityInStock) {
        this.name = name;
        this.catalogNumber = catalogNumber;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
}
