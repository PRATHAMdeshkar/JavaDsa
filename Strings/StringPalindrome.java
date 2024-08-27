package Strings;

public class StringPalindrome {

    public static void main(String[] args) {
        
        String str = "applppa";
        System.out.println("the string is :"+str);

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("the reverse of string is :"+sb);

        if (sb.toString().equals(str)){
            System.out.println("the "+str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }
    } 
}
