import java.util.*;
public class ArrayCyclicallyRotatePointers {

    public static void swapCycle(int [] arr) {
       
        int i= 0;
        int j= arr.length-1;

        while (i != j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        swapCycle(arr);
        System.err.println("swapped array by one is: "+ Arrays.toString(arr));
    }
    
}
