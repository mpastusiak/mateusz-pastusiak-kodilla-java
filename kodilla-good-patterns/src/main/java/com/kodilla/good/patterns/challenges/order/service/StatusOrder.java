package com.kodilla.good.patterns.challenges.order.service;

public class StatusOrder {
    private final String statusName;
    private final String statusInformationContent;

    public StatusOrder(String statusName, String statusInformationContent) {
        this.statusName = statusName;
        this.statusInformationContent = statusInformationContent;
    }

    public String getStatusName() {
        return statusName;
    }

    public String getStatusInformationContent() {
        return statusInformationContent;
    }
}
