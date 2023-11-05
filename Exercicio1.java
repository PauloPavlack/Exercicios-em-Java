import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String graus = "º";
        System.out.println("Digite um número para grau Celcius:");
        double c, f, k, re, ra;
        c = scanner.nextFloat();

        System.out.println("Conversão de temperatura grau Celcius para:");
        f = (c * 1.8) + 32;
        k =  c + 273.15;
        re = c * 0.8;
        ra = c * 1.8 + 32 + 459.67;
        System.out.printf("f:" + f + "\nk:" + k + "\nre:" + re + "\nra:" + ra);
    }
}
