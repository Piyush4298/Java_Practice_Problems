package Level2;

import java.util.Scanner;

/**
 * MaxSumSubarrayPrintArray
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: [4,-1,2,1]
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * 
 * Input: nums = [5,4,-1,7,8]
 * Output: [5,4,-1,7,8]
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
public class MaxSumSubarrayPrintArray {
    static int[] findIndexOfMaximumSumOfSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int startIdx = -1, endIdx = -1;
        int start = 0;
        int[] indices = new int[2];
        for(int i = 0; i < arr.length; i++) {
            if(sum == 0) {
                start = i;
            }
            sum += arr[i];
            if(sum > maxSum) {
                maxSum = sum;
                startIdx = start;
                endIdx = i;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        indices[0] = startIdx;
        indices[1] = endIdx;
        return indices;
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


        System.out.print("Array with maximum subarray sum is: ");
        int[] indices = findIndexOfMaximumSumOfSubarray(arr);
        for (int i = indices[0]; i <= indices[1]; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}