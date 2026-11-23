package sequential_structure.string;

public class StringMethods {
    public static void main(String[] args) {
        String firstName = "Marcos";
        String lastName = "Fernandes";
        String nameTwo = "Bispo";
        String anotherName = "Marcos";

        // length() - Returns the number of characters
        System.out.println("Name length: " + firstName.length());

        // equals() - Compares the content of two Strings
        System.out.println("Are the names equal? " + firstName.equals(anotherName));

        // concat() - Joins two Strings
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full name: " + fullName);
    }
}
