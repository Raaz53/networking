public class Question10 {
    public static int indexOf(int[] arr, int element) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,12,17,19,25,85,96,56,11};
        int ele1 = 17;
        int ele2 = 19;
        int ele3 = 11;
        System.out.println(ele1 + " - At index " +indexOf(arr, ele1));
        System.out.println(ele2 + " - At index " +indexOf(arr, ele2));
        System.out.println(ele3 + " - At index " +indexOf(arr, ele3));
    }
}
