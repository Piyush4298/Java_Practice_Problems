package Level2;

import java.util.Scanner;

/**
 * MajorityElement
 * 
 * Input Format: N = 7, nums[] = {2,2,1,1,1,2,2} 
 * Result : 2
 * Explanation : After counting the number of times each element appears and 
 * comparing it with half of array size( > n / 2), we get 2 as result.
 */
public class MajorityElement {

    static int findMajorityElement(int arr[], int n) {
        int element = arr[0];
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == element) {
                count++;
            } else {
                count--;
            }
            if(count == 0) {
                element = arr[i];
                count = 1;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter capacity of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter all" + n + "elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = findMajorityElement(arr, n);
        System.out.println("Majority Element is: " + result);
        scanner.close();
    }    
}