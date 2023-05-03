package Strings;

public class StringFunction_Compare {
    



    public static void main(String[] args) {
        
        String str1 = "RACECAR";

        String str2 = new String("RACECAR");

        System.out.println("Without Equals Function:-- ");

        if (str1 == str2) {
            
            System.out.println("Strings are Equal !");

        }

        else{
            System.out.println("Strings are not Equal !");
        }


        System.out.println("With Equals Function:-- ");
        if (str1.equals(str2)) {
            
            System.out.println("Strings are Equal !");

        }

        else{
            System.out.println("Strings are not Equal !");
        }



    }
}
