package com.cdk.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdk.component.CalcPrice;
import com.cdk.component.Customer;
import com.cdk.service.impl.PremiumCustomer;
import com.cdk.service.impl.RegularCustomer;

@SpringBootTest
class CDKApplicationTests {

	@Test
	void contextLoads() {
	}
     
	@Test
	void testPremiumCustomer() {
		System.out.println(" Premium Customer Test Case");
		CalcPrice premium = new Customer(20000,new PremiumCustomer());
		Float price = premium.calculate();
		System.out.println(" Premium Customer Price : " + price);
		assertTrue(price == 15800F);
	}
	
	@Test
	void testRegularCustomer() {
		System.out.println(" Regular Customer Test Case");
		CalcPrice premium = new Customer(10000,new RegularCustomer());
		Float price = premium.calculate();
		System.out.println(" Regular Customer Price : " + price);
		assertTrue(price == 9500F);
	}
}
