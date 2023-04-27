package PatternsAdvance;

/*

*                     * 
* *                 * * 
* * *             * * * 
* * * *         * * * * 
* * * * *     * * * * * 
* * * * * * * * * * * * 
* * * * * * * * * * * * 
* * * * *     * * * * * 
* * * *         * * * * 
* * *             * * * 
* *                 * * 
*                     * 

 */

public class ButterflyPattern {

    public static void printButterflyPattern(int line) {

        for (int outer = 1; outer <= line; outer++) {

            for (int inner = 1; inner <= line; inner++) {

                if (inner <= outer) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }

            }

            for (int inner = 1; inner <= line; inner++) {

                if (inner <= (line - outer)) {

                    System.out.print("  ");

                } else {

                    System.out.print("* ");

                }

            }

            System.out.println();

        }

        for (int outer = 1; outer <= line; outer++) {

            for (int inner = 1; inner <= line; inner++) {

                if (inner <= line + 1 - outer) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int inner = 1; inner <= line; inner++) {

                if (inner < outer) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        printButterflyPattern(5);

    }

}
