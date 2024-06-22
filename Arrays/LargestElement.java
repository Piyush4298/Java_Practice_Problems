import java.util.Scanner;

/**
 * LargestElement
 */
public class LargestElement {

    int indexOfLargetElement(int[] arr) {
        int res = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
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

        LargestElement largestElement = new LargestElement();
        int resultIndex = largestElement.indexOfLargetElement(arr);
        System.out.println("Largest Element is: " + arr[resultIndex]);
        scanner.close();
    }
    
}