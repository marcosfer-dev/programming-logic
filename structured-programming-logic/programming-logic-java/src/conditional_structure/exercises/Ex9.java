package conditional_structure.exercises;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double firstSide = scanner.nextDouble();
            double secondSide = scanner.nextDouble();
            double thirdSide = scanner.nextDouble();

            if (firstSide > 0 && secondSide > 0 && thirdSide > 0
                    && firstSide + secondSide > thirdSide
                    && firstSide + thirdSide > secondSide
                    && secondSide + thirdSide > firstSide) {

                System.out.println("Forms a triangle.");

            } else {
                System.out.println("Does not form a triangle.");
            }

        scanner.close();
    }
}
