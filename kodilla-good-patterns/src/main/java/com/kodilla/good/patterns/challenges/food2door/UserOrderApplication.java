package com.kodilla.good.patterns.challenges.food2door;

public class UserOrderApplication {
    public static void main(String[] args) {
        UserOrderRequestRetriever userOrderRequestRetriever = new UserOrderRequestRetriever();
        UserOrderRequest userOrderRequest = userOrderRequestRetriever.retrieve();

        UserOrderProcessor userOrderProcessor = new UserOrderProcessor(new OrderServicesFromSuppliers(), new MailService(),
                new UserOrderRepository());
        userOrderProcessor.process(userOrderRequest);
    }
}
