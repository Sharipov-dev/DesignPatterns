package org.example.solid.openClosed.services;

import org.example.solid.openClosed.Order;

public class PostAndPreOrderSaving extends OrderSaving{

    @Override
    public boolean save(Order order){
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
