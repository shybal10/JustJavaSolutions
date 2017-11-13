/**
 * verifies if the given dimensions form a triangle
 * @author shybal
 * @version 1.0
 */
public class TriangleChecker {
    public static void main(String[] args) {
        int a,b,c;
        a = 5;
        b = 6;
        c = 50;
        System.out.println(isTriangle(a,b,c));
    }

    /**
     * checks whether the given sides form a triangle
     * @param a represents one side
     * @param b represents one side
     * @param c represents one side
     * @return  returns true if the sides form a triangle
     */
    private static boolean isTriangle(int a, int b, int c) {
        if((a + b) < c || (b + c) < a || (a + c) < b) {
            return false;
        }
        return true;
    }
}
