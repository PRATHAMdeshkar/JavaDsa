public class ArrayMinMaxSingleScan {

   public static void main(String[] args) {
    int arr[]= {5,6,4,0,9,15,93,-9};

    int min = arr[0];
    int max =arr[0];

    for (int i=1; i<arr.length; i++){
        if(arr[i]< min){
            min = arr[i];
        } else if(arr[i]> max){
            max = arr[i];
        }
    }
System.err.println(min);
System.err.println(max);


   }
    
}
