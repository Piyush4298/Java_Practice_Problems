import java.util.Scanner;

/**
 * BasicOperations1
 * 
 * - To insert an element in an array
 *  Input : arr = [1, 2, 3, 4] , x = 5, pos = 5
 *  Output: arr = [1, 2, 3, 4, 5]
 * 
 *  Input : arr = [1, 2, 3, 4] , x = 6, pos = 1
 *  Output: arr = [6, 1, 2, 3, 4]
 * 
 *  Input : arr = [1, 2, 3, 4] , x = 7, pos = 3
 *  Output: arr = [1, 2, 7, 3, 4] [1 2 3 4 0] -> [1 2 3 4 4] -> [1 2 3 3 4]
 */
public class BasicOperations1 {

    int[] insertIntoArray(int arr[], int x, int pos) {
        int idx = pos - 1;
        if (idx == arr.length - 1) {
            arr[arr.length - 1] = x;
        } else {
            for (int i = arr.length - 2; i >= idx; i--) {
                arr[i+1] = arr[i];
            }
            arr[idx] = x;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter capacity of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter all" + n + "elements: ");
        int[] tempArr = new int[n];
        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            tempArr[i] = num;
        }

        System.out.print("Enter the new number to insert in the array: ");
        int x = scanner.nextInt();

        System.out.print("Enter position of the new number: ");
        int pos = scanner.nextInt();

        int arr[] = new int[tempArr.length + 1];
        int idx = 0;
        for (int i : tempArr) {
            arr[idx++] = i;
        }

        System.out.println("Array after insertion: ");
        BasicOperations1 basicOperations1 = new BasicOperations1();
        int[] result = basicOperations1.insertIntoArray(arr, x, pos);
        for (int i : result) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}