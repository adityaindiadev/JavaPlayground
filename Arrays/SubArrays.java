package Arrays;

public class SubArrays {

    public static void printSubArrays(int array[]) {

        int totalSubarrays = 0;

        for (int first = 0; first < array.length; first++) {

            for (int second = first; second < array.length; second++) {

                System.out.print("[");
                int sumOfSubArray = 0;

                for (int third = first; third <= second; third++) {

                    sumOfSubArray = sumOfSubArray + array[third];

                    System.out.print(array[third]);

                    if (third != second) {
                        System.out.print(", ");
                    }

                }

                

                totalSubarrays++;

                System.out.print("]  ");

                System.out.print("sumOfSubArray: " + sumOfSubArray + " |  ");

            }
            System.out.println();

        }
        System.out.println("Total SubArrays: " + totalSubarrays);

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 3, 6 };

        printSubArrays(arr);

    }

}
