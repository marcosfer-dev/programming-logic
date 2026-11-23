package sequential_structure.exercises;

public class Ex13 {
    public static void main(String[] args) {
        double baseSalary = 1500;
        double sales = 8000;
        double commission = sales * 0.10;
        double finalSalary = baseSalary + commission;

        System.out.printf("Final salary: R$ %.2f%n", finalSalary);
    }
}
