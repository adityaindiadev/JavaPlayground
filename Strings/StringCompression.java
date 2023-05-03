package Strings;

public class StringCompression {
    
    public static void compressString(StringBuilder str) {

        Integer count = 1;

        StringBuilder tempStr = new StringBuilder("");

        Character ch = str.charAt(0);
        
        for (int i = 1; i < str.length(); i++) {
            
            if (str.charAt(i) == ch) {
                tempStr.append(str.charAt(i));
                count++;
                
            }

            else{
                tempStr.append(count.toString());
                count = 1;
                // tempStr.append(str.charAt(i));
                ch = str.charAt(i);
            }

            
            

        }

        System.out.println(tempStr);

    }

    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("aabbcdd");

        compressString(str);

    }
}
