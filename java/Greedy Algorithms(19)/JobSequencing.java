//given an array of job where every job has a dedline and profit if completed before deadline .every job takes a unit of time .maximixe profit if only one job can be done at a time 
import java.util.*;
public class JobSequencing{
    static class job{
        int deadline;
        int profit;
        int id;//1(A),2(B),3(C),4(D)
        public job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job>jobs=new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(a,b)->b.profit-a.profit);//profit in descending order
        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            if(time<jobs.get(i).deadline){
                seq.add(jobs.get(i).id);
                time++;
            }
        }
        //print seq
        System.out.println("max jobs is "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }System.out.println();
    }
}