package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DiscountCalculator {
    public static BigDecimal calculateDiscountedPrice(BigDecimal originalPrice, int discountPercentage) {
        if (discountPercentage < 0) {
            throw new IllegalArgumentException("Discount percentage can't be negative!");
        }

        BigDecimal discount = originalPrice.multiply(BigDecimal.valueOf(discountPercentage)).divide(BigDecimal.valueOf(100));
        BigDecimal discountedPrice = originalPrice.subtract(discount);
        return discountedPrice.setScale(2, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal originalPrice = new BigDecimal("100.00");
        int discountPercentage = 20;
        BigDecimal discountedPrice = calculateDiscountedPrice(originalPrice, discountPercentage);
        System.out.println("Discounted Price: " + discountedPrice + "€");

        originalPrice = new BigDecimal("50.00");
        discountPercentage = 10;
        discountedPrice = calculateDiscountedPrice(originalPrice, discountPercentage);
        System.out.println("Discounted Price: " + discountedPrice + "€");
    }
}
