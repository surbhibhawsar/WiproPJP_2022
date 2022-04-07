class Author{
   private String name;
   private String email;
    private char gender;

    public Author(String name,String email,char gender){
       this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    @Override
    public String toString(){
        return "Author [name ="+name+", Email="+email+", gender="+gender+"]";
    }

}
class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name,Author author,double price,int qtyInStock){
     super();
     this.name=name;
     this.author=author;
     this.price=price;
     this.qtyInStock=qtyInStock;

    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }

@Override 
 
public String toString(){
    return "Book [name ="+name+", author="+author+", price="+price+", getInStock="+qtyInStock+"]";
}
   }

public class Task1{
    public static void main(String args[])
    {
        Author a=new Author("surbhi","s.b@gmail.com",'F');
        Book b= new Book("JAVA", a, 2000.0,100);
        System.out.println(b );

    }
}
