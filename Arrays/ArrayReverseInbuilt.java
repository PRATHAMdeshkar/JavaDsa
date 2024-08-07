// Array Reverse Inbuilt Methods (In-place):
import java.util.*;
public class ArrayReverseInbuilt {

    public static void main(String[] args) {
        Integer[] originalArray = {1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(originalArray);
        Collections.reverse(list);
        Integer[] reversedArray = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(reversedArray));

    }
}
