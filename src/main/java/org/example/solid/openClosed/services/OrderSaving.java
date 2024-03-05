package org.example.solid.openClosed.services;

import org.example.solid.openClosed.Order;

public class OrderSaving {
    public boolean save(Order order){
        if(order.isValid()) {
            GlobalStorage.orderStorage.add(order);
            return true;
        }
        return false;

    }
}
