//you have 3 tower and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).move one disk at a time .
import java.util.*;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod); 
            return; 
        } 
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod); 
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod); 
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');   
    }    
}