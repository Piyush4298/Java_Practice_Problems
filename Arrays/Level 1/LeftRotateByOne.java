import java.util.Scanner;

/**
 * LeftRotateByOne
 * Input: N = 5, array[] = {1,2,3,4,5} 
 * Output: 2,3,4,5,1
 * 
 */
public class LeftRotateByOne {
    static void leftRotateArrayByOne(int arr[]) {
        int length = arr.length;
        int firsElement = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[length - 1] = firsElement;
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
        
        leftRotateArrayByOne(arr);
        System.out.print("Array rotated by 1: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
