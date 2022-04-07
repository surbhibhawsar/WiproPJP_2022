
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;

class Employee implements Comparable<Employee>{
     private int empId;
     private String name;
     private int salary;

    public Employee(){}

    public Employee(int empId,String name,int salary){
        super();
        this.empId=empId;
        this.name=name;
        this.salary=salary;
       
    }
    
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return  "Employee[id=" + empId + ", name=" + name + ", salary=" + salary+"]";
    }

    @Override
    public int compareTo(Employee o){
        
      if(o.getSalary()>this.getSalary()){
        return -1;
      }
      else {
        return 1;
      }
      
    }
     /*public boolean addEmployee(){
        

        return true;
      
    }
    static void displayallEmplyees(){
        Set<Employee>em =;

        
    }*/

}
 
public class TreeSetDemo {
    public static void main(String[] args) {
        
        Set<Employee>em =new TreeSet<>();
        em.add(new Employee(1001,"surbhi",2000));
        em.add(new Employee(1002,"ayush",7000));
        em.add(new Employee(1003,"anki",1000));
        em.add(new Employee(1004,"Bunny",5000));
        
        Iterator<Employee> itr=em.iterator();
       
        System.out.println("After sorting");
        itr=em.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }        
    }
}
