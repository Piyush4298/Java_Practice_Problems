package Level2;

/**
 * RotateMatrix90Degree
 * Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix.
 */
public class RotateMatrix90Degree {
    static void rotateArray(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int row = 0; row < m; row++) {
            int colStart = 0, colEnd = n - 1;
            while(colStart <= colEnd) {
                int temp = arr[row][colStart];
                arr[row][colStart] = arr[row][colEnd];
                arr[row][colEnd] = temp;
                colStart++;
                colEnd--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        rotateArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}