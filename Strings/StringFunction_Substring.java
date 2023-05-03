package Strings;

public class StringFunction_Substring {

    public static void substring(String str, int startingIndex, int endingIndex) {

        String tempString = "";

        for (int i = startingIndex; i <= endingIndex; i++) {

            tempString += str.charAt(i);

        }

        System.out.println("Substring is: ");
        System.out.println(tempString);

    }

    

    public static void main(String[] args) {

        String str1 = "RACECAR";

        String str2 = new String("RACECAR");

        substring(str2, 0, 2);

    }
}


