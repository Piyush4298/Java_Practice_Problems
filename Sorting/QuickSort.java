package Sorting;

import java.util.Scanner;

public class QuickSort {

    int findPivotElement(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] >= pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = findPivotElement(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
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

        QuickSort sort = new QuickSort();
        sort.quickSort(arr, 0, n-1);

        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
