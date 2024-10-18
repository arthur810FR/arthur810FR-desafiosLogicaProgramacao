import java.util.Scanner;
import java.util.function.Predicate;

public class NumeroParOuImpar {
    public static void main(String[] args) {

        //Escreva um programa que peça ao usuário para inserir um número e verifique se ele é par ou ímpar:

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = entrada.nextInt();

        Predicate<Integer> isPar = (n) -> n % 2 == 0;

        if (isPar.test(numero)) {
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é ímpar!");
        }
        entrada.close();
    }
}
