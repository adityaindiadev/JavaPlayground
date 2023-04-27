package PatternsAdvance;


    /*

    * * * * 
   *     * 
  *     * 
 *     * 
* * * * 
adityagupta

     */

public class HollowRombus {
    
    public static void printHollowRombus(int line) {


        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= (line - outer) + 1; inner++) {
                

                System.out.print(" ");
               

            }

            for (int inner = 1; inner <= line; inner++) {
                

                if (outer == 1 || outer == line || inner == 1 || inner == line) {
                    System.out.print( "* ");
                }

                else{
                    System.out.print(  "  ");
                }
               

            }

            System.out.println();

        }
        
    }

    
    public static void main(String[] args) {
        
        printHollowRombus(5);

    }

}
