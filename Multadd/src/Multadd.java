import java.math.*;
/**
 * performs multadditionization operations using the multadd method
 * @author shybal
 * @version 1.0
 */
public class Multadd {
    public static void main(String[] args) {
        //double num1,num2,num3;
        //num1 = Math.log10(10);
        //num3 = Math.log10(20);
        //num2 = 1;
        //num1 = 1;
        //num3 = Math.sin(Math.toDegrees(Math.PI/4));
        //num1 = Math.cos(Math.toDegrees(Math.PI/4));
        //num2 = 2.0;
        //System.out.println(multAdd(num1,num2,num3));
        System.out.println(yikes(2));
    }

    /**
     * performs the multadditionization
     * @param num1
     * @param num2
     * @param num3
     * @return result of multAdd computation
     */
    private static double multAdd(double num1, double num2, double num3) {
        return num1 * num2 + num3;
    }

    /**
     * performs complex math computation
     * @param x
     * @return computation result
     */
    private static double yikes(double x) {
        return multAdd(x,Math.exp(-x),Math.sqrt(1-Math.exp(-x)));
    }

}
