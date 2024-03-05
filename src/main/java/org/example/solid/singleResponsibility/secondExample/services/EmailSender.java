package org.example.solid.singleResponsibility.secondExample.services;

import org.example.solid.singleResponsibility.secondExample.Order;

public class EmailSender {
    public void sendEmail(Order order){
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        //imitating of sending a message...
    }
}
