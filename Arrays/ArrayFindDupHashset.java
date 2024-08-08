import java.util.*;
//Find duplicates in O(n) time and O(1) extra space

public class ArrayFindDupHashset {

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,6,4,2,6};

        HashSet <Integer> set = new HashSet<>();

        for (int i=0 ; i < arr.length; i++){
            if( set.contains(arr[i])){
                System.out.println("dup element "+ arr[i]);
            }
            set.add(arr[i]);
        }

    }
    
}
