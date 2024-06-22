package Basics;

import java.util.Scanner;

public class PrimeNumber {

    boolean isPrimeNumber(int n) {
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        PrimeNumber primeNumber = new PrimeNumber();
        boolean result = primeNumber.isPrimeNumber(n);
        String finalStr = result ? "is" : "is not";
        System.out.println(n + " " + finalStr + " a Prime Number.");
        scanner.close();
    }
}
