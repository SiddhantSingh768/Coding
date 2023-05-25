public class bitmanupalation{
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even number ");
        }else{
            System.out.println("odd number ");
        }
    }
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setithbit(int n, int i){
        int bitmask=1<<i;
        return n|bitmask ;
    }
    public static int clearithbit(int n , int i){
        int bitmask=~(1<<i);
        return n & bitmask ;
    }
    public static int updateithbit(int n,int i,int nerbit){
        if(nerbit==0){
            return clearithbit(n, i);
        }else{
            return setithbit(n, i);
        }
    }
    public static int clearIbits(int n ,int i){
        int bitmask =(~0)<<i;
        return n&bitmask;
    }
    public static int clearIbits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask= a|b;
        return n&bitmask;
    }
    public static boolean ispoweroftwo(int n){
        return (n&(n-1))==0;
    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count ;
    }
    public static int fastexpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // oddoreven(4);
        //System.out.println(getithbit(10, 2));
        //System.out.println(setithbit(10, 2));
        //System.out.println(clearithbit(10, 2));
        //System.out.println(updateithbit(10, 2, 1));
        //System.out.println(clearIbits(15, 2));
        //System.out.println(clearIbits(10, 2, 4));
        //System.out.println(ispoweroftwo(4));
        //System.out.println(countsetbits(10));
        System.out.println(fastexpo(10, 2));
    }
}