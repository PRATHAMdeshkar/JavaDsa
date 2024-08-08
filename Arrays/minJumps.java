// Minimum number of jumps to reach end | Set 2 (O(n) solution)
import java.util.*;
public class minJumps {
    
    static int minJumps(int arr[]) {
        int totalJumps = 0;
        int lastJump = 0, coverage = 0;

        for (int i = 0; i < arr.length; i++) {
            coverage = Math.max(coverage, i + arr[i]);

            if (i == lastJump) {
                if (i != arr.length - 1) {
                    totalJumps++;
                    lastJump = coverage;
                    if (lastJump <= i) {
                        return -1;
                    }
                }
            }

            if (lastJump >= arr.length - 1) {
                return totalJumps;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("min jumps to reach end " + minJumps(arr));
    }
}