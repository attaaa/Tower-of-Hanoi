package tower.of.hanoi;

import java.util.Scanner;

/**
 *
 * @author Muh. Hatta Eka Putra
 */
public class TowerOfHanoi {

    public static int disk;
    public static int[] tower;
    public static int step;
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input Jumlah Disk: ");
        disk = in.nextInt();
        System.out.println();
        
        play(disk);
        solve(disk,1,2,3);
    }
    
    public static void play(int x){
        disk = x;
        tower = new int[]{0,x,0,0};
        step = 0;
    }
    
    public static void move(int x, int y){
        tower[x]--;
        tower[y]++;
        System.out.println("From tower "+x+" to tower "+y);
    }
    
    public static void solve(int num, int begin, int trans, int end){
        if (num == 2){
            move(begin, trans);
            move(begin, end);
            move(trans, end);
        } else {
            solve(num-1, begin, end, trans);
            move(begin, end);
            solve(num-1, trans, begin, end);
        }
    }
}
