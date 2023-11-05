import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f1, f2, f3, f4, mediaSalario;
        System.out.println("Digite o salário do primeiro funcionário:");
        f1 = scanner.nextDouble();
        System.out.println("Digite o salário do segundo funcionário:");
        f2 = scanner.nextDouble();
        System.out.println("Digite o salário do terceiro funcionário:");
        f3 = scanner.nextDouble();
        System.out.println("Digite o salário do quarto funcionário:");
        f4 = scanner.nextDouble();

        mediaSalario = (f1 + f2 + f3 + f4) / 4;

        System.out.printf("Média salaria da empresa %.2f:", mediaSalario);
    }
}
