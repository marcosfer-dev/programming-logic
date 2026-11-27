package conditional_structure.exercises;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();

            if (number > 0 && number % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number does not meet both conditions.");
            }

        scanner.close();
    }
}
