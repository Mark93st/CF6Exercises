package gr.aueb.cf.week4;

import java.util.Scanner;

/**
 * Εκτυπώνει n γραμμές από
 * αστεράκια σε αύξουσα σειρά,
 * 1η σειρά -> 1 αστεράκι,
 * 2η σειρά -> 2 αστεράκια,
 * κ.ο.κ.
 */
public class StarsAsc {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Εντολές
        System.out.println("Please insert an integer");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
