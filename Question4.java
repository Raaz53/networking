public class Question4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = new int[arr.length];
        for(int i = arr.length-1,j = 0; i>=0; i--, j++) {
            result[j] = arr[i];
        }
        for(int c: result) {
            System.out.print(c);
        }
    }
}
