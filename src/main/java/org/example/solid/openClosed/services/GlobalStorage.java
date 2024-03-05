package org.example.solid.openClosed.services;

import org.example.solid.openClosed.Order;

import java.util.ArrayList;
import java.util.HashSet;

public class GlobalStorage {
    public static HashSet<String> globalStorage = new HashSet<>();
    public static ArrayList<Order> orderStorage = new ArrayList<>();
}
