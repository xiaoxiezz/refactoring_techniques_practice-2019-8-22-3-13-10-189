package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double totalAmount = 0.0;

        // print banner
       printBanner();
       
        // print owings
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            totalAmount += each.getAmount();
        }

        // print details
        printDetails(name, totalAmount);
    }
    
    void printBanner() {
    	 System.out.println ("*****************************\r\n"+
     			"****** Customer totals ******\r\n"+
     			"*****************************");

    }
    
    void printDetails(String name, double outstanding) {
    	System.out.println("name: " + name+"\r\n"+"amount: " + outstanding);
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
