package exercises;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Celsius to Fahrenheit Converter");
            System.out.print("Celsius: ");
            double c = scanner.nextDouble();

            double f = (c * 1.8) + 32;

            System.out.printf("%.0f Celsius is %.0f Fahrenheit%n", c, f);
        scanner.close();
    }
}
