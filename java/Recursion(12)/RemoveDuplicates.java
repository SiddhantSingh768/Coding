public class RemoveDuplicates{
    public static void duplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(idx);
        if(map[currentChar-'a']==true){
            duplicates(str, idx+1, newStr, map);
        }
        else{
            map[currentChar-'a']=true;
            duplicates(str, idx+1, newStr.append(currentChar), map);
        }
    }
    public static void main(String[] args) {
        String str="aapnaacollege";
        duplicates(str,0,new StringBuilder(""), new boolean[26]);
    }
}