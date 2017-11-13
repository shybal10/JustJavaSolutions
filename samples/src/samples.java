/**
 * one of the sample programs illustrated in thinks java
 * @author shybal
 * @version 1.0
 */
public class samples {
    public static void main(String[] args) {
        boolean flag1 = isHoopy(202);       // Returns true
        boolean flag2 = isFrabjuous(202);   // Returns true
        System.out.println(flag1);
        System.out.println(flag2);
        if (flag1 && flag2) {
            System.out.println("ping!");       // Prints ping!
        }
        if (flag1 || flag2) {
            System.out.println("pong!");       // Prints pong!
        }
    }

    public static boolean isHoopy(int x) {
        boolean hoopyFlag;
        if (x % 2 == 0) {
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }

    public static boolean isFrabjuous(int x) {
        boolean frabjuousFlag;
        if (x > 0) {
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
}
