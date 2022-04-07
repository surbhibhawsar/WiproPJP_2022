public class task12 {
    public static int[] middleWay(int a[],int b[]){
        int c[]=new int[2];
            c[0]=a[1];
            c[1]=b[1];
        
        return c;
       }
    public static void main(String args[]){
       int a[]={1,2,3};
       int b[]={4,5,6};
       int newarr[]=middleWay(a,b);
       for(int i=0;i<2;i++){
        System.out.print(newarr[i]+" ");
       }
       
    }
}
