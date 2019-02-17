package com.kodilla.good.patterns.challenges;

class OrderProcessor {
    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getStatusOrder());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderTime(), orderRequest.getProduct(),
                    orderRequest.getQuantity(), orderRequest.getStatusOrder());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}