public class task16 {
    public static void main(String ar[])
    {
        int n=1234;
        int rev=0,rem;

        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
