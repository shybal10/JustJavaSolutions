import java.util.Scanner;

/**
 * class helps calculate the exponential expansion of a number
 * @author shybal
 * @version 1.0
 */
public class ExponentCalculator {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("enter the number of terms to be expanded to: ");
        int n = input.nextInt();
        System.out.println("the sum of the first n terms are: ");
        System.out.println(getSeriesExpansionSum(number,n));
        System.out.println(myExp(number,n));
        double i = 0.1;
        while (i <= 100) {
            check(i);
            i = i *10;
        }

    }
    /**
     * method calculates the expansion of the series
     * @param num as input
     * @param n represents the number of terms
     * @return the result of the computation
     */
    private static double getSeriesExpansionSum(double num, int n) {
        int i = 1;
        double sum = 1;
        int factorial;
        while (i <= n) {
            factorial = getFactorial(i);
            sum = sum +  Math.pow(num,i)/factorial;
            i++;
        }
        return sum;
    }
    /**
     * method calculates the sum more efficiently
     * @param num as input
     * @param n represents the number of terms
     * @return the result of the computation
     */
    private static double myExp(double num, int n) {
        double sum = 1;
        int i = 1;
        double nm = num;
        double dm = i;
        while(i <= n) {
            sum = sum + nm/dm;
            i++;
            nm = nm * num;
            dm = dm * i;
        }
        return sum;
    }
    /**
     * calculates factorial of a given number iteratively
     * @param num is the input
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
    /**
     * calculates the exponent for various values of number
     * @param num is the input
     */
    private static void check(double num) {
        System.out.println("----------------------------------");
        System.out.println(getSeriesExpansionSum(num,20)+"\t"+myExp(num,20)+"\t"+Math.exp(num));
        //System.out.println(myExp(num,10));
        //System.out.println(Math.exp(num));
    }
    /**
     * method calculates the sum more efficiently
     * @param num as input
     * @param n represents the number of terms
     * @return the result of the computation
     */
    private static double myNegExp(double num, int n) {
        double sum = 1;
        int i = 1;
        double nm = num;
        double dm = i;
        while(i <= n) {
            sum = sum + nm/dm;
            i++;
            nm = nm * num * (-1);
            dm = dm * i;
        }
        return sum;
    }
}
