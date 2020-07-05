package com.cdk.service.impl;

import com.cdk.service.Price;

import static com.cdk.utils.ApplicationConstants.*;

public class RegularCustomer implements Price {

	@Override
	public Float calculate(float purchaseAmount) {
		return this.calculateDiscountedPrice(purchaseAmount);
	}

	private float calculateDiscountedPrice(float purchaseAmount) {
		float total = 0;
		if (purchaseAmount > FIVE_THOUSAND && purchaseAmount <= TEN_THOUSAND) {
			float firstSlab = purchaseAmount - FIVE_THOUSAND;
			firstSlab = firstSlab - (float) (firstSlab * TEN_PERCENT);
			total = FIVE_THOUSAND + firstSlab;
		} else if (purchaseAmount > TEN_THOUSAND) {
			float secondSlab = purchaseAmount - TEN_THOUSAND;
			secondSlab = secondSlab - (float) (secondSlab * TWENTY_PERCENT);
			float firstSlab = TEN_THOUSAND - FIVE_THOUSAND;
			firstSlab = firstSlab - (float) (firstSlab * TEN_PERCENT);
			System.out.println(" firstSlab:  " + firstSlab);
			total = FIVE_THOUSAND + firstSlab;
			total = total + secondSlab;
		} else if (purchaseAmount <= FIVE_THOUSAND && purchaseAmount >= ZERO) {
			total = purchaseAmount;
		} else {
			return purchaseAmount;
		}
		return total;
	}
}