package conditional_structure.exercises;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double firstSide = scanner.nextDouble();
            double secondSide = scanner.nextDouble();
            double thirdSide = scanner.nextDouble();

            if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0
                    || firstSide + secondSide <= thirdSide
                    || firstSide + thirdSide <= secondSide
                    || secondSide + thirdSide <= firstSide) {

                System.out.println("Invalid triangle.");

            } else if (firstSide == secondSide && secondSide == thirdSide) {

                System.out.println("Equilateral triangle.");

            } else if (firstSide == secondSide
                    || firstSide == thirdSide
                    || secondSide == thirdSide) {

                System.out.println("Isosceles triangle.");

            } else {

                System.out.println("Scalene triangle.");
            }

        scanner.close();
    }
}
