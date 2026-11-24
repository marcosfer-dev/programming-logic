package conditional_structure;

public class IfElse {
    public static void main(String[] args) {

        double grade = 75.0;

        if (grade >= 90) {
            System.out.println("Excellent!");

        } else if (grade >= 70) {
            System.out.println("Good job!");

        } else {
            System.out.println("You need to improve!");
        }
    }
}
