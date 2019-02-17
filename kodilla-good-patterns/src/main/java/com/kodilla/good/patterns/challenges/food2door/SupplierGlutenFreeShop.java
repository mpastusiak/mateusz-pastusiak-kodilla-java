package com.kodilla.good.patterns.challenges.food2door;

public class SupplierGlutenFreeShop extends Supplier {
    private String name = "GlutenFreeShop";

    @Override
    public boolean process(Product product, int quantity) {
        connectWithSupplier();
        return suppliersDataRetriever.getGlutenFreeShopResponse(product.getProductName(), quantity);
    }
}
