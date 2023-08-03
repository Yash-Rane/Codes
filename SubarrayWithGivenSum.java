import java.util.ArrayList;
import java.util.List;

public class SubarrayWithGivenSum {

    public static List<Integer> findSubarrayWithSum(int[] arr, int targetSum) {
        int left = 0;
        int currentSum = 0;
        List<Integer> subarray = new ArrayList<>();

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            while (currentSum > targetSum) {
                currentSum -= arr[left];
                left++;
            }

            if (currentSum == targetSum) {
                for (int i = left; i <= right; i++) {
                    subarray.add(arr[i]);
                }
                break; // Comment this line if you want to find all subarrays with the target sum
            }
        }

        return subarray.isEmpty() ? null : subarray;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {1, 4, 7, 3, 9, 8},
            {3, 2, 1, 5, 6},   
            {2, 4, 6, 8},    
            {1, 2, 3, 4, 5}, 
            {10, 5, 2, 6, 8},  
            {1, 2, 3, 4, 5},   
            {5, 10, 20, 30, 40},
            {1, 2, 3, 4, 5},    
            {8, 7, 15, 6, 10},  
            {1, 1, 1, 1, 1}     
        };

        int[] sums = {11, 7, 14, 7, 12, 15, 100, 6, 17, 3};

        for (int i = 0; i < testCases.length; i++) {
            int[] arr = testCases[i];
            int sum = sums[i];
            List<Integer> result = findSubarrayWithSum(arr, sum);
            System.out.println("Test Case " + (i + 1) + ":");
            System.out.println("arr = " + java.util.Arrays.toString(arr));
            System.out.println("sum = " + sum);
            System.out.println("Expected Output: " + result);
            System.out.println();
        }
    }
}