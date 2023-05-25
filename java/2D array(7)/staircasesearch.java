public class staircasesearch{
    public static boolean search(int matrix[][],int key ){
        int row =0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found ");
        return false;
    }
    public static void main(String arg[]) {
        int matrix[][]={{1,5,4,8},
        {3,60,5,8},
        {9,7,8,14},
        {54,78,960,45}};
        int key=5;
        search(matrix, key);
        
    }
}