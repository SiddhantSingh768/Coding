import java.util.Scanner;

public class strings{
    public static void main(String[] args) {
        char arr[]={'5','9','8','7','4'};
        String str="abcd";
        String str2= new String("xyz");

        Scanner sc =new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        //length of string 
        System.out.println(name.length());
        //concatenation 
        String firstname= "siddhant";
        String lastname="singh";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
        // print a character of string 
        System.out.println(fullname.charAt(1));
    }
}