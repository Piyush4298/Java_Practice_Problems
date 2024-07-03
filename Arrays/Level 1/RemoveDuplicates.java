import java.util.Scanner;

/**
 * RemoveDuplicates
 * 
 * Input:
 * arr[1,1,2,2,2,3,3]
 * Output:
 * arr[1,2,3,_,_,_,_]
 * 
 * Input:
 * arr[1,1,1,2,2,3,3,3,3,4,4]
 * Output:
 * arr[1,2,3,4,_,_,_,_,_,_,_]
 */
public class RemoveDuplicates {

    static int removeDuplicatesFromSortedArray(int[] arr) {
        int i = 0;
        for(int j = 0; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
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

        System.out.print("Unique elements are: ");
        int k = removeDuplicatesFromSortedArray(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}