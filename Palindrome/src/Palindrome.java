/**
 * class used to execute the various string programs
 * @author shybal
 * @version 1.0
 */
public class Palindrome {
    public static void main(String[] args) {
        String name = "h";
        System.out.println(wrap("SHy bal", 10));
    }

    /**
     * gets the first letter of the string
     * @param name
     * @return
     */
    private static char getFirst(String name) {
        return name.charAt(0);

    }

    /**
     * method gets the last letter of the string
     * @param name
     * @return
     */
    private static char getLast(String name) {
        return name.charAt(name.length()-1);
    }

    /**
     * gets all remaining letters of the string
     * @param name
     * @return
     */
    private static String getMiddle(String name) {
        if(name.length() == 1){
            return name;
        } else
            return name.substring(1,name.length()-1);
    }
    /**
     * finds if the string is a palindrome recursively
     * @param name
     * @return
     */
    private static boolean isPalindrome(String name) {
        if(name.length() <= 1){
            return true;
        }else if (getFirst(name) == getLast(name)) {
            return isPalindrome(getMiddle(name));
        }else
            return false;
    }

    /**
     * finds if the string is a palindrome iteratively
     * @param name
     * @return
     */
    private static boolean isPalindromeIterative(String name) {
        boolean flag = true;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) != name.charAt(name.length()-1 - i)) {
                flag =  false;
            }
        }
        return flag;
    }

    /**
     * checks whether the given strin is an abecedarian using brute force
     * @param name
     * @return
     */
    private static boolean isAbcedarian(String name) {
        for (int i = 0; i < name.length()-1; i++) {
            for (int j = i+1; j < name.length(); j++) {
                if (name.charAt(i) > name.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * optimized Abecedarian algorithm
     * @param s
     * @return
     */
    private static boolean isAbecedarian(String s) {
        int index = 0;
        char c = 'a';
        while (index < s.length()) {
            if (c > s.charAt(index)) {
                return false;
            }
            c = s.charAt(index);
            index = index + 1;

        }
        return true;
    }

    /**
     * returns true if the input is a Duppledrome
     * @param name
     * @return
     */
    private static boolean isDupeldrome(String name) {
        if (name.length() % 2 == 0) {
            int index = 0;
            while (index < name.length()-1) {
                if (name.charAt(index) != name.charAt(index + 1)) {
                    return false;
                }
                index+=2;
            }
        }else {
            return false;
        }
        return true;
    }

    /**
     * encodes the given string by adding to the letters Asciii value
     * @param name
     * @param limit
     * @return
     */
    private static String wrap(String name, int limit) {
        int index = 0;
        int asciiNumber = 0;
        String encodedString = "";
        while(index < name.length()) {
            if (name.charAt(index) == ' ') {
                encodedString = encodedString + " ";
            } else {
                if ((int) name.toLowerCase().charAt(index) > (122 - limit)) {
                    asciiNumber = (int) name.charAt(index) - limit;
                } else {
                    asciiNumber = (int) name.charAt(index) + limit;
                }
                encodedString = encodedString + (char) asciiNumber;
            }
            index++;
        }
        return encodedString;
    }
}
