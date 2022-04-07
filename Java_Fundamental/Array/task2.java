import java.util.*;
public class task2 {
    public static void main(String args[]){
        int max=0,min=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
            if(arr[i]<min){
                min=arr[i];
            }
          
        }
        
        System.out.println(min);
        System.out.println(max);
 sc.close();
    }
}
