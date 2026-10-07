import java.math.BigInteger;

public class problem15 {

    private static BigInteger getn(int rowsInt) {
        BigInteger numerator = BigInteger.valueOf(rowsInt * 2);
        BigInteger denominator = BigInteger.ONE;

        for (int n = rowsInt * 2 - 1; n > rowsInt; n--) {
            numerator = numerator.multiply(BigInteger.valueOf(n));
        }

        for (int n = rowsInt; n > 0; n--) {
            denominator = denominator.multiply(BigInteger.valueOf(n));
        }

        return numerator.divide(denominator);
    }

    static void main(String[] args) {
        System.out.println(getn(20));
    }
}