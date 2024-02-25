/*Question 6 : Count Vowels
 * Write a program that counts the numbers of vowels in sentence.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Vowel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        input.close();

        // calls the method countVowels and prints the result
        int count = cntVowels(sentence);
        System.out.println("Number of vowels  wihout repetition are: " + count);

    }

    // Method to count the number of vowels in the sentence.
    public static int cntVowels(String sentence) {

        int count = 0;
        // Set to store the vowels that have been seen
        Set<Character> seen = new HashSet<>();

        // use a loop to check each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                // covert the character to lowercase
                ch = Character.toLowerCase(ch);

                // check if the character is a vowel and add it to the set if it is not
                if (!seen.contains(ch)) {
                    count++;
                    seen.add(ch);
                }

            }

        }

        return count;

    }

}
