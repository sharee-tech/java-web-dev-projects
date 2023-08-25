package org.launchcode;

import java.util.ArrayList;
public class EvenNumbers {
    public static int sumEvenNumbers(ArrayList<Integer> arrList) {
        int sum = 0;
        for (int integer : arrList) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;

    }
}
