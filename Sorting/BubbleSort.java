package Sorting;

import java.util.Scanner;

public class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i = n - 1; i > 0; i--) {
            boolean didSwap = false;
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap) break;
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
        
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr);

        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
