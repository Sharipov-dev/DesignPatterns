package org.example.solid.singleResponsibility.secondExample.services;

import org.example.solid.singleResponsibility.secondExample.Order;

public class OrderSaving {
    public boolean save(Order order){
        if(order.isValid()) {
            GlobalStorage.orderStorage.add(order);
            return true;
        }
        return false;

    }
}
