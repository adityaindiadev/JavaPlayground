package PatternsSimple;

    /*
A 
B C 
D E F 
G H I J 
     */

public class CharacterPatterns {
    
    public static void main(String[] args) {
        
        int line = 4;

        char ch = 'A';

        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= outer; inner++) {
                
                System.out.print(ch + " ");
                ch++;

            }

            System.out.println();

        }

    }

}
