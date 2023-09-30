//Abstract classes 
public class OOPS7{
    public static void main(String[] args) {
        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class horse extends Animal{
    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 leg");
    }
}
class chicken extends Animal{
    void changecolor(){
        color="red ";
    }
    void walk(){
        System.out.println("walks  on 2 leg ");
    }
}