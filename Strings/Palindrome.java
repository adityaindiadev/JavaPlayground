package Strings;

public class Palindrome {

    public static void checkPalindrome(String str) {
        
        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                
                System.out.println("Not Palindrome!");

                return;

            }
            

        }

        System.out.println("Palindrome!");

    }
    


    public static void main(String[] args) {
        
        String str = "RACECAR";

        checkPalindrome(str);


    }
}
