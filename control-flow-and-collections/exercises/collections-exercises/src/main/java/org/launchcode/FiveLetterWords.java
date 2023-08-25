package org.launchcode;

import java.util.ArrayList;
public class FiveLetterWords {
    public static String fiveLetters(ArrayList<String> arrList) {
        for (String word : arrList) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
