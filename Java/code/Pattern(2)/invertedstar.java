public class invertedstar{
    public static void main(String arg[]){
        int n=4;// number of lines 
        for(int line =1;line<=4;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}