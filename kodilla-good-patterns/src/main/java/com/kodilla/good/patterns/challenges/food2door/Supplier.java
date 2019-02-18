package com.kodilla.good.patterns.challenges.food2door;

public abstract class Supplier {
    private String name;

    void connectWithSupplier() {
        System.out.println("Connect with Supplier!");
    }

    public abstract boolean process(Product product, int quantity);
}
