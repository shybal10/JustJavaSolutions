/**
 * class used to validate the Ackerman function using recursion
 * @author shybal
 * @version 1.0
 */
public class AckermanFunctionChecker {
    public static void main(String[] args) {
        int m, n;
        m = 2;
        n = 2;
        System.out.println(getAckerman(m,n));
    }
    /**
     * method validates Ackerman function using recursion
     * @param m variable 1
     * @param n variable 2
     */
    private static int getAckerman(int m, int n) {
        if ((m > 0) && (n == 0)) {
            return getAckerman(m-1, 1);
        } else if ((m > 0) && (n > 0)) {
            return getAckerman(m-1, getAckerman(m,n-1));
        } else
        return n+1;
    }
}
