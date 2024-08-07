// array shift Time Complexity: O(n)
import java.util.*;
public class ArrayCyclicallyRotate {
   public static void main(String[] args) {
    
    int arr[]= {1,2,3,4,6};

    shift(arr);
    System.err.println("shofter array:"+Arrays.toString(arr));

   }

   public static void shift(int[] arr){
    int n = arr.length;
    int temp = arr[n-1];
     for (int i= n-1; i>0; i--){
        arr[i]= arr[i-1];

     }
     arr[0]= temp;

   }
}
