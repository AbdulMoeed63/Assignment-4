import java.util.Scanner;

public class MinimumProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the non zero product: ");
        int num = sc.nextInt();
        System.out.println("The minimum nonzero product is: " + nonZeroProd(num));
    }
    private static final long MOD = 1000000007;

    public static int nonZeroProd(int p) {
        if (p == 1) {
            return 1;
        }
        long maxValue = (1L << p) - 2;
        long count = (1L << (p - 1)) - 1;
        long maxProduct = powMod(maxValue, count, MOD);

        long result = (maxProduct * ((maxValue + 1) % MOD)) % MOD;
        return (int) result;
    }

    private static long powMod(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
