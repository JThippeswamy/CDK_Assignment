package com.cdk.component;

import com.cdk.service.Price;

public class Customer extends CalcPrice {
	
	private float purchaseAmount;

	public Customer(float purchaseAmount, Price price) {
		super(price);
		this.purchaseAmount = purchaseAmount;
	}

	@Override
	public Float calculate() {
		return price.calculate(purchaseAmount);
	}
}