package org.example.solid.singleResponsibility.secondExample.services;

import org.example.solid.singleResponsibility.secondExample.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class GlobalStorage {
    public static HashSet<String> globalStorage = new HashSet<>();
    public static ArrayList<Order> orderStorage = new ArrayList<>();
}
