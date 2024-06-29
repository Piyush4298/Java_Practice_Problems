package Patterns;

// Input Format: N = 3
// Result: 
//   *  
//  *** 
// *****   
// Input Format: N = 6
// Result:
//      *     
//     ***    
//    *****   
//   *******  
//  ********* 
// *********** 

public class Pyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {

            for(int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for(int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            for(int j = 2*i - 1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
