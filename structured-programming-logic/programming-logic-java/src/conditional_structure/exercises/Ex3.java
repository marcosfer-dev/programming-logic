package conditional_structure.exercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Positive number.");
            } else if (number < 0) {
                System.out.println("Negative number.");
            } else {
                System.out.println("Zero.");
            }

        scanner.close();
    }
}
