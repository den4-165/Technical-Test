/*Question 2: Fibonacci Sequence
 * Write a program to generates the Fibonacci sequence up to 100.
 */

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3;

        // print the first two numbers
        System.out.print(num1 + " " + num2);

        // calculating and printing the rest subsequent numbers
        while ((num3 = num1 + num2) <= 100) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
