
public class task15 {
    public static void main(String args[]){
    

    if(args.length==0){
      System.out.println("Please enter an integer value");
      System.exit(0);
    }
    
    int row=Integer.parseInt(args[0]);
    
    for(int i=0;i<row;i++){
        for(int j=0;j<=i;j++){
          System.out.print("* ");
        }
        System.out.print("\n");
    }
    
}
}
