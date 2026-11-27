package conditional_structure.exercises;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (firstNumber + secondNumber));
                    break;

                case '-':
                    System.out.println("Result: " + (firstNumber - secondNumber));
                    break;

                case '*':
                    System.out.println("Result: " + (firstNumber * secondNumber));
                    break;

                case '/':
                    if (secondNumber != 0) {
                        System.out.println("Result: " + (firstNumber / secondNumber));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator.");
            }

        scanner.close();
    }
}
