import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int temp = 0;

        System.out.println("Enter the elements in array");

        for(int i=0; i<10; i++ ) {
            System.out.println("Enter the element in index: " + i);
            temp = sc.nextInt();
            arr[i] = temp;
        }

        System.out.println("Enter the element to search");
        
        temp = sc.nextInt();
        for(int j = 0; j<10; j++) {
            if(temp == arr[j]){
                System.out.println("Element exists in: " + j + " index");
                break;
            } 
            if(j == 9){
                if(temp !=arr[j]){
                    System.out.println("Element does not exists");
                }
            }
        }

        sc.close();
    }
}
