package Strings;
import java.util.*;
public class StringDuplicate {

    public static void main(String[] args) {
        
        String str = "Prathamhhhesh";

        char[] chars =str.toCharArray();


        Arrays.sort(chars);

        System.out.println(chars);

        for (int i =0; i< chars.length; i ++){
            if(chars[i]==chars[i+1]){
                System.out.println(chars[i]);
                while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                    i++;
            }
        }
    }
    
}}