package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν ένα έτος ειναι δίσεκτο.
 * Ένα έτος ειναι δίσεκτο αν διαιρείται με το 4
 * και είτε διαιρείται με το 100 ή διαιρείται με το 100 και το 400.
 */
public class LeapYearApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("Please insert the year");
        year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 ==0)) {
            isLeap = true;
        }

        System.out.println("Year: " + year + " is leap: " + isLeap);
    }
}
