package Level2;

import java.util.Scanner;

/**
 * MaxSumSubarray
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * 
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
public class MaxSumSubarray {

    static int findMaximumSumOfSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        if(maxSum < 0) return sum;
        return maxSum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter capacity of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter all " + n + " elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Maximum subarray sum is: " + findMaximumSumOfSubarray(arr));
        scanner.close();
    }
}
