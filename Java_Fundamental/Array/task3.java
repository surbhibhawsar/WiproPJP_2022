import java.util.*;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int index=-1;

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                index=i+1;
                break;
            }
        }
        System.out.println(index);
        sc.close();
    }
}
