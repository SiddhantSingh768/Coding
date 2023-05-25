public class sumofdiagnols{
    public static int diagnolsum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary diagnol 
            sum+=matrix[i][i];
            //secondary diagnol
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
           
    public static void main(String[] args) {
        int matrix[][]={{1,5,4,8},
        {3,60,5,8},
        {9,7,8,14},
        {54,78,960,45}};
        System.out.println(diagnolsum(matrix));
    }
}