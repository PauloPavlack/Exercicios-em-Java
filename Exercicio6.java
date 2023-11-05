import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m, h, t;
        final double C = 745.699;
        System.out.println("Digite a massa");
        m = scanner.nextDouble();
        System.out.println("Digite a altura");
        h = scanner.nextDouble();
        System.out.println("Digite o tempo");
        t = scanner.nextDouble();

        System.out.println("Quantidade de cavalos necessários:" + (m * h / t) / C );
    }
}
