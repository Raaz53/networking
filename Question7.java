import java.util.Scanner;

public class Question7 {
    public static void remove(int[] arr, int element) {
        int[] result = new int[arr.length-1];
        int j = 0;
        boolean exists = true;
        for(int i = 0; i<arr.length; i++) {
            if(i == arr.length-1 && j == i && arr[i] != element){
                exists = false;
                break;
            }

            if(arr[i] == element)
                continue;
            
            result[j] = arr[i];
            j++; 
        }
        if(exists == false)
            System.out.println("Number not in list to delete");
        
        else {
            for(int a: result){
                System.out.print(a);
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println("Enter the number to remove");
        int element = sc.nextInt();
        remove(arr, element);
        sc.close();
    }
}
