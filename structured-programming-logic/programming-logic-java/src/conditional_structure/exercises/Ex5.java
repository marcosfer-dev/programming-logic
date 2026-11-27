package conditional_structure.exercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double average = scanner.nextDouble();

            if (average >= 7.0) {
                System.out.println("Approved.");
            } else {
                System.out.println("Failed.");
            }

        scanner.close();
    }
}
