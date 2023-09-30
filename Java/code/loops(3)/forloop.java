import javax.swing.plaf.BorderUIResource.EtchedBorderUIResource;

public class JavaBasics{
    public static void main(String args[]){
        int n =10899;
        int rev = 0;
        while(n>0){
            int lastdigit  = n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }    
    }   System.out.println(rev);
}