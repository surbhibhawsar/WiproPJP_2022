import java.util.Vector;
//import java.util.Iterator;
//import java.util.Enumeration;
import java.util.ListIterator;

public class task3{
    public static void main(String args[]){
       Vector<Integer> vc= new Vector<>();
       vc.add(123); 
       vc.add(175); 
       vc.add(137); 
       vc.add(153); 
       vc.add(138); 
       vc.add(613); 

      /* Iterator<Integer> itr=vc.iterator();       Using Iterator
       while(itr.hasNext()){
        System.out.println(itr.next());
       }

       Enumeration<Integer> en= vc.elements();         Using Enumeration
       while(en.hasMoreElements()){
        System.out.println(en.nextElement());
       }*/

       ListIterator lst =vc.listIterator(0);         //Using ListIterator

       while(lst.hasNext()){
           System.out.println(lst.next());
       }



    }
}