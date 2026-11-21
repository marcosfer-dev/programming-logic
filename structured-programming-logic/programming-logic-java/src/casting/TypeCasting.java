package casting;

public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting (Automatic)
        int integerNumber = 100;
        double decimalNumber = integerNumber;

        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + integerNumber);
        System.out.println("Double value: " + decimalNumber);

        System.out.println("------------------------------");

        // Narrowing Casting (Manual)
        double price = 99.99;
        int roundedPrice = (int) price;

        System.out.println("Narrowing Casting:");
        System.out.println("Original value: " + price);
        System.out.println("Converted value: " + roundedPrice);
    }
}
