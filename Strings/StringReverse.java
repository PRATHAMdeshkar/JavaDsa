//Reverse String using a Loop, TC: O(n)

package Strings;

public class StringReverse {

    public static void main(String[] args) {
    
        String reversedString ="";
        String original = "NMBR";

        for (int i = original.length()-1; i>=0 ; i--){
            reversedString += original.charAt(i);
        }
         System.err.println("original string :"+original);
         System.err.println("reversed string :"+ reversedString);
        
    }
    
}