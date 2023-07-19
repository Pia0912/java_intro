package bigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Pi {
    public static BigDecimal calculatePi(int numDigits) {
        BigDecimal pi = new BigDecimal("0");
        BigDecimal term1 = new BigDecimal("16").setScale(numDigits + 2, RoundingMode.HALF_UP);
        BigDecimal term2 = new BigDecimal("4").setScale(numDigits + 2, RoundingMode.HALF_UP);

        for (int k = 0; k <= numDigits; k++) {
            BigDecimal numerator1 = BigDecimal.ONE.divide(BigDecimal.valueOf(5).pow(2 * k + 1), numDigits + 2, RoundingMode.HALF_UP);
            BigDecimal numerator2 = BigDecimal.ONE.divide(BigDecimal.valueOf(239).pow(2 * k + 1), numDigits + 2, RoundingMode.HALF_UP);
            BigDecimal denominator = BigDecimal.valueOf(2L * k + 1);

            BigDecimal term3 = numerator1.divide(denominator, numDigits + 2, RoundingMode.HALF_UP);
            BigDecimal term4 = numerator2.divide(denominator, numDigits + 2, RoundingMode.HALF_UP);

            BigDecimal term = term1.divide(term2.multiply(denominator), numDigits + 2, RoundingMode.HALF_UP)
                    .multiply(term3.subtract(term4))
                    .multiply(term2);

            pi = pi.add(term);
        }

        return pi.round(new MathContext(numDigits, RoundingMode.HALF_UP));
    }

    public static void main(String[] args) {
        int numDigits = 10;
        BigDecimal pi = calculatePi(numDigits);
        System.out.println("Pi: " + pi);
    }
}
