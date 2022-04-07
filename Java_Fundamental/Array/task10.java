public class task10 {
    
    public static int[] EvenOdd(int arr[],int n) {

    int temp[]=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                temp[j]=arr[i];
                j++;
            }
            else{
            temp[n]=arr[i];
            n--;
        }
    }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6,3,7,4,88,26,75};
        int n=arr.length-1;
        int res[]=EvenOdd(arr,n);
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
