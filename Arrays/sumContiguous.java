//  Given an array of integers (possibly some elements negative),
//  find out the *maximum product* possible by multiplying ‘n’ consecutive integers in the array where n ? ARRAY_SIZE.
//  Also, print the starting point of the maximum product subarray.

public class sumContiguous {
    static int product(int arr[]) {
        
        int currentsum =1, maxsum =1;

        for (int i=0; i<arr.length; i++){

            currentsum = currentsum * arr[i];

            if (currentsum > maxsum){
                maxsum= currentsum;
            }

        }
        return maxsum;
    }

    public static void main(String[] args) {
        
        int arr[] = {2,6,7,8,5};

        System.out.println("product of array element: " + product(arr) );
    
}
}