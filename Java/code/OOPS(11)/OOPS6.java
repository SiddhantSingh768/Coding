//Method Overloading
public class OOPS6{
    public static void main(String[] args) {
        //Calculator calc=new Calculator();
        //System.out.println(calc.sum(5,4));
        //System.out.println(calc.sum((float)1.5,(float)7.8));
        Deer d = new Deer();
        d.eat();
}        
    }
    class Animal{
        void eat(){
            System.out.println("eats animal");
        }
    }
    class Deer extends Animal{
        void eat(){
            System.out.println("eats grass");
        }
    }
    class Calculator{
        int sum(int a,int b){
            return a+b;
        }
        float sum(float a,float b){
            return a+b;
        }
    }
