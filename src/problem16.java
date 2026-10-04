import java.math.BigInteger;

public class problem16 {

    private static int sumString(BigInteger in) {
        int sum = 0;

        char[] values = in.toString().toCharArray();

        for (char value : values) {
            sum += Character.getNumericValue(value);
        }

        return sum;
    }

    private static BigInteger pow(int base, int power) {
        // base case
        if (power == 0) {
            return new BigInteger("1");
        }

        // recursive work
        BigInteger result = pow(base, power / 2);
        result = result.multiply(result);

        // check if power is odd
        if (power % 2 == 1) {
            result = result.multiply(new BigInteger(String.valueOf(base)));
        }
        return result;
    }

    static void main() {
        System.out.println(sumString(pow(2, 1000)));
    }
}
