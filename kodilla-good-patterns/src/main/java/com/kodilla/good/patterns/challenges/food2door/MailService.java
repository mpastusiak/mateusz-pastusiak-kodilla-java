package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.order.service.StatusOrder;

public class MailService implements InformationService {
    public void inform(User user, StatusOrder statusOrder) {
        sendMail(user.getMail(), statusOrder.getStatusInformationContent());
    }

    private void sendMail(String mail, String message) {
        System.out.println("I'm send e-mail to " + mail);
        System.out.println(message);
    }
}
