public class task17 {
     public static void main(String args[])
     {
        int n=141;
        int rev=0,rem;
        int temp=n;

        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==temp){
           System.out.println("Number is palindrom");
        }
        else
        {
            System.out.println("Number is not palindrom");
        }
     }
}
