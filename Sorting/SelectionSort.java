package Sorting;

import java.util.Scanner;

/**
 * SelectionSort
 * Input: N = 6, array[] = {13,46,24,52,20,9} 
 * Output: 9,13,20,24,46,52
 */
public class SelectionSort {

    void selectionSort(int arr[]) {
        for(int i = 0; i <= arr.length - 2; i++) {
            int minIndex = i;
            for(int j = i+1; j <= arr.length - 1; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the "+ n + " elements(with spaces in between): ");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        SelectionSort sort = new SelectionSort();
        sort.selectionSort(arr);

        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}