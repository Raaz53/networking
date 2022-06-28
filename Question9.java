public class Question9 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = arr1[i];
        }
        for(int a: arr2) {
            System.out.println(a);
        }
    }
}
