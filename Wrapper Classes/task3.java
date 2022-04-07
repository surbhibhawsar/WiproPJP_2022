import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        String op=String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
        System.out.println(op);

        sc.close();
    }
}
