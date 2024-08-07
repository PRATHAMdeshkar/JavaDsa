// Array Reverse Using a Loop (In-place):
public class ArrayReverseInPlace {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        int len= arr.length;
         for (int i=0; i<len/2 ; i++){
            int swap =arr[i];
            arr[i]= arr[len-1-i];
            arr[len-1-i] =swap;
        }

        System.err.println("reversed arrya:");
        for (int i=0; i<arr.length; i++){
            System.err.print(arr[i] + " ");
        }
         
    }
}
