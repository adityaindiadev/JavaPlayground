package TwoDimensionArray;

public class SpiralMatrix {

    public static void printMatrix(int matrix[][]) {
        System.out.println();

        int rows = matrix.length, columns = matrix[0].length;

        for (int row = 0; row < rows; row++) {

            for (int column = 0; column < columns; column++) {

                System.out.print(matrix[row][column] + " ");

            }

            System.out.println();

        }

    }

    public static void printSpiralMatrix(int matrix[][]) {

        Boolean cond = true;

        int i = 0;
        int firstRow = 0;
        int j = matrix[0].length-1;
        int lastCol=1;

        int k = matrix.length-1;
        int lastRow = matrix[0].length-1-1;
        int l = 0;
        int firstCol = matrix.length-2;

        while (firstRow < matrix[0].length) {

            System.out.print(matrix[i][firstRow] + ", ");
            firstRow++;

        }

        while (lastCol < matrix.length) {
            
            System.out.print(matrix[lastCol][j] + ", ");
            lastCol++; 

        }

        while (lastRow >= 0) {
            
            System.out.print(matrix[k][lastRow] + ", ");
            lastRow--; 

        }

        while (firstCol >= 0) {
            
            System.out.print(matrix[firstCol][l] + ", ");
            firstCol--; 

        }

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printMatrix(matrix);
        System.out.println();
        printSpiralMatrix(matrix);

    }

}
