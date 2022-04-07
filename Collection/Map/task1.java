import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class CountryMap{
  private HashMap<String,String>mapobj1;
  public CountryMap(){
      mapobj1=new HashMap<>();
   }
  public HashMap<String,String>saveCountryCapital(String CountryName,String Capital){
      mapobj1.put(CountryName,Capital);
      return mapobj1;
   }
  public String getCapital(String CountryName) {
    return mapobj1.get(CountryName);
}
public String getCountry(String capitalName) {
    Set<Entry<String, String>> set = mapobj1.entrySet();
    Iterator<Entry<String, String>> itr = set.iterator();
    
    while (itr.hasNext()) {
        Entry<String, String> e = itr.next();
        
        if (e.getValue().equals(capitalName))
            return e.getKey();
    }
    
    return null;
}
public HashMap<String, String> swapKyeValue() {
    HashMap<String, String> mapobj2 = new HashMap<String, String>();
    
    Set<Entry<String, String>> set = mapobj1.entrySet();
    Iterator<Entry<String, String>> itr = set.iterator();
    
    while (itr.hasNext()) {
        Entry<String, String> e = itr.next();
        mapobj2.put(e.getValue(), e.getKey());
    }
    
    return mapobj2;
}

public ArrayList<String> toArrayList() {
    ArrayList<String> list = new ArrayList<>();
    
    Set<Entry<String, String>> set = mapobj1.entrySet();
    Iterator<Entry<String, String>> itr = set.iterator();
    
    while (itr.hasNext()) {
        Entry<String, String> e = itr.next();
        list.add(e.getKey());
    }
    return list;
}
public ArrayList<String> toArrayLst() {
    ArrayList<String> lst = new ArrayList<>();
    
    Set<Entry<String, String>> set = mapobj1.entrySet();
    Iterator<Entry<String, String>> itr = set.iterator();
    
    while (itr.hasNext()) {
        Entry<String, String> e = itr.next();
        lst.add(e.getValue());
    }
    return lst;
}
}
public class task1{
     public static void main(String[] args) {
        CountryMap countryMap = new CountryMap();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
        System.out.println(countryMap.toArrayLst());
		
		HashMap<String, String> mapobj2 = countryMap.swapKyeValue();
		System.out.println(mapobj2);
    }
}