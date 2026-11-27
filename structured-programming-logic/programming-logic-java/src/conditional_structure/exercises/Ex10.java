package conditional_structure.exercises;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double grade = scanner.nextDouble();

            if (grade >= 9 && grade <= 10) {
                System.out.println("Grade A.");
            } else if (grade >= 7 && grade < 9) {
                System.out.println("Grade B.");
            } else if (grade >= 5 && grade < 7) {
                System.out.println("Grade C.");
            } else if (grade >= 0 && grade < 5) {
                System.out.println("Grade D.");
            } else {
                System.out.println("Invalid grade.");
            }

        scanner.close();
    }
}
