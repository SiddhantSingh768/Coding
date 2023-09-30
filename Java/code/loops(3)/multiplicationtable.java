import java.util.Scanner;

public class multiplicationtable{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+ " = " +n*i);
        }
    }
}