package com.tws.refactoring.extract_variable;

public class PriceCalculator {
	
   public double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
    	double discountStartPrice=500.0;
    	double discountRate = 0.05;
    	double postRate = 0.1;
    	double maxPostMoney=100.0;
	   
    	double basePrice=quantity * itemPrice;
    	double discount=Math.max(0, quantity - discountStartPrice) * itemPrice * discountRate;
    	double shippingCost=Math.min(quantity * itemPrice * postRate, maxPostMoney);
    	double result=basePrice-discount+shippingCost;
        
    	return result;
    }
}
