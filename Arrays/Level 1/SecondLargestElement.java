import java.util.Scanner;

/*
 * Input: [1,2,4,7,7,5]
 * Output: Second Largest Element is: 5
 * 
 * Input: [7, 7, 7, 7]
 * Output: There is no second largest
 */
public class SecondLargestElement {

    int secondLargestElement(int arr[]) {
        int largestElement = arr[0];
        int secondLargestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                secondLargestElement = largestElement;
                largestElement = arr[i];
            } else if (arr[i] > secondLargestElement && arr[i] != largestElement) {
                secondLargestElement = arr[i];
            }
        }
        return secondLargestElement;
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

        SecondLargestElement sLargestElement = new SecondLargestElement();
        int result = sLargestElement.secondLargestElement(arr);
        if (result != Integer.MIN_VALUE) {
            System.out.println("Second Largest Element is: " + result);
        } else {
            System.out.println("There is no second largest");
        }
        
        scanner.close();
    }
}
