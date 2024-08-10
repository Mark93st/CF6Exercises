package gr.aueb.cf.week4;

import java.util.Scanner;

/**
 * Εκτυπώνει n γραμμές με
 * 1η γραμμή -> 10 stars,
 * 2η γραμμή -> 9 stars,
 * κ.ο.κ.
 */
public class StarsDesc {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Εντολές
        System.out.println("Please insert an integer");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
