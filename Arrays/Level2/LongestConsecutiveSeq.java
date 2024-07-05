package Level2;

import java.util.HashSet;
import java.util.Scanner;

/**
 * LongestConsecutiveSeq
 * 
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * 
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 */
public class LongestConsecutiveSeq {

    static int findLengthOfLongestConsecutiveSequence(int arr[], int n) {
        HashSet<Integer> hSet = new HashSet<>();
        for(int i = 0; i < n; i++) {
            hSet.add(arr[i]);
        }
        int longestSeqCount = 1;
        for (int element : hSet) {
            if(!hSet.contains(element - 1)) {
                int count = 1;
                int num = element;
                while(hSet.contains(num + 1)){
                    count++;
                    num++;
                }
                longestSeqCount = Math.max(count, longestSeqCount);
            }
        }
        return longestSeqCount;
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

        int result = findLengthOfLongestConsecutiveSequence(arr, n);
        System.out.println("Length of longest consecutive seq: " + result);
        scanner.close();
    }
}