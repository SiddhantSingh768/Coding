public class Assignment{
    //RECURSION

    //for a given array of length N print all the indices of a given number(key)
    public static void allOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        allOccurance(arr, key, i+1);
    }

    //Convert a number into strings of number 

    static  String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public static void PrintDigits(int number){
        if(number==0){
            return;
        }
        int LastDigit=number%10;
        PrintDigits(number/10);
        System.out.print(digits[LastDigit]+" ");
    }

    //Length of String 

    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }

    //find the count of all continuous substrings starting and ending with same letter 

    public static int CountSubstring(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res = CountSubstring(str, i+1, j, n-1)+CountSubstring(str, i, j-1, n-1)-CountSubstring(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }

    //Tower Of Hanoi 

    public static void TowerofHanoi(int n,String scr,String helper,String dest){
        if(n==1){
            System.out.println("Transfer Disk "+n+" from "+scr+" to "+dest);
            return;
        }
        TowerofHanoi(n-1, scr, dest, helper);
        System.out.println("Transfer Disk "+ n +" from "+scr+" to "+dest);
        TowerofHanoi(n-1, helper, scr, dest);
    }

    public static void main(String[] args) {
        int arr[]={1,60,4,2,4,5,7,8,4};
        int key=4;
        //allOccurance(arr, key, 0);
        //PrintDigits(2160);

        //String str="ascde";
        //System.out.println(length(str));

        //String str="abcab";
        //int n=str.length();
        //System.out.println(CountSubstring(str, 0, n-1, n));

        int n=3;
        TowerofHanoi(n, "S", "H", "D");
    }
}