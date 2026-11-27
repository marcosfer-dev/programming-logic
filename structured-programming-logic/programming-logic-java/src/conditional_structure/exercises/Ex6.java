package conditional_structure.exercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int age = scanner.nextInt();

            if (age >= 0 && age <= 12) {
                System.out.println("Child.");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teenager.");
            } else if (age >= 18 && age <= 59) {
                System.out.println("Adult.");
            } else if (age >= 60) {
                System.out.println("Senior.");
            } else {
                System.out.println("Invalid age.");
            }

        scanner.close();
    }
}
