public class LoopExample {
    public static void main(String[] args) {
        loop(10);
    }
    private static void loop(int n) {
        int i = n;
        while (i > 0) {
            System.out.println(i);
            if (i%2 == 0) {
                i = i/2;
            } else {
                i = i+1;
            }
        }
    }
}