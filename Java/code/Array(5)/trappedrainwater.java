public class trappedrainwater{
    public static int trappingrainwater(int height[]){
        int n = height.length;
        //calculate left max boundry 
        int leftmax[]= new int[n];
        leftmax[0]=height[0];
        for(int i=0;i<n;i++){
            leftmax[i]=Math.max(height[i], leftmax[i]);
        }
        // calculate right max boundry 
        int rightmax[]= new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=n;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);

        }
        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trappedwater+=waterlevel-height[i];

        }
        return trappedwater;

        }
        public static void main(String[] args) {
            int height[]={4,5,6,8,9};
            System.out.println(trappingrainwater(height));
        }
    
}