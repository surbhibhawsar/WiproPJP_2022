import java.util.Iterator;
import java.util.TreeSet;

public class task2 {

	public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();
    
    ts.add("aarti");
    ts.add("surbhi");
    ts.add("mohini");
    ts.add("ankita");
    ts.add("princika");
    
    //(A) Reverse the elements of collection
    
    Iterator itr=ts.descendingIterator();
    
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    
    //(B) Iterate the elements of the treeset using Iterator and observe the order
    System.out.println("....Original Treeset....\n"+ts);
		
    //(C) Check if a particular element is Exists of not

    Iterator<String> itr1=ts.iterator();
    String search="surbhi";
    boolean res=false;
     while(itr1.hasNext()){
         if(itr1.next().equals(search)){
             res=true;
             break;
         }
    }
    if(res)System.out.println(search+" Exists");
    else System.out.println(search+" Does Not Exists");

	}

}