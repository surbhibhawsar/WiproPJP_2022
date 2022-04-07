public class task11 {
    public static boolean OneFour(int arr[],int n) {
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(arr[i]!=1 && arr[i]!=4){
                flag=false;
            }
            
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,4};
        int n=arr.length;
        boolean res=OneFour(arr, n);
        System.out.println(res);

        
    
    }
    
}
