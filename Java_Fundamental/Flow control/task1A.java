import java.util.Scanner;

public class task1A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n==0){
            System.out.println("Zero");
        }
        else if(n>0)
        {
            System.out.println(n+" is Positive");
        }
        else {
            System.out.println(n +" is Negative");
        }
    sc.close();
    }
    
}
