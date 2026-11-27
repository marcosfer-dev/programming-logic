package conditional_structure.exercises;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int year = scanner.nextInt();

            if (year % 400 == 0) {
                System.out.println("Leap year.");
            } else if (year % 100 == 0) {
                System.out.println("Not a leap year.");
            } else if (year % 4 == 0) {
                System.out.println("Leap year.");
            } else {
                System.out.println("Not a leap year.");
            }

        scanner.close();
    }
}
