public class task8{
    static void addition(int arr[],int a,int b){
        int sum=0;
        boolean add=true;
        for(int i=0;i<arr.length;i++){
               if(arr[i]!=a && add==true)
               sum=sum+arr[i];

               else if(arr[i]==a && add==true)
               add=false;

               else if(arr[i]==b)
               add=true;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
             int arr[]={10,3,6,1,2,7,9};
             int a=6;
             int b=7;
             addition(arr, a, b);

    }
}