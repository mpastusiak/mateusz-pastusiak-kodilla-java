package com.kodilla.good.patterns.challenges;

public class Product {
    private String name;
    private int catalogNumber;
    private int quantityInStock;

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
