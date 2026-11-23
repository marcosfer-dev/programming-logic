package exercises;

public class Ex9 {
    public static void main(String[] args) {
        double originalPrice = 2568;
        double discountPercentage = 15;
        double finalPrice = originalPrice - (originalPrice * discountPercentage / 100.0);

        System.out.printf("Final price: %.2f%n", finalPrice);
    }
}
