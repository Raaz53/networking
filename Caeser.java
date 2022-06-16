

public class Caeser {
    
    public static String encrypt(String message, int key, char[] alphabet){
        int position=0, non_position;
        String cipher = "";
        for(int i = 0; i<message.length(); i++){
            for (int j=0; j<alphabet.length; j++){
                if(message.charAt(i)==alphabet[j]){
                    position = j;
                    break;
                }
            }

            non_position = position+key;
            if(non_position>alphabet.length-2){
                non_position %= alphabet.length;
            }
            cipher += alphabet[non_position];
        }
        return cipher;
    }

    public static String decryption(String encoded, int key, char[] alphabet){
        
        int position=0, non_position;
        String decoded ="";
 
        for(int i = 0; i<encoded.length(); i++){
            for (int j=0; j<alphabet.length; j++){
                if(encoded.charAt(i)==alphabet[j]){
                    position = j;
                    break;
                }
            }
            
            non_position = position-key;
            if (non_position<0){
                non_position = alphabet.length+non_position;
            }
            decoded += alphabet[non_position];
        }
        
        return decoded;
    }
    public static void main(String[] args) {
        String text = "zebra";
        int key = 2000;
        if(key>26){
            key%=26;
        }
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String encrypted = encrypt(text, key, alphabet);
        String decrypted = decryption(encrypted, key, alphabet);

        System.out.println(encrypted);
        System.out.println(decrypted);
    }
    
}
