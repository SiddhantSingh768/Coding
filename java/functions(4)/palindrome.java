public class palindrome{
    public static void ifpalindrome(int n){
    int reverse = 0;
    while(n!=0){
        int remainder=0;
        reverse= (reverse*10 + remainder);
        n=n/10;
    }
    if(n==reverse){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not palndrome");
    }
        
    }
    public static void main(String[] args) {
        ifpalindrome();
        
    }
}