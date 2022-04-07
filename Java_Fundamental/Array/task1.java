import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        int sum=0;
        float avg=0.0f;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            avg=sum/n;
        }
        System.out.println(sum);
        System.out.println(avg);
        sc.close();
    }
}
