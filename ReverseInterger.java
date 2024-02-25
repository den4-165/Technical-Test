/* Question 5: Reverse Interger
*Write a program take an interger as input and returns an interger with reversed digit ordering 
 */

import java.util.Scanner;

public class ReverseInterger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        // calls the reversedInterger method and prints out the result
        int reversed = reverseInterger(num);
        System.out.println("Reversed number is: " + reversed);
    }

    // Method to reverse the digit ordering of the interger.
    public static int reverseInterger(int num1) {

        int reversed = 0;
        boolean negative = false;

        // check if the number is negative
        if (num1 < 0) {
            negative = true;
            num1 = -num1;
        }

        // reverse the digit ordering
        while (num1 > 0) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
        }

        // check if the number is negative and convert it back if true
        if (negative) {
            reversed = -reversed;
        }

        return reversed;

    }
}
