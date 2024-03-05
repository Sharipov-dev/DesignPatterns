package org.example.solid.liskov.wrongExample.services;

import org.example.solid.liskov.wrongExample.Order;

public class OrderSaving {
    public boolean save(Order order){
        if(order.isValid()) {
            GlobalStorage.orderStorage.add(order);
            return true;
        }
        return false;

    }
}
