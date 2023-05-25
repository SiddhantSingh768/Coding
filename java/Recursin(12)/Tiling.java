public class Tiling{
    public static int TilingProblem(int n){
        //Base Case
        if(n==1||n==0){
            return 1;
        }
        //VerticalChoice
        int fnm1=TilingProblem(n-1);
        //HorizontalChoice
        int fnm2=TilingProblem(n-2);
        int TotWays=fnm1+fnm2;
        return TotWays;
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(2));
    }
}