
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

class ContactList{

    TreeMap<String,Integer>tm=new TreeMap<>();

    public void addContact(String name,Integer number){
        tm.put(name,number);
    }
    
    @Override
    public String toString(){
        return "ContactList[contact= "+tm+"]";
    }

    //(A) Provide contact name and get phone number
    
    static void get_key(TreeMap<String, Integer> tm, String value) {
        for(Entry<String, Integer> entry: tm.entrySet()) {
            if(entry.getKey() == value) {
               System.out.println("\nThe Key of: " + value + " is " + entry.getValue());
               break;
            }
         }
      }
    //(B) Provide phone number and get rcontact name
    static void get_value(TreeMap<String, Integer> input_map, Integer Key) {
        for(Entry<String, Integer> entry: input_map.entrySet()) {
            if(entry.getValue() == Key) {
               System.out.println("\nThe value of : " + Key + " is " + entry.getKey());
               break;
            }
         }
      }
     

    //(C) provide all contact name and respective number
    public void listAllContacts() {
		Set<Entry<String, Integer>> set = tm.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();
			System.out.println(e);
		}
	}
}

public class task2 {
    public static void main(String[] args) {
        ContactList contactsList = new ContactList();
		
		contactsList.addContact("Ayush ", 887);
		contactsList.addContact("Surbhi ", 89);
		contactsList.addContact("Ram ", 94);
        
    

    TreeMap<String, Integer> tm= new TreeMap<>();
    tm.put("Mohini",8);
    tm.put("Surbhi",25);
      
    Integer Key = 8;
    ContactList.get_value(tm, Key);

    String value="Surbhi";
				
	ContactList.get_key(tm,value);

	contactsList.listAllContacts();
    }

    
    }