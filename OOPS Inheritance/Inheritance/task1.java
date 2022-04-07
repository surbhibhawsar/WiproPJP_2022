class Animal{
    public void eat() {
        System.out.println("Eating....");
    }
    public void sleep(){
        System.out.println("Sleeping....");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("Flying....");
    }
}
public class task1{
    public static void main(String[] args) {
        Animal a= new Animal();
        Bird b= new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}