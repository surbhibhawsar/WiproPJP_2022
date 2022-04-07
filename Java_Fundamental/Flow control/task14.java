public class task14 {
    public static void main(String ar[])
    {
        int n =1234;
        int sum=0,a;
        while(n!=0){
        rem=n%10;
        sum=rem+sum;
        n=n/10;
        System.out.println(sum);
        }
    }
}
