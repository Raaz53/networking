public class Question6 {
    
    public static void main(String[] args) {
        int[] arr = {10,20,30,10,10,20,40};
        int [] temp = new int [arr.length];  
        int counted = -1;  
        
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    temp[j] = counted;  
                }  
            }  
            if(temp[i] != counted)  
                temp[i] = count;  
        }  
         
        
        for(int i = 0; i < temp.length; i++){  
            if(temp[i] != counted)  
                System.out.println(arr[i] + " occured " + temp[i] + " times");  
        }   
    }  
}
