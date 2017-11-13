public class Recurse {
    public static void main(String[] args) {
        System.out.println(getFirst("shybal"));
        System.out.println(getLength("shybal"));
        System.out.println(getRest("shybal"));
        printString("shybal");
        System.out.println("-------------------------");
        printBackward("shybal");
        System.out.println(reverseString("shybal ibrahim"));
        System.out.println("-------------------------");
        System.out.println(getPower(2,6));
    }
    /**
     * returns the first letter of the word
     * @param word is the input string
     * @return first letter of the word
     */
    private static char getFirst(String word) {
        return word.charAt(0);
    }
    /**
     * methods gives the length of the word
     * @param word is the input string
     */
    private static int getLength(String word) {
        return word.length();
    }
    /**
     * gives all but the first letterof the word
     * @param word is the input string
     */
    private static String getRest(String word) {
        return word.substring(1,word.length());
    }
    /**
     * prints all the letters in the word line by line
     * @param word is the input string
     */
    private static void printString(String word) {
        for (int i = 0; i < getLength(word); i++) {
            System.out.println(word.charAt(i));
        }
    }
    private static void printBackward(String word) {
        for (int i = getLength(word)-1; i > -1; i--) {
            System.out.println(word.charAt(i));
        }
    }
    /**
     * creates a new string which is the reverse of the input string
     * @param word is the input string
     * @return reversed string
     */
    private static String reverseString(String word) {
        String reverse = "";
        for (int i = getLength(word)-1; i > -1; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }
    /**
     * recursively finds x to the power n
     * @param x is the base
     * @param n is the power to which it is raised
     */
    private static double getPower(double x, double n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            return x * getPower(x, n-1);
        }
    }
}
