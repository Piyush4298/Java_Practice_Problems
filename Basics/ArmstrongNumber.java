package Basics;

import java.util.Scanner;

/**
 * ArmstrongNumber
 */
public class ArmstrongNumber {

    boolean isArmstrongNumber(int n) {
        int sum = 0;
        int num = n;
        while(num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, 3);
            num = num / 10;
        }
        if(sum == n) { return true; }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        ArmstrongNumber aNumber = new ArmstrongNumber();
        boolean result = aNumber.isArmstrongNumber(n);
        String finalStr = result ? "is" : "is not";
        System.out.println(n + " " + finalStr + " an Armstrong number.");
        scanner.close();
    }
}