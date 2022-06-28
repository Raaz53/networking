public class Question8 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6};
        boolean check = true;
        for(int i = 0; i<arr1.length;i++){
            if(arr1.length != arr2.length || arr1[i] != arr2[i]){
                check = false;
                break;
            }
        }
        if(check == false) 
            System.out.println("Arrays are not equal");
        
        else
            System.out.println("Arrays are equal");
        
    }
}
