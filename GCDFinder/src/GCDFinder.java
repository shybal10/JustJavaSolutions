/**
 * finds the Gcd of two numbers using Eucleds algorithm
 * @author shybal
 * @version 1.0
 */
public class GCDFinder {
    public static void main(String[] args) {
        System.out.println(getGcd(36,20));
    }
    private static int getGcd(int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        } else return getGcd(b,r);
    }
}
