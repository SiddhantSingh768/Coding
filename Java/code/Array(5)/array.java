import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        int marks[]= new int[50];
        Scanner sc  = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("physics= "+marks[0]);
        System.out.println("maths="+marks[1]);
        System.out.println("chem="+marks[2]);
        
    }
}