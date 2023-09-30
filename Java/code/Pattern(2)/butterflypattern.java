public class butterflypattern{
    public static void butterfly_pattern(int n){
        for(int i=1;i<=n;i++){
            //stars=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces=2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //spaces=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half 
        for(int i=n;i>=1;i--){
             //stars=i
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces=2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //spaces=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]) {
        butterfly_pattern(5);        
    }
}