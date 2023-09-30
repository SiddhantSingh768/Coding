public class OOPS5{
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eats();
        
    }
}
//base class
class Animal{
    String colour;
    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breaths");
    }
}
//derived class 
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water ");
    }
}