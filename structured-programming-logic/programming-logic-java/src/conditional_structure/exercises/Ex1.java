package conditional_structure.exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            if (firstNumber > secondNumber) {
                System.out.println("The first number is greater.");
            } else if (secondNumber > firstNumber) {
                System.out.println("The second number is greater.");
            } else {
                System.out.println("The numbers are equal.");
            }

        scanner.close();
    }
}
