//Check if given strings are rotations of each other or not

package Strings;

public class StringRotation {

    public static boolean stringRotate(String str1, String str2){
        if( str1.length() != str2.length()){
            return false;
        }

        for( int i=0; i<str1.length(); i++){
            String rotate = str1.substring(i) + str1.substring(0, i);


            if (rotate.equals(str2)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        String str1 = "NMBR";
        String str2 = "MBRN";

        if(stringRotate(str1, str2)){
            System.out.println("the string are rotation of each other");
        }else{
            System.out.println("not");
        }

    }
    
}
