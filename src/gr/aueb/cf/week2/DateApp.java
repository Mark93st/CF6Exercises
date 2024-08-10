package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει απο τον χρήστη 3 ακεραίους αριθμους
 * που αναπαριστούν ημέρα, μήνα, έτος
 * και την εμφανίζει σε μορφή: ΗΗ/ΜΜ/ΕΕ
 */
public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int formattedYear = 0;

        System.out.println("Εισάγετε ημέρα: ");
        day = in.nextInt();
        System.out.println("Εισάγετε μήνα: ");
        month = in.nextInt();
        System.out.println("Εισάγετε έτος: ");
        year = in.nextInt();
        formattedYear = year % 100;

        System.out.printf("%02d/%02d/%02d\n", day, month, formattedYear);
    }
}
