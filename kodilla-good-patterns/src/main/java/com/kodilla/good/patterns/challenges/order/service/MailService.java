package com.kodilla.good.patterns.challenges.order.service;

public class MailService implements InformationService {
    public void inform(User user, StatusOrder statusOrder) {
        sendMail(user.getMail(), statusOrder.getStatusInformationContent());
    }

    private void sendMail(String mail, String message) {
        //send e-mail method
    }
}
