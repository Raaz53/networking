public class OneTime {
    private static String enrypt(String message, String key) {
        char[] chars = message.toCharArray();
        char[] keyword = key.toCharArray();
        for( int i = 0; i< chars.length; i++) {
            chars[i] -= keyword[i];
        }
        return String.valueOf(chars);
    }
    private static String decrypt(String cipher, String key){
        char[] chars = cipher.toCharArray();
        char[] keyword = key.toCharArray();
        for( int i = 0; i< chars.length; i++) {
            chars[i] += keyword[i];
        }
        return String.valueOf(chars);
    }
    public static void main(String[] args) {
        String message = "~0137BSA";
        String key ="8DHA0!`~";
        String cipher = enrypt(message, key);
        String decryption = decrypt(cipher, key);
        System.out.println(cipher);
        System.out.println(decryption);
    }
}
