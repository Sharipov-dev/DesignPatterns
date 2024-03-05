package org.example.solid.singleResponsibility.secondExample.services;

import org.example.solid.singleResponsibility.secondExample.Order;

public class OrderProcessor {
    public void process(Order order){
        EmailSender emailSender = new EmailSender();
        OrderSaving orderSaving = new OrderSaving();
        if (orderSaving.save(order)){
            emailSender.sendEmail(order);
        } else{
            System.out.println("Fail to save the order");
        }
    }
}
