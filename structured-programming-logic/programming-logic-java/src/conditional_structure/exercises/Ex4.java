package conditional_structure.exercises;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            int thirdNumber = scanner.nextInt();

            if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
                System.out.println("Greatest number: " + firstNumber);
            } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
                System.out.println("Greatest number: " + secondNumber);
            } else {
                System.out.println("Greatest number: " + thirdNumber);
            }

        scanner.close();
    }
}
