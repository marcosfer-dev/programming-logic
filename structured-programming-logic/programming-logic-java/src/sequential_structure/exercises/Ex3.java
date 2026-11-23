package sequential_structure.exercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("What is your age? ");
            int age = scanner.nextInt();

            double count = (double) age * 365;

            System.out.println("You have approximately lived " + count + " days.");

        scanner.close();
    }
}
