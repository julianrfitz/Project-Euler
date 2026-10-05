import java.math.BigInteger;

public class problem20 {

    private static BigInteger factorial(int n) {
        BigInteger sum = new BigInteger("1");

        for (int x = 2; x <= n; x++) {
            sum = sum.multiply(new BigInteger(Integer.toString(x)));
        }

        return sum;
    }

    private static int sumString(BigInteger in) {
        int sum = 0;

        char[] values = in.toString().toCharArray();

        for (char value : values) {
            sum += Character.getNumericValue(value);
        }

        return sum;
    }

    static void main() {
        System.out.println(sumString(factorial(100)));
    }
}
