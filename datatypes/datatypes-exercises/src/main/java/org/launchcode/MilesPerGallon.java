package org.launchcode;
 import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        Double miles = input.nextDouble();
        System.out.println("Enter the number of gallons to fill tank: ");
        Double gasConsumed = input.nextDouble();
        Double milesPerGallon = miles / gasConsumed;
        System.out.println("Your vehicle gets " + milesPerGallon + " miles per gallon.");
        input.close();

    }
}
