public class Test {
    /**
    public static void main(String[] args) {
        String name = "shybal";
        int number = 0;
        char letter = 'a';
        boolean flag = true;
        System.out.println(letter + 0 );

        System.out.println(++letter);
        number = letter+ 1;
        System.out.println(letter);
    }
     */
        public static String mystery(String s) {
            int i = s.length() - 1;
            String total = "";
            while (i >= 0 ) {
                char ch = s.charAt(i);
                System.out.println(i + " " + ch);
                        total = total + ch;
                i--;
            }
            return total;
        }
        public static void main(String[] args) {
            /**
            System.out.println(mystery("Allen"));
            int number = 17;
            int lastDigit = number%10;
            int firstDigit = number/10;
            String num = ""+ lastDigit + firstDigit;
            System.out.println(num);
             */
            enigma(5);
            System.out.println("");
        }
    public static void enigma(int x) {
        if (x == 0) {
            System.out.print(x % 2);
            return;

        } else {
            enigma(x / 2);
        }

    }
}
