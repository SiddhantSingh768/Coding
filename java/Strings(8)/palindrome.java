public class palindrome{
    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                // not a palindrome 
                return false;
            }
        }
        return true;
    }
    public static int getshortestpath(int path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir =path.charAt();
        }
    }
    public static void main(String[] args) {
        String path="WNEENESENNN"
        String str="racecar";
        System.out.println(ispalindrome(str));
    }
}