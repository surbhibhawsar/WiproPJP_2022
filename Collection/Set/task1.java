import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetDemo{
    Set <String>set= new HashSet<>();
    
    public Set<String> addCountry(String countryName){
    set.add(countryName);
    return set;
    }

    public String findCountry(String countryName){
    Iterator<String>itr=set.iterator();
    while(itr.hasNext()){
        if(itr.next().equals(countryName)){
            return countryName;
        }
    }
    return "Country Not Found";
    
    }
    public void printAllCountries(){
        Set<String>st=set;
        Iterator<String> itr=st.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
public class task1{
    public static void main(String[] args) {

        HashSetDemo hs= new HashSetDemo();
        hs.addCountry("India");
        hs.addCountry("Japan");
        hs.addCountry("China");
        hs.addCountry("Pakistan");
        hs.addCountry("USA");
        
        System.out.println("India: " + hs.findCountry("India"));
		System.out.println("bangladesh: " + hs.findCountry("bangladesh"));
        
       hs.printAllCountries();
}
}