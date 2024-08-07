import java.util.Arrays;

public class ArrayReverseRecursion {
    
    public static void recursiveArray(int arr[], int start, int end) {
        if (start >= end){
            return;}

        int swap = arr[start];
        arr[start] = arr[end];
        arr[end]= swap;
            
        recursiveArray(arr, start +1 , end -1);
    }

    public static void main(String[] args) {
        
        int arr[]= {1,2,3,4,5,6};

        recursiveArray(arr, 0, arr.length-1);

        System.out.println("reversed array:" +Arrays.toString( arr));
    }
}
