import java.util.*;
public class kthElement {
    
    public static void main(String[] args) {
        int arr[]= {7, 10, 4, 3, 20, 15};

        int k=4;
        Arrays.sort(arr);
        System.err.println("k'th element from array is:"+ arr[k-1]);
    }
}
