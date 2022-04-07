import java.util.Scanner;
public class task8 {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        
        switch(c){
            case 'R':
            System.out.println("R->Red");
            break;

            case 'G':
            System.out.println("G->Green");
            break;

            case 'B':
            System.out.println("B->Blue");
            break;

            case 'O':
            System.out.println("O->Orange");
            break;

            case 'Y':
            System.out.println("Y->Yellow");
            break;

            case 'W':
            System.out.println("W->White");
            break;

            default :
            System.out.println("Invalid code");
        }


    }
}
