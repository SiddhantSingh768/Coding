import java.util.Scanner;

public class solution_loop{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum=0;
        int oddsum=0;

        do{
            System.out.println("enter the number =");
            number= sc.nextInt();

            if(number%2==0){
                evensum+=number;

            }else{
                oddsum+=number;

            }
             System.out.println("do you want to continue ?if yes press 1 or 0 if no ");
            choice=sc.nextInt();


        }while(choice==1);
        System.out.println("sum of even numbes="+ evensum);
        System.out.println("sum of odd number "+oddsum);
        

    }
}