package gr.aueb.cf.week4;

import java.util.Scanner;

/**
 * Εκτυπώνει n*n stars
 */
public class StarsHV {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Εντολές
        System.out.println("Please insert an integer");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
