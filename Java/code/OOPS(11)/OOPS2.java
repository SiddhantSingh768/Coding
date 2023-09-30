// Getters And Setters 
public class OOPS2{
    public static void main(String[] args) {
        Pen p1 =new Pen(); //created a pen object called p1

        p1.setcolour("blue");   //  OR  p1.colour="blue";
    }
}
class Pen{
    private String colour;
    private int tip;
    //Getters 

    String getcolour(){
        return this.colour;
    }

    int gettip(){
        return this.tip;
    }
    
    //Setters 

    void setcolour(String newcolour){
        colour =newcolour;
    }

    void settip(int newtip){
        tip = newtip;
    }
}