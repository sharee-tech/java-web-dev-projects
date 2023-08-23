package org.launchcode;

import java.util.Scanner;
public class SearchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once" +
                "or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in" +
                "it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        System.out.println(firstSentence);
        System.out.println("Search for a term to see if it exists in the above sentence: ");
        String term = input.next().toLowerCase();
        System.out.println(term);
        String checkTerm = String.valueOf(firstSentence.toLowerCase().contains(term));
        System.out.println(checkTerm);
        int index = firstSentence.indexOf(term);
        int length = term.length();
        if (checkTerm.equals("true")) {
            System.out.println("'" + term + "'" + "is first found in the above sentence at index " + index + " and is " + length + " characters long.");
        } else {
            System.out.println("'" + term + "'" + "is not found in the above sentence");
        }
        String newSentence = firstSentence.replace(term, "");
        System.out.println(newSentence);
        input.close();
    }
}
