package Strings;

public class ConvertLetterToUpperCase {

    public static void toUpperCase(StringBuilder str) {

        StringBuilder tempStr = new StringBuilder("");

        Character ch = Character.toUpperCase(str.charAt(0));

        tempStr.append(ch);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length()-1) {

                tempStr.append(str.charAt(i));
                i++;
                Character ch2 = Character.toUpperCase(str.charAt(i));

                tempStr.append(ch2);

            }
            else{
                tempStr.append(str.charAt(i));
            }

            

        }

        System.out.println(tempStr);

    }

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("hi aditya here");

        toUpperCase(str);

    }
}
