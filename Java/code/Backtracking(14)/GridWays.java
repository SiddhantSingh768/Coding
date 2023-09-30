public class GridWays{
    public static int ways(int i,int j,int n,int m){
        //Base Case 
        if(i==n-1&&j==m-1){//condition for last cell
            return 1;
        }
        else if(i==n||j==n){//Boundary cell condition 
            return 0;
        }
        //Recursion
        int w1=ways(i+1, j, n, m);
        int w2=ways(i, j+1, n, m);
        return w1+w2;
    }                                                    //we can also use the formula (n-1+m-1)!/(n-1)!(m-1)!
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(ways(0, 0, n, m));;
    }
}