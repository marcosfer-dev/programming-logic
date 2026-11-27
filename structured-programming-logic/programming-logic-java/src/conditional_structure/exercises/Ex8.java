package conditional_structure.exercises;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double purchaseAmount = scanner.nextDouble();
            double discount;
            double finalPrice;

            if (purchaseAmount > 100) {
                discount = 0.10;
            } else if (purchaseAmount >= 50) {
                discount = 0.05;
            } else if (purchaseAmount >= 0) {
                discount = 0.0;
            } else {
                System.out.println("Invalid purchase amount.");
                return;
            }

            finalPrice = purchaseAmount - (purchaseAmount * discount);

            System.out.println("Original price: R$ " + purchaseAmount);
            System.out.println("Discount: " + (discount * 100) + "%");
            System.out.println("Final price: R$ " + finalPrice);

        scanner.close();
    }
}
