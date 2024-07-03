import java.util.Scanner;

/**
 * MoveZerosToEnd
 * 
 * Input = [1 ,0 ,2 ,3 ,0 ,4 ,0 ,1]
 * Output = [1 ,2 ,3 ,4 ,1 ,0 ,0 ,0]
 */
public class MoveZerosToEnd {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // BRUTE FORCE | Time: O(n^2)
    // static void moveZerosAtEndOfArray(int[] arr) {
    //     for(int i = 0; i < arr.length; i++) {
    //         for(int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] == 0 && arr[j] != 0) {
    //                 swap(arr, i, j);
    //                 break;
    //             }
    //         }
    //     }
    // }

    static void moveZerosAtEndOfArray(int[] arr) {
        int j = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for(int i = j + 1; i < arr.length; i++) {
            if(arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
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

        moveZerosAtEndOfArray(arr);
        System.out.print("Array with zeros at end: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
