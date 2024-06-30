import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * LongestSubarraySum2
 * 
 * Example 1:
 * Input Format: N = 3, k = 5, array[] = {2,3,5}
 * Result: 2
 * Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.
 * 
 * Example 2:
 * Input Format : N = 3, k = 1, array[] = {-1, 1, 1}
 * Result: 3
 * Explanation: The longest subarray with sum 1 is {-1, 1, 1}. And its length is 3.
 * 
 */
public class LongestSubarraySum2 {
    static int lenOfLongestSubarraySum(int arr[], int n ,int k) {
        int sum = 0, maxLen = 0;
        Map<Integer, Integer> preMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if (preMap.containsKey(rem)) {
                int len = i - preMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preMap.containsKey(sum)) {
                preMap.get(sum);
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