package com.tws.refactoring.extract_variable;

public class PriceCalculator {
	
	public double getBasePrice(int quantity, int itemPrice) {
		return quantity * itemPrice;
	}
	
	public double getDiscount(int quantity, int itemPrice) {
		int discountStartQuantity=500
		double discountRate = 0.05;
		double discount = Math.max(0, quantity - discountStartQuantity) * itemPrice * discountRate;
		return discount;
	}
	
	public double getShippingCost(int quantity, int itemPrice) {
		double postRate = 0.1;
    	double maxPostMoney=100.0;
    	double shippingCost = Math.min(quantity * itemPrice * postRate, maxPostMoney);
    	return shippingCost;
	}
	
   public double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
    	
    	double result = getBasePrice(quantity,itemPrice) - getDiscount(quantity,itemPrice) + getShippingCost(quantity,itemPrice);
        
    	return result;
    }
}
