package exercises;

public class Ex5 {
    public static void main(String[] args) {
        double hourlyRate = 25.50;
        int hoursWorked = 200;
        double salary = hourlyRate * hoursWorked;
        System.out.printf("Monthly salary: $%.2f%n", salary);
    }
}
