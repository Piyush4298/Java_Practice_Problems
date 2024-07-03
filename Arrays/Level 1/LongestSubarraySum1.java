import java.util.Scanner;

/**
 * LongestSubarraySum1(only positives)
 * 
 * Example 1:
 * Input Format: N = 3, k = 5, array[] = {2,3,5}
 * Result: 2
 * Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.
 * 
 * Example 2:
 * Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
 * Result: 3
 * Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
 * 
 */
public class LongestSubarraySum1 {

    static int lenOfLongestSubarraySum(int arr[], int n ,int k) {
        int sum = arr[0];
        int maxLen = 0;
        int left = 0, right = 0;
        while(right < n) {
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
            if(right < n) {
                sum += arr[right];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter capacity of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter all " + n + " elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        int result = lenOfLongestSubarraySum(arr, n , k);
        System.out.print("Length of longest subarray: " + result);

        scanner.close();
    }
}