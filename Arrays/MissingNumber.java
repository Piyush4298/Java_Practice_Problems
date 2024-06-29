import java.util.Scanner;

/**
 * MissingNumber
 * Input Format: N = 5, array[] = {1,2,4,5} 
 * Result:3
 * Explanation: In the given array, number 3 is missing. So, 3 is the answer.
 * 
 */
public class MissingNumber {
    static int findMissingNumber(int arr[], int n) {
        int summation = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return summation - sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        System.out.print("Enter all " + (n - 1) + " elements: ");
        int[] arr = new int[n - 1];
        for(int i = 0; i < n - 1; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        int missingNumber = findMissingNumber(arr, n);
        System.out.print("Missing number is: " + missingNumber);
        scanner.close();
    }
}
