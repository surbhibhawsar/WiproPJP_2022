import java.util.Scanner;
public class task13 {
    public static boolean isPrime(int n){
        if(n<0)
        n*= 1;
        
        Boolean isPrime=true;

        for(int i=2;i<n/2+1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }

        }
        if(n==0 || n==1)
        isPrime=false;

        return isPrime;
    }
    public static void main(String[] args) {
        for(int i=10;i<=99;i++){
            if(isPrime(i)){
             System.out.println(i);
            }
        }
        
        
    }
}

