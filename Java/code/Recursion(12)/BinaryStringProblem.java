//Print all binary strings of size n without consecutive ones 
public class BinaryStringProblem{
    public static void PrinBinStr(int n,int lastPlace,String str){
        //Base case
        if(n==0){
            System.out.println(str);
            return;
        }
        PrinBinStr(n-1, 0, str+"0");
        if(lastPlace==0){
            PrinBinStr(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        PrinBinStr(3, 0, "");
    }
}