public class ArrayFinddup {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,3,6,6};

        for( int i =0; i<arr.length; i ++){
            for( int j= 1; j <i; j++){
                if(arr[i]==arr[j]){
                    System.out.println("the double element found is: " + arr[j]);
                }
            }
            
        }
    }
}
