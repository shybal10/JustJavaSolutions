public class ReverseString {
    public static void main(String[] args) {
        //System.out.println("enter the string to be reversed");
        String word = "this is a sentence sentence";
        //System.out.println(word.substring(0,17));
        //System.out.println(reverse(word));
        countLetters(word, "sentence");
    }
    /**
     * this method is used to reverse the input string
     * @param word that is reversed
     */
    private static String reverse(String word) {
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }
    /**
     * methods calculates the letters inn the string
     * @param word taken as input
     */
    private static void countLetters(String word, String characters) {
        int count = 0;
        int limit =  word.length()-characters.length();
        for(int i = 1 ; i <= limit; i++ )
        {
            if (word.substring(i, characters.length()+i).equals(characters)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
