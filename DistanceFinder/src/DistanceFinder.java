/**
 * helps calculate the distance between two given points
 * @author shybal
 * @version 1.0
 */
public class DistanceFinder {
    public static void main(String[] args) {
        double x1,x2,y1,y2;
        x1 = 2.0;
        x2 = 3.0;
        y1 = 5.0;
        y2 = 3.0;
        System.out.println(getDistance(x1,x2,y1,y2));
    }

    /**
     * calculates the distance between two points
     * @param x1 of point1
     * @param x2 of point2
     * @param y1 of point1
     * @param y2 of point2
     * @return the distance of the type double
     */
    private static double getDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(getSquare((x2 - x1)) + getSquare((y2 - y1)));
    }

    /**
     * @param num from the method getDistannce()
     * @return the square of a number
     */
    private static double getSquare(double num) {
        return num * num;
    }
}
