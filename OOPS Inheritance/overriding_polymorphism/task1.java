class Fruit{
    public String name;
    public String taste;
    public int size;
    public Fruit(){
        name="Fruit name ";
        taste="taste of fruit";
        size=0;
    }
    public void Eat() {
        System.out.println(name+" taste like "+taste);
    }
}
class Apple extends Fruit{
    public void Eat() {
        System.out.println("it taste like Applpe");
    }
}
class Orange extends Fruit{
    public void Eat() {
        System.out.println("it taste like Orange");
    }
}
public class task1{
    public static void main(String[] args) {
        Fruit fr=new Fruit();
        Orange or=new Orange();
        Apple ap=new Apple();
        fr.Eat();
        or.Eat();
        ap.Eat();
    }
}