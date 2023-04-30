package Arrays;

/*
 * First get the left max boundary and right max boundary, both will be array.
 * leftMax = Max(height[i] , leftMax[i-1]), initially leftMax[0] = height[0];
 * rightMax = Max(height[j] , rightMax[j+1]), initially rightMax[0] = height[height.length-1]. Here we will run the loop in reverse.
 * 
 * waterLevel = Min(leftMax bound, rightMax bound)
 * trappedWater = waterLevel - height[i]
 * 
 */

public class TrappingWater {

    public static void trappedWater(int height[]) {

        int leftMax[] = new int[height.length];

        leftMax[0] = height[0];
        System.out.print("leftMax: " + leftMax[0] + ", ");

        for (int i = 1; i < leftMax.length; i++) {

            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

            System.out.print(leftMax[i] + ", ");

        }

        System.out.println();

        int rightMax[] = new int[height.length];
        rightMax[rightMax.length - 1] = height[height.length - 1];

        System.out.print("rightMax: "+ rightMax[rightMax.length - 1] + ", ");

        for (int j = rightMax.length - 2; j >= 0; j--) {

            rightMax[j] = Math.max(height[j], rightMax[j + 1]);
            System.out.print(rightMax[j] + ", ");

        }
        System.out.println();
        int totalTrappedWater = 0;

        for (int bound = 0; bound < rightMax.length; bound++) {

            int waterLevel = Math.min(leftMax[bound], rightMax[bound]);

            totalTrappedWater += waterLevel -height[bound];
            
        }

        System.out.println("Total Trapped Water = " + totalTrappedWater);

    }

    public static void main(String[] args) {

        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        trappedWater(arr);

    }
}
