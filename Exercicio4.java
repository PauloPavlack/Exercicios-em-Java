import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hp, lp, ha, la,qtd;
        System.out.println("Digite a altura da parede:");
        hp = scanner.nextDouble();
        System.out.println("Digite a largura da parede:");
        lp = scanner.nextDouble();
        System.out.println("Digite a altura do azulejo:");
        ha = scanner.nextDouble();
        System.out.println("Digite a largura ado azulejo:");
        la = scanner.nextDouble();

        qtd = (hp * lp) / (ha * la);

        System.out.printf("Quantidade de azulejos necessários %.1f:", qtd);
    }
}
