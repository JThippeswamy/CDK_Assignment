package com.cdk.component;

import com.cdk.service.Price;

public abstract class CalcPrice {
	
	protected Price price;

	protected CalcPrice(Price price) {
		this.price = price;
	}

	public abstract Float calculate();
}