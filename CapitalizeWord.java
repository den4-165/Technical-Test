/*Question 4: Capitalize Words
 * Write a program that accepts a string as input , capitalizes the first letter of each word in the string, and then return the result string.
 */

import java.util.Scanner;

public class CapitalizeWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String sent = input.nextLine();
        input.close();

        // calls the method and prints the result
        String result = capitalizeFirstLetter(sent);
        System.out.println("Capitalized String :\n " + result);

    }

    // Method to capitalize the first letter of each word in the string.
    public static String capitalizeFirstLetter(String sent) {
        // split the string into words
        String[] words = sent.split(" ");

        // capitalize the first letter of each word
        String result = "";
        for (String word : words) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String remainingLetters = word.substring(1).toLowerCase();
            result += firstLetter + remainingLetters + " ";
        }
        return result.trim();
    }

}
