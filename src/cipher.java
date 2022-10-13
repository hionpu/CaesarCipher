public class cipher {

    public static String decryptCaesarCipher(String str, int secret) {
        // TODO:
        int len = str.length();
        String ans = "";
        for (int i = 0; i < len; i++) {
            System.out.println((int) str.charAt(i) + " to " + ((int) str.charAt(i) + secret));

            char ciphered = '0';
            if (Character.isWhitespace(str.charAt(i)) ) ans+= " ";
            if ( (int) str.charAt(i) + secret > 122 ) {
                int ascii = (int) str.charAt(i) + secret - 26;

                char chr = (char) ascii;
                System.out.println("ascii = "+ ascii +", chr = " + chr);
                ans += chr;
            }
            else {
                int ascii = (int) str.charAt(i) + secret;

                char chr = (char) ascii;
                System.out.println("ascii = "+ ascii +", chr = " + chr);
                ans += chr;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(cipher.decryptCaesarCipher("c", 11));
        System.out.println("" + (char) 110);
    }
}
