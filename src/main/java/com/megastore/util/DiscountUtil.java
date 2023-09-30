package com.megastore.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class DiscountUtil {

    private DiscountUtil() {
    }

    public static BigDecimal countDiscountPrice(BigDecimal price, BigDecimal discount) {
        if (discount != null && discount.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal discountedPrice = price.subtract(price.multiply(discount.divide(BigDecimal.valueOf(100))));
            return discountedPrice.setScale(2, RoundingMode.HALF_UP);
        }
        return price.setScale(2, RoundingMode.HALF_UP);
    }
}

