

public class EncryptionAndDecryption {
    
    public static String encrypt(String message, int key){
        char[] chars = message.toCharArray();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] temp = new char[chars.length];
        int position=0, non_position;
        // System.out.println(alphabet);
 
        for(int i = 0; i<chars.length; i++){
            for (int j=0; j<alphabet.length; j++){
                if(chars[i]==alphabet[j]){
                    position = j;
                    break;
                }
            }

            non_position = position+key;
            if(non_position>alphabet.length-2){
                non_position %= alphabet.length;
            }
            temp[i] = alphabet[non_position];
        }
        String cipher = String.valueOf(temp);
        return cipher;
    }

    public static String decryption(String encoded, int key){
        char[] chars = encoded.toCharArray();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] temp = new char[chars.length];
        int position=0, non_position;
        // System.out.println(alphabet);
 
        for(int i = 0; i<chars.length; i++){
            for (int j=0; j<alphabet.length; j++){
                if(chars[i]==alphabet[j]){
                    position = j;
                    break;
                }
            }
            
            non_position = position-key;
            if (non_position<0){
                non_position = alphabet.length+non_position;
            }
            temp[i] = alphabet[non_position];
        }
        String decoded = String.valueOf(temp);
        return decoded;
    }
    public static void main(String[] args) {
        String text = "zebra";
        int key = 2;
        String encrypted = encrypt(text, key);
        String decrypted = decryption(encrypted, key);

        System.out.println(encrypted);
        System.out.println(decrypted);
    }
    
}
