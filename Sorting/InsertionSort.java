package Sorting;

import java.util.Scanner;

public class InsertionSort {

    void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the " + n + " elements(with spaces in between): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        InsertionSort sort = new InsertionSort();
        sort.insertionSort(arr);

        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
