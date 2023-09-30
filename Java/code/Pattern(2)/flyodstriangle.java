public class flyodstriangle{
    public static void flyod(int n){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        flyod(5);
        
    }
}