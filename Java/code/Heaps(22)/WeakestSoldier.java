import java.util.PriorityQueue;
public class WeakestSoldier {
    static class Row implements Comparable<Row>{
        int index;
        int count;//count of soldiers in a row
        public Row(int index,int count){
            this.index=index;
            this.count=count;
        }
        @Override
        public int compareTo(Row o){
            if(this.count==o.count){
                return this.index-o.index;
            }
            return this.count-o.count;
        }
    }
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};
    int k=2;
    PriorityQueue<Row> pq=new PriorityQueue<>();
    for(int i=0;i<army.length;i++){
        int count=0;
        for(int j=0;j<army[0].length;j++){
            if(army[i][j]==1){
                count++;
            }
        }
        pq.add(new Row(i,count));
    }
    for(int i=0;i<k;i++){
        System.out.println("K Weakest Row : R"+pq.poll().index);
    }
}
}
