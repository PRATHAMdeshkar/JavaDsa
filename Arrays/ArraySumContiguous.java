// Largest Sum Contiguous Subarray (Kadane’s Algorithm)
import java.util.*;
public class ArraySumContiguous {

    static int contiguousSum(int arr[]) {

        int maxsum =0, currentsum= 0;

        for(int i= 1; i< arr.length; i++){

            currentsum = currentsum + arr[i];
            if (currentsum > maxsum){
                maxsum = currentsum;
            }

            if (currentsum <0 ){
                currentsum = 0;
            }
        }
        return maxsum;

    }
    public static void main(String[] args)
    {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is "
                           + contiguousSum(arr));
    }
    
}
