package exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Type a numbe: ");
            int n1 = scanner.nextInt();

            System.out.print("Type another number: ");
            int n2 = scanner.nextInt();

            int sum = n1 + n2;

            System.out.println("The sum of " + n1 + " and " + n2 + " is " + sum);

        scanner.close();
    }
}
