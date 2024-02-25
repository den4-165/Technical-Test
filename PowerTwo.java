/*Question 3: Power of Two
 * Write a program that takes an interger as input and returns true if the input is a power of two.
 */

import java.util.Scanner;

public class PowerTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Interger: ");
        int num1 = input.nextInt();
        input.close();

        // calls the method and prints the result
        System.out.println("Is " + num1 + " power of two:  " + powerOfTwo(num1));

    }

    // Method to check if the interger is a power of two or not.
    public static boolean powerOfTwo(int i) {
        if (i == 0) {
            return false;
        }

        while (i != 1) {
            if (i % 2 != 0) {
                return false;
            }
            i = i / 2;
        }
        return true;
    }
}
