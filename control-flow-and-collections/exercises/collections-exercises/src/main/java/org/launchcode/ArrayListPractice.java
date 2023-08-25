package org.launchcode;

import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int total = EvenNumbers.sumEvenNumbers(integers);
        System.out.println(total);

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        System.out.println(FiveLetterWords.fiveLetters());
    }
}
