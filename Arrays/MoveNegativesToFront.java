import java.util.*;
public class MoveNegativesToFront {
    
    public static void moveElements(int arr[]) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right)
        if(arr[right]>=0){
            right--;
        }
        else if (arr[left]<=0){
            left++;
        }

        else{
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        } 
    }

    public static void main(String[] args) {
        int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};

        moveElements(arr);

        System.err.println("-ve to left and +ve to right: "+ Arrays.toString(arr));
    }
}
