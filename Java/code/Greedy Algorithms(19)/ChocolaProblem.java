//we are given a bar of chocolate composed of mxn square pieces.one should break the chocolate into single squares .parts of the chocolate can be broken along the lines between the squares .the goal is to break the chocolate into single squares in such a way that the cost of the operation is minimal .the cost of breaking is equal to the number of lines broken .calculate the minimal cost of breaking the chocolate into single squares
import java.util.*;
public class ChocolaProblem{
    public static void main(String[] args) {
        int n=4,m=6;//n is rows and m is columns
        Integer costVer[]={2,1,3,1,4};//m-1
        Integer costHor[]={4,1,2};//n-1

        Arrays.sort(costVer,Collections.reverseOrder());//sorted in descending order
        Arrays.sort(costHor,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;//hp=horizontal pieces and vp=vertical pieces
        int cost=0;

        while(h<costHor.length && v<costVer.length){
            if(costHor[h]>=costVer[v]){//Horizontal cut
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }
            else{
                cost+=(costVer[v]*hp);
                v++;
                vp++;
            }
        }
        while(h<costHor.length){
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costVer.length){
            cost+=(costVer[v]*hp);
            v++;
            vp++;
        }
        System.out.println("cost: " + cost);
    }
}