package TwoDimensionArray;

import java.util.*;;

public class Creation {

    public static void inputMatrix(int matrix[][]) {

        Scanner sc = new Scanner(System.in);

        int rows = matrix.length, columns = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {

                matrix[row][column] = sc.nextInt();

            }
        }

    }

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

        int matrix[][] = new int[3][3];

        inputMatrix(matrix);
        printMatrix(matrix);

    }

}
