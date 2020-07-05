package com.cdk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CDKApplication {

	public static void main(String[] args) {
//		CalcCustomerPrice premium = new Customer(20000,new PremiumCustomer());
//		CalcCustomerPrice regular = new Customer(10000,new RegularCustomer());
//		System.out.println("Premium Customer Price : " + premium.calculate());
//		System.out.println("Regular Customer Price: " + regular.calculate());
		SpringApplication.run(CDKApplication.class, args);
	}

}
