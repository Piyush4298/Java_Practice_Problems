package Level2;

import java.util.ArrayList;

/**
 * PrintSpiralMatrix
 * Input: Matrix[][] = { { 1, 2, 3, 4 },
 * { 5, 6, 7, 8 },
 * { 9, 10, 11, 12 },
 * { 13, 14, 15, 16 } }
 * Output: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
 * Explanation: The output of matrix in spiral form.
 */
public class PrintSpiralMatrix {
    static ArrayList<Integer> sprialMatrix(int matrix[][]) {
        ArrayList<Integer> aList = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0, bottom = m - 1, right = n - 1;
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                aList.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                aList.add(matrix[i][right]);
            }
            right--;

            for(int i = right; i >= left; i--) {
                aList.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i = bottom; i >= top; i--) {
                aList.add(matrix[i][left]);
            }
            left++;
        }
        return aList;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        ArrayList<Integer> spiraList = sprialMatrix(matrix);
        System.out.print("Spiral print: ");
        for (int num : spiraList) {
            System.out.print(num + " ");
        }
    }
}
