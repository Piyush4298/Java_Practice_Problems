package Level2;

/**
 * SetMatrixZero
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * 
 */
public class SetMatrixZero {

    static void setZeros(int[][] matrix, int m, int n) {
        boolean isZero[][] = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    isZero[i][j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(isZero[i][j] == true) {
                    for(int c = 0; c < n; c++) {
                        matrix[i][c] = 0;
                    }

                    for(int r = 0; r < m; r++) {
                        matrix[r][j] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] matrix = {{1, 1, 1},{1, 0, 1},{1, 1, 1}};
        setZeros(matrix, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
