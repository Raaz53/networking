
public class Question5 {
    public static int[] ascending(int[] arr) {
        int temp = 0;
        for(int i= 0;i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
    public static int[] descending(int[] arr) {
        int temp = 0;
        for(int i= 0;i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {5,8,0,3,4};
        for(int c: ascending(arr)){
            System.out.print(c);
        }
        System.out.println();
        for(int c: descending(arr)){
            System.out.print(c);
        }
    }
}
