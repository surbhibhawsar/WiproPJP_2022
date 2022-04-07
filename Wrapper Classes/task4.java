class Employee implements Cloneable {
    private int emp_id;
    
    
    public Employee(int emp_id){
      this.emp_id=emp_id;

    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }


    @Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}
public class task4{
 public static void main(String args[]){
    Employee emp = new Employee(1001);
    Employee empClone = emp.clone();
    
    empClone.setEmp_id(1002);
    
    System.out.println(empClone.getEmp_id());
    System.out.println(emp.getEmp_id());

    
 }
}
