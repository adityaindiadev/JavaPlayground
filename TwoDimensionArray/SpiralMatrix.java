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

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printMatrix(matrix);

    }

}
