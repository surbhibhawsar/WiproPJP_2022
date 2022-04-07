import java.util.Scanner;
public class task1B {
    public static boolean LastDigit(int a,int b){
        int n=a%10;
        int m=b%10;
        if(n==m)
        return true;

        else
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        boolean res=LastDigit(a,b);
        System.out.println(res);
        



sc.close();
    }
}
