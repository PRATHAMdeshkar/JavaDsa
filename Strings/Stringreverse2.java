//Reverse String using inbuilt method TC: O(n)
 
package Strings;

public class Stringreverse2 {

    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuffer b = new StringBuffer(str);

        b.reverse();

        System.err.println(b.toString());

    }
    
}
