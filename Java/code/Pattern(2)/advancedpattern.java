public class advancedpattern{
    public static void hollow_cylinder(int totrows,int totcolm){
        //outer loop
        for(int i = 1 ; i<=totrows ; i++ ){
            //inner column 
            for(int j =1;j<=totcolm;j++){
                //cell-(i,j)
                if(i==1||i==totrows||j==1||j==totcolm){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_cylinder(4,5 );
    }
}