package com.kodilla.good.patterns.challenges.food2door;

class UserOrderProcessor {
    private final OrderServicesFromSuppliers orderServicesFromSuppliers;
    private final InformationService informationService;
    private final UserOrderRepository userOrderRepository;

    public UserOrderProcessor(OrderServicesFromSuppliers orderServicesFromSuppliers, InformationService informationService, UserOrderRepository userOrderRepository) {
        this.orderServicesFromSuppliers = orderServicesFromSuppliers;
        this.informationService = informationService;
        this.userOrderRepository = userOrderRepository;
    }

    public UserOrderDto process(UserOrderRequest userOrderRequest) {
        boolean isOrdered = orderServicesFromSuppliers.order(userOrderRequest.getUserOrderProductsMap());

        if(isOrdered) {
            informationService.inform(userOrderRequest.getUser(), userOrderRequest.getStatusOrder());
            userOrderRepository.createOrder(userOrderRequest.getUser(), userOrderRequest.getUserOrderProductsMap(), userOrderRequest.getStatusOrder());
            return new UserOrderDto(userOrderRequest.getUser(), true);
        } else {
            return new UserOrderDto(userOrderRequest.getUser(), false);
        }
    }
}
