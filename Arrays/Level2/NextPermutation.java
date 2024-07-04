package Level2;

import java.util.Scanner;

/**
 * NextPermutation
 * Example 1: 
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 * Explanation: All permutations of {1,2,3} are {{1,2,3}, {1,3,2}, {2,1,3}, {2,3,1}, {3,1,2}, {3,2,1}}. 
 * So, the next permutation just after {1,3,2} is {2,1,3}.
 * 
 * Example 2:
 * Input: nums = [3,2,1]
 * Output: [1,2,3]
 * Explanation: As we see all permutations of {1,2,3}, we find {3,2,1} at the last position.
 * So, we have to return the topmost permutation.
 * 
 * Example 3:
 * Input: nums = [1,1,5]
 * Output: [1,5,1]
 */
public class NextPermutation {

    static void reverseArray(int[] arr, int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static int[] findNextPermutation(int arr[], int n) {
        // Find break point where arr[i] < arr[i + 1]
        int breakPoint = -1;
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                breakPoint = i;
                break;
            }
        }
        // Handling the last permutation case
        if(breakPoint == -1) {
            reverseArray(arr, 0, n - 1);
            return arr;
        }
        // Swap with the smallest larger element 
        for(int i = n - 1; i > breakPoint; i--) {
            if(arr[i] > arr[breakPoint]){
                int temp = arr[i];
                arr[i] = arr[breakPoint];
                arr[breakPoint] = temp;
                break;
            }
        }
        // Reverse array from the break point till end.
        reverseArray(arr, breakPoint + 1, n - 1);
        return arr;
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

        int[] result = findNextPermutation(arr, n);
        System.out.print("Next Permutation: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
