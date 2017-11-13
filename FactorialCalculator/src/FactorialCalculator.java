/**
 * class calculates the factorial of a given number iteratively
 * @author shybal
 * @version 1.0
 */
public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
    /**
     * calculates factorial of a given number iteratively
     * @param num id the input
     * @return factorial of the input
     */
    private static int getFactorial(int num) {
        int result = 1;
        while (num > 0) {
            result = result * num;
            num--;
        }
        return result;
    }
}
