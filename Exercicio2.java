import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte masculino = 1;
        byte feminino = 2;
        byte sexo;
        float altura;
        float alturaMinima = Float.MAX_VALUE;
        float alturaMaxima = Float.MIN_VALUE;
        float somaAlturaHomens = 0;
        int numeroMulheres = 0;

        for (byte i = 0; i < 10; i++) {
            System.out.println("Digite o sexo: 1 (Masculino), 2 (Feminino)");
            sexo = scanner.nextByte();

            if (sexo == masculino) {
                System.out.println("Masculino");
            } else if (sexo == feminino) {
                System.out.println("Feminino");
                numeroMulheres++;
            }

            System.out.println("Digite a altura");
            altura = scanner.nextFloat();

            somaAlturaHomens += sexo == masculino ? altura : 0;

            alturaMinima = Math.min(alturaMinima, altura);
            alturaMaxima = Math.max(alturaMaxima, altura);
        }

        float mediaAlturaHomens = somaAlturaHomens / 10;

        System.out.println("Altura mínima: " + alturaMinima);
        System.out.println("Altura máxima: " + alturaMaxima);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("Número de mulheres: " + numeroMulheres);
    }
}
