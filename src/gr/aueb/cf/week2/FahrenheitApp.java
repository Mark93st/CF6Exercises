package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει απο τον χρήστη εναν ακέραιο που
 * συμβολίζει τη θερμοκρασία σε Fahrenheit
 * και τη μετατρέπει με βαση τον τύπο
 * (5/9)(F-32) σε Celsius.
 */
public class FahrenheitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;

        System.out.println("Εισάγετε θερμοκρασία σε ακέραιο βαθμό Fahrenheit: ");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d\u2109 = %d\u2103\n", fahrenheit, celsius);
    }
}
