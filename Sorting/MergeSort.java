package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high) {
            if(arr[left] < arr[right]) {
                arrayList.add(arr[left]);
                left++;
            } else {
                arrayList.add(arr[right]);
                right++;
            }
        }
        while(left <= mid) {
            arrayList.add(arr[left]);
            left++;
        }

        while (right <= high) {
            arrayList.add(arr[right]);
            right++;
        }

        int i = low;
        for (int num : arrayList) {
            arr[i++] = num;
        }
    }

    void mergeSort(int arr[], int low, int high) {
        if(low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
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

        MergeSort sort = new MergeSort();
        sort.mergeSort(arr, 0, n - 1);

        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
