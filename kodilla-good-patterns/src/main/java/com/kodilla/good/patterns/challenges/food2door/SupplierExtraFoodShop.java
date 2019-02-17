package com.kodilla.good.patterns.challenges.food2door;

public class SupplierExtraFoodShop extends Supplier {
    private String name = "ExtraFoodShop";

    @Override
    public boolean process(Product product, int quantity) {
        connectWithSupplier();
        return getProductQuantity(product.getProductNumber()) >= quantity;
    }

    private int getProductQuantity(int productNumber) {
        return suppliersDataRetriever.getExtraFoodShopProductsMap().get(productNumber);
    }
}
