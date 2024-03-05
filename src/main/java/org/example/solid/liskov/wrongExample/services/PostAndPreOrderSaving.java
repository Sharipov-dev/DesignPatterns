package org.example.solid.liskov.wrongExample.services;

import org.example.solid.liskov.wrongExample.Order;

public class PostAndPreOrderSaving extends OrderSaving {

    @Override
    public boolean save(Order order){
        if(order == null){
            throw new RuntimeException("Order is valid");
        }
        preSaving(order);
        postSaving(order);
        return true;
    }

    public void preSaving(Order order){
        //some code
    }
    public void postSaving(Order order){
        //some code
    }

}
