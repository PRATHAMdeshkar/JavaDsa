package Strings;
import java.util.*;
public class StringDuplicate {

    public static void main(String[] args) {
        
        String str = "Programming";

        char[] chars =str.toCharArray();

        Arrays.sort(chars);
        System.out.println(chars);
    }
    
}
