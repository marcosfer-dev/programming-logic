package sequential_structure.exercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Note 1: ");
            double note1 = scanner.nextDouble();

            System.out.print("Note 2: ");
            double note2 = scanner.nextDouble();

            System.out.print("Note 3: ");
            double note3 = scanner.nextDouble();

            double average = (note1 + note2 + note3) / 3;

            System.out.println("Student average: " + average);

        scanner.close();
    }
}
