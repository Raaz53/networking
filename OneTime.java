// public class OneTime {
//     private static String encrypt(String message, String key) {
//         char[] chars = message.toCharArray();
//         char[] keyword = key.toCharArray();
//         for( int i = 0; i< chars.length; i++) {
//             chars[i] -= keyword[i];
//         }
//         return String.valueOf(chars);
//     }
//     private static String decrypt(String cipher, String key){
//         char[] chars = cipher.toCharArray();
//         char[] keyword = key.toCharArray();
//         for( int i = 0; i< chars.length; i++) {
//             chars[i] += keyword[i];
//         }
//         return String.valueOf(chars);
//     }
//     public static void main(String[] args) {
//         String message = "abvd";
//         String key ="erds";
//         String cipher = encrypt(message, key);
//         String decryption = decrypt(cipher, key);
//         System.out.println(cipher);
//         System.out.println(decryption);
//     }
// }


public class OneTime {
    public static String encrypt(int message, String key){
        String messageBinary = Integer.toBinaryString(message);
        if(messageBinary.length()<key.length()){
            for(int i = 0; i<(key.length()-messageBinary.length()); i++ ) {
                messageBinary = 0 +messageBinary;
            }
        }
        if(messageBinary.length()>key.length()){
            for(int i = 0; i<(messageBinary.length()-key.length()); i++ ) {
                key = 0 +key;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < messageBinary.length(); i++) {
            sb.append(key.charAt(i)^messageBinary.charAt(i));
        }
        return String.valueOf(sb);
    }
    public static int decrypt(String cipher, String key) {
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cipher.length(); i++) {
            sb.append(key.charAt(i)^cipher.charAt(i));
        }
        cipher = String.valueOf(sb);
        return Integer.parseInt(cipher, 2);
    }
    public static void main(String[] args) {
        int message = 17;
        int key = 16;
        String keyBinary = Integer.toBinaryString(key);
        System.out.println(encrypt(message, keyBinary));
        System.out.println(decrypt(encrypt(message, keyBinary), keyBinary));

    }
    
}
