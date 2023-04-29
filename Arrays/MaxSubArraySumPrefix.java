package Arrays;

/*
 * For making prefix array.
 * prefix[i-1] + array[i]
 * 
 * and for retriving prefix from prefix array
 * 
 * prefix[end] - prefix[start - 1] 
 * 
 */

public class MaxSubArraySumPrefix {
    
    public static void printMaxSubArraySum(int array[]) {

        int totalSubarrays = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int prefixArray[] = new int[array.length];

        prefixArray[0] = array[0];

        // for prefix array
        for (int i = 1; i < array.length; i++) {
            
            prefixArray[i] =  prefixArray[i-1] + array[i];

            // System.out.print(prefixArray[i] + ", ");

        }
        System.out.println();


        for (int first = 0; first < array.length; first++) {

            for (int second = first; second < array.length; second++) {

                // System.out.print("[");
                // int sumOfSubArray = 0;

                int sumOfSubArray = first == 0 ? prefixArray[second] : prefixArray[second] - prefixArray[first-1]; 


                if (sumOfSubArray > max) {
                    max = sumOfSubArray;
                }

                totalSubarrays++;

                // System.out.print("] ");

                System.out.print("sumOfSubArray: " + sumOfSubArray + " |  ");

            }
            System.out.println();

        }
        System.out.println("Max Sum of Sub Array: " + max);
        System.out.println("Total SubArrays: " + totalSubarrays);

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 3, 6 };

        printMaxSubArraySum(arr);

    }

}
