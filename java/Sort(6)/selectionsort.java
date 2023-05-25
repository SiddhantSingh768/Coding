public class selectionsort{
        public static void selsort(int arr[]){

            for(int i=0;i<arr.length;i++){
                int minpos=i;
                for(int j=i+1;j<arr.length-1;j++){
                    if(arr[minpos]>arr[j]){
                        minpos=j;
                    }
                }
                //swap
                int temp =arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
            }
        }
        public static void printarr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String[] args) {
            int arr[]={5,4,3,1,2};
            selsort(arr);
            printarr(arr);
        }
}