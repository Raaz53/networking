public class Question2 {

    private static int largest(int[] array){
        int temp = array[0];
        for(int i = 1 ; i<array.length; i++) {
            if(temp<=array[i]){
                temp = array[i];
            }
        }
        return temp;
    }

    private static int smallest(int[] array){
        int temp = array[0];
        for(int i = 1; i<array.length; i++){
            if(temp>=array[i]){
                temp = array[i];
            }
        }
        return temp;
    }

    private static int index(int a, int[] array) {
        for(int i = 0; i<array.length ; i++) {
            if(a == array[i]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,10,9,3};
        int largest = largest(arr);
        int smallest = smallest(arr);
        System.out.println("Largest element is " + largest + " of index " + index(largest, arr));
        System.out.println("Smallest element is " + smallest + " of index " + index(smallest, arr));
        
    }
}
