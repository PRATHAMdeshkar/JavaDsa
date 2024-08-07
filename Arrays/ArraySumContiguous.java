// Largest Sum Contiguous Subarray (Kadane’s Algorithm)
public class ArraySumContiguous {

    static int contiguousSum(int arr[]) {

        int maxsum = 0, currentsum= 0;

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
        int[] arr = { -2, -3,-8};
        System.out.println("Maximum contiguous sum is "
                       + contiguousSum(arr));
    }
    
}
