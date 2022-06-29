public class Question10 {
    public static boolean isPrime(int n) {  
        if (n <= 1)  
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) 
                return false;   
        }  
        return true;  
    }  
    public static void main(String[] args) {
        int[] arr = {10,12,17,19,25,85,96,56,11};
        for(int i = 0; i<arr.length; i++) {
            if(isPrime(arr[i])) {
                System.out.println(arr[i] + " - At index " + i);
            }
        }
    }
}
