import java.util.ArrayList;
import java.util.Scanner;

/**
 * UnionOfSorted
 * 
 * Input:
 * n = 5, arr1[] = {1, 2, 3, 4, 5}
 * m = 5, arr2 [] = {1, 2, 3, 6, 7}
 * Output:
 * 1 2 3 4 5 6 7
 * 
 */
public class UnionOfSorted {

    static ArrayList<Integer> unionOfSortedArray(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter capacity of 1st array: ");
        int n = scanner.nextInt();

        System.out.print("Enter all " + n + " elements of 1st array: ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr1[i] = num;
        }

        System.out.print("Enter capacity of 2nd array: ");
        int m = scanner.nextInt();

        System.out.print("Enter all " + m + " elements of 2nd array: ");
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();
            arr2[i] = num;
        }

        ArrayList<Integer> arrayList = unionOfSortedArray(arr1, arr2, n, m);
        System.out.print("Union of array: ");
        for (Integer integer : arrayList) {
            System.out.print(integer.intValue() + " ");
        }
        scanner.close();
    }
}