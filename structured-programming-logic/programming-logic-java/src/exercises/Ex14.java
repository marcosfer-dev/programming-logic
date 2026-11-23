package exercises;

public class Ex14 {
    public static void main(String[] args) {
        //imc
        double weight = 70;
        double height = 1.80;
        double bmi = weight / (height * height);

        System.out.printf("BMI: %.2f%n", bmi);
    }
}
