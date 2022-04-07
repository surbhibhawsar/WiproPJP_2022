import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                fact++;
                break;
            }

        }
        if(fact==2){
            System.out.println("number is not prime");
        }
        else{
            System.out.println("number is prime");
        }
    }
}
