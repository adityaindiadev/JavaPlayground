package Recursion;

public class DuplicateString {

    public static String RemoveDuplicateString(String str, int strIndex) {

        if (strIndex == str.length()-1 ) {
            return
        }

        char ch = str.charAt(strIndex);

        String strCompiled = "" + ch;
        
        if ( str.charAt(strIndex) == str.charAt(strIndex+1) ) {
            
            return str

        }

    }

    public static void main(String[] args) {

        String str = "appnaacollege";

        RemoveDuplicateString(str, 0);

    }

}
