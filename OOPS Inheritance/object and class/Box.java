public class Box{
      int w,h,d;
    
      Box(int W,int H,int D){
        w=W;
        h=H;
        d=D;
    }

    public int Volume(){
    int v=w*h*d;
    return v;

        }
    
 public static void main(String[] args) {
    Box b=new Box(4,3,2);
    System.out.println(b.Volume());

 }      
    
}