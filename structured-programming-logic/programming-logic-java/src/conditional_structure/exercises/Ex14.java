package conditional_structure.exercises;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int age = scanner.nextInt();

            if (age >= 0 && age <= 13) {
                System.out.println("Children category.");
            } else if (age >= 14 && age <= 17) {
                System.out.println("Youth category.");
            } else if (age >= 18 && age <= 35) {
                System.out.println("Adult category.");
            } else if (age >= 36) {
                System.out.println("Master category.");
            } else {
                System.out.println("Invalid age.");
            }

        scanner.close();
    }
}
