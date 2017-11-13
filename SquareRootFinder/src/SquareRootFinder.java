import java.util.Scanner;

/**
 * class used to find the approximate square root of a number without
 * using Math class
 * @author shybal
 * @version 1.0
 */
public class SquareRootFinder {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        double result = getRoot(num);
        System.out.println(result);
    }
    /**
     * method used to calculate the approximate square root
     * @param num the input number
     */
    private static double getRoot(double num) {
        double x1 , x2;
        x2 = num / 2.0;
        x1 = (x2 + num / x2) / 2.0;
        double temp = x2 - x1 ;
        while (Math.abs(temp) > 0.01) {
            x2 = x1;
            x1 = (x2 + num/x2) / 2;
            temp = x2 - x1;
        }
        return x1;
    }
}
