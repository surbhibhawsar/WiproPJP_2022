public class task9 {
 
    public static int[]  RemoveTen(int arr[]){
    int temp[]=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=10){
                temp[j]=arr[i];
                j++;

            }
        
        }
        return temp;
    }
        
    public static void main(String[] args) {
        int arr[]={1,10,10,2};
       int res[]= RemoveTen(arr);
       for(int i=0;i<arr.length;i++){
           System.out.print(res[i]+" ");
       }
        

        

    }
}
