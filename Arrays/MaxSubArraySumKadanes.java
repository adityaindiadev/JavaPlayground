package Arrays;

public class MaxSubArraySumKadanes {
    public static void printMaxSubArraySum(int array[]) {

        int max = Integer.MIN_VALUE;
        int currentSumOfSubArray = 0;

        for (int first = 0; first < array.length; first++) {

            if ((currentSumOfSubArray + array[first]) > 0) {

                currentSumOfSubArray = currentSumOfSubArray + array[first];

            }

            if (currentSumOfSubArray > max) {
                max = currentSumOfSubArray;
            }

        }
        System.out.println();

        System.out.println("Max Sum of Sub Array: " + max);

    }

    public static void main(String[] args) {

        int arr[] = { -1, -3, 4, -1, -2, 1, 5, -3 };

        printMaxSubArraySum(arr);

    }

}
