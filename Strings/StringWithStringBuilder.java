package Strings;

public class StringWithStringBuilder {
    


    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("");

        for (char i = 'a'; i <= 'z'; i++) {

            str.append(i);
            
        }

        System.out.println(str);

    }
}
