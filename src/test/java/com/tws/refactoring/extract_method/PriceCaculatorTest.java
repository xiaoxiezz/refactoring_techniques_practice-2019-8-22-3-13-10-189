package com.tws.refactoring.extract_method;

import static org.junit.Assert.assertEquals;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;

import com.tws.refactoring.extract_variable.PriceCalculator;




public class PriceCaculatorTest {
	@Test
	public void should_be_655_when_given_600() {
		//given
		int quantity=600;
		int itemPrice=1;
		double result=0.0;
		PriceCalculator priceCalculator=new PriceCalculator();
		
		
//		when
		result = priceCalculator.getPrice(quantity, itemPrice);
//		then
		assertEquals(655.0, result,0.01);
	}

}
