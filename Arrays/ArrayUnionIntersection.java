import java.util.*;
public class ArrayUnionIntersection {

    public static void union(int arr1[], int n, int arr2[], int m){

        HashSet<Integer> s = new HashSet<Integer>();
         for (int i=0; i< n; i++){
            s.add(arr1[i]);
         }

         for (int i=0; i<m; i++){
            s.add(arr2[i]);
         }
        
         System.err.println("the union of arrays is: "+ s.toString());
         System.err.println("the total element after union:"+ s.size());
    }
 
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int arr2[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4,13 };

        union(arr1, 9, arr2, 11);
    }
}
