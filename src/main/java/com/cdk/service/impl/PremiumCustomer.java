package com.cdk.service.impl;

import com.cdk.service.Price;
import static com.cdk.utils.ApplicationConstants.*;

public class PremiumCustomer implements Price {

	@Override
	public Float calculate(float purchaseAmount) {
		return this.calculateDiscountedPrice(purchaseAmount);
	}

	private float calculateDiscountedPrice(float purchaseAmount) {
		float total = 0;
		if (purchaseAmount <= FOUR_THOUSAND) {
			total = purchaseAmount - (float) (purchaseAmount * TEN_PERCENT);
		}
		if (purchaseAmount > FOUR_THOUSAND && purchaseAmount <= EIGHT_THOUSAND) {
			float secondSlab = purchaseAmount - FOUR_THOUSAND;
			secondSlab = secondSlab - (float) (secondSlab * FIFTEEN_PERCENT);
			float firstSlab = EIGHT_THOUSAND - FOUR_THOUSAND;
			total = firstSlab - (float) (firstSlab * TEN_PERCENT);
			total = total + secondSlab;
		}
		if (purchaseAmount > EIGHT_THOUSAND && purchaseAmount <= TWELVE_THOUSAND) {
			float thirdSlab = purchaseAmount - EIGHT_THOUSAND;
			thirdSlab = thirdSlab - (float) (thirdSlab * TWENTY_PERCENT);
			float secondSlab = EIGHT_THOUSAND - FOUR_THOUSAND;
			secondSlab = secondSlab - (float) (secondSlab * FIFTEEN_PERCENT);
			float firstSlab = EIGHT_THOUSAND - FOUR_THOUSAND;
			total = firstSlab - (float) (firstSlab * TEN_PERCENT);
			total = total + secondSlab + thirdSlab;
		}
		if (purchaseAmount > TWELVE_THOUSAND) {
			float fourthSlab = purchaseAmount - TWELVE_THOUSAND;
			fourthSlab = fourthSlab - (float) (fourthSlab * THIRTY_PERCENT);
			float thirdSlab = EIGHT_THOUSAND - FOUR_THOUSAND;
			thirdSlab = thirdSlab - (float) (thirdSlab * TWENTY_PERCENT);
			float secondSlab = EIGHT_THOUSAND - FOUR_THOUSAND;
			secondSlab = secondSlab - (float) (secondSlab * FIFTEEN_PERCENT);
			float firstSlab = EIGHT_THOUSAND - FOUR_THOUSAND;
			total = firstSlab - (float) (firstSlab * TEN_PERCENT);
			total = total + secondSlab + thirdSlab + fourthSlab;
		}
		return total;
	}
}