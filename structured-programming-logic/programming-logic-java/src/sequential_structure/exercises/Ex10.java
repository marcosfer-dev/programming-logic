package sequential_structure.exercises;

public class Ex10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " and " + b);
    }
}
