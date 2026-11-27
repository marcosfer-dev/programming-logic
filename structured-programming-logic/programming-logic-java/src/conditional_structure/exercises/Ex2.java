package conditional_structure.exercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even number.");
            } else {
                System.out.println("Odd number.");
            }

        scanner.close();
    }
}
