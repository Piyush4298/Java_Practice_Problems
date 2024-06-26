import java.util.Scanner;

/**
 * CheckIfArraySorted
 * 
 * Input: N = 5, array[] = {1,2,3,4,5}
 * Output: True.
 * Input: N = 4, array[] = {1,2,4,3}
 * Output: False.
 */
public class CheckIfArraySorted {

    static boolean isArraySorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter capacity of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter all " + n + " elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        boolean result = isArraySorted(arr);
        System.out.println(result ? "True" : "False");
        scanner.close();
    }
}