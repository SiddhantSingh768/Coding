public class tofindduplicateinarray{
    public boolean containsDuplicate(int nums[]) {
        for(int i=0; i<nums.length-1 ; i++) { 
            for(int j=i+1; j<nums.length ; j++){
                if( nums[i] == nums[j] ){
                    return true ;
                }
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        int nums[]={5,9,8,5};
        
        
        
    }   
}