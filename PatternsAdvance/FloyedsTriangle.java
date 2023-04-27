package PatternsAdvance;


/*

1
2 3
4 5 6
7 8 9 10
 */

public class FloyedsTriangle {
    

    public static void printFloyedsTriangle(int line){

        int num = 1;
        

        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= outer; inner++) {
                
                System.out.print( num + " ");
                num++;

            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        
        printFloyedsTriangle(4);

    }

}
