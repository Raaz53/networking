import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,12,20,30,25,40,32,31,35,50,60};
        System.out.println("Enter intializing index");
        int a = sc.nextInt();
        System.out.println("Enter ending index");
        int b = sc.nextInt();
        int[] subarray = new int[b-a+1];

        for(int i = 0, j= 3; i<subarray.length; i++, j++){
            subarray[i] =arr[j];
        }

        for(int k: subarray){
            System.out.print(k);
        }

        sc.close();
    }
}
