import java.util.*;
public class task5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a;    
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
            
        }
        System.out.println("max1= "+arr[n-1]+"  max2= "+arr[n-2]);
        System.out.println("min1= "+arr[0]+"  min2= "+arr[1]);
           
        sc.close();
    }
}
