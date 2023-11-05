import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r, a;
        final double PI = 3.14;
        System.out.println("Defina o raio:");
        r = scanner.nextDouble();
        System.out.println("Defina a altura:");
        a = scanner.nextDouble();

        System.out.println("Volume da lata de olho:" + PI * r * r * a);
    }
}
