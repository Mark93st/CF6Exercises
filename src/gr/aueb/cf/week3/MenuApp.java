package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού με επιλογές (1-5) μέχρι
 * ο χρήστης να δώσει το 5 για έξοδο.
 */
public class MenuApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Επιλέξτε ένα απο τα παρακάτω: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = scanner.nextInt();

            if (choice <= 0 || choice >= 6) {
                System.out.println("Λάθος επιλογή");
                break;
            }

            if (choice == 5) {
                System.out.println("Έξοδος...");
                break;
            }

            if (choice == 1) {
                System.out.println("Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Αναζήτηση");
            }
        }
    }
}
