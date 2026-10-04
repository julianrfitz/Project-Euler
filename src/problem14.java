public class problem14 {

    public static int getn() {
        return getn(1000000);
    }

    public static int getn(int maxN) {
        int largestN = 1;
        int largestSize = 1;

        for (int start = 1; start < maxN; start++) {
            long n = start;
            int thisNSize = 1;

            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }

                thisNSize++;
            }

            if (thisNSize > largestSize) {
                largestSize = thisNSize;
                largestN = start;
            }
        }

        return largestN;
    }

    public static void main(String[] args) {
        System.out.println(getn());
    }
}