public class powerofanumber{
    public static int power(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower=power(a, n/2);
        int halfpowersq=halfpower*halfpower
        ;
        // if n is odd
        if(n%2!=0){
            halfpowersq=a*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        int a=2;
        int n=10;
        System.out.println(power(a, n));
    }
}