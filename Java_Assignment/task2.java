package Java_Assignment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number : ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int integerEquivalent = romanToInteger(romanNumeral);
        System.out.println("Integer Equivalent: " + integerEquivalent);
    }
   
    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = romanCharToInt(c);
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }
        return result;
    }
    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}