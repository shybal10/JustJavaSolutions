/**
 * allows the encryption and decryption of a message using a secret key.
 * @author shybal
 */
public class ROT13Encoder {
    private static final int SECRET_KEY = 6;
    public static void main(String[] args) {
        String message = "SHYBAL uvwxyzbrahim";
        String encryptedMessage = encrypt(message);
        String decryptedMessage = decrypt(encryptedMessage);
        System.out.print(message + " : ");
        System.out.print(encryptedMessage + " : ");
        System.out.println(decryptedMessage);
    }

    /**
     * method encrypts the message using a secret key
     * @param s is the message to be encrypted
     * @return the encrypted message of the type string
     */
    private static String encrypt(String s) {
        int length = s.length();
        int index;
        int code;
        StringBuilder stringBuilder = new StringBuilder();
        char character;

        for (index = 0; index < length; index++) {     //traversing each character of the message
            character = s.charAt(index);
            if(character >= 'a' && character <= 'z') {
                code = getCode();
                character += code;                     //encrypting character
                if (character > 'z') {                 //handling special cases
                    int temp = ((int) character) % 122;
                    character =  (char) (96 + temp);
                }

            } else
            if(character >= 'A' && character <= 'Z') {
                code = getCode();
                character += code;
                if (character > 'Z') {
                    int temp = ((int) character) % 90;
                    character =  (char) (64 + temp);
                }
            }
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
    /**
     * method encrypts the message using a secret key
     * @param s is the message to be decrypted
     * @return the original message of the type string
     */
    private static String decrypt(String s) {
        int length= s.length();
        int index;
        int code;
        StringBuilder stringBuilder = new StringBuilder();
        char character;

        for (index = 0; index < length; index++) {

            character = s.charAt(index);
            if (character >= 'a' && character <= 'z') {
                code = getCode();
                character -= code;
                if (character < 'a') {
                    int temp = 26;
                    character += temp;
                }
            } else

            if (character >= 'A' && character <= 'Z') {
                code = getCode();
                character -= code;
                if (character < ('A')) {
                    int temp = 26;
                    character += temp;
                }
            }
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
    /**
     * method gets the required code for encryption/decryption
     * @return the codeof type int
     */
    private static int getCode(){
        return SECRET_KEY % 26;
    }
}
