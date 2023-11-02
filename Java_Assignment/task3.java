package Java_Assignment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        boolean isPangram = isPangram(sentence);
        System.out.println("check is it a Pangram:" + isPangram);
    }
    // Function to check if a sentence is a pangram
    public static boolean isPangram(String sentence) {
        boolean[] charSet = new boolean[26];
        int index;
        int length = sentence.length();

        for (int i = 0; i < length; i++) {
            if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z') {
                index = sentence.charAt(i) - 'A';
            } else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z') {
                index = sentence.charAt(i) - 'a';
            } else {
                continue;
            }
            charSet[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (charSet[i] == false) {
                return false;
            }
        }

        return true;
    }
    
}
