//Object And Classes
public class OOPS1{
    public static void main(String[] args) {
        Pen p1 =new Pen(); //created a pen object called p1

        p1.setcolour("blue");   //  OR  p1.colour="blue";
        System.out.println(p1.colour);
    }
}
class Pen{
    String colour;
    int tip;

    void setcolour(String newcolour){
        colour =newcolour;
    }

    void settip(int newtip){
        tip = newtip;
    }
}