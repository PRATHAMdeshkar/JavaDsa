//using queue TC: O(n*2)
package Strings;

import java.util.*;

public class StringRotationQueue {

    public static boolean rotation(String str1, String str2){

        if (str1.length() != str2.length()){
            return false;
        }

        Queue<Character> queue1 = new LinkedList<>();
        Queue<Character> queue2 = new LinkedList<>();


        for( int i=0; i < str1.length(); i++){
            queue1.add(str1.charAt(i));
        }

        for( int i=0; i <str2.length(); i++){
            queue2.add(str2.charAt(i));
        }

        int len = str1.length();
        while (len-- > 0) {
            char ch = queue1.poll();
            queue1.add(ch);
            if(queue1.equals(queue2)){     
                return true;
             }
            }

   
        return false;

    }

    public static void main(String[] args) {
        
        String str1 = "aba";
        String str2 = "baa";

        if(rotation(str1, str2)){
            System.out.println("the strings are rotation of each other");
        }else{
            System.out.println("not ");
        }

    }
    
}
