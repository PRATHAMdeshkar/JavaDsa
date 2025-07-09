//swap first latters 
package Strings;

import java.util.Scanner;

public class Stringreverse1 {

    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);

         System.out.println("first and last name");
         String first = sc.nextLine();
         String last = sc.nextLine();
        
         String modifiedFirstName = last.charAt(0) + first.substring(1);
         String modifiedLastName = first.charAt(0) + last.substring(1);
 
         System.out.println("Modified first name: " + modifiedFirstName);
         System.out.println("Modified last name: " + modifiedLastName);
        sc.close();
         
        }
    }