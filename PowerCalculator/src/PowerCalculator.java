/**
 * calculates the power of a number to which it is raised iteratively
 * @author shybal
 * @version 1.0
 */
public class PowerCalculator {
    public static void main(String[] args) {
        System.out.println(getPower(2,5));
    }

    /**
     * calculates the power of x iteratively
     * @param x is the base
     * @param n is the power to which the base is raised
     * @return the result of the computation
     */
    private static double getPower(double x, double n) {
        double result = x;
        int i = 0;
        while ( i <= n ) {
            result = result * x;
            i++;
        }
        return result;
    }
}
