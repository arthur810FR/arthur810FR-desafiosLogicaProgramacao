import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        //Faça um programa que exiba a tabuada de um número fornecido pelo usuário, de 1 até 10:
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite qual tabuada quer:");
        int tabuada = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite qual a operação da tabuada(+ | - | * | /:");
        String operacao = entrada.nextLine();

        if (operacao.equals("+")) {
            for (int i = 0; i <= 10; i++) {
                int soma = i + tabuada;
                System.out.printf("\n%d + %d = %d", i, tabuada, soma);
            }
        } else if (operacao.equals("-")) {
            for (int i = 0; i <= 10; i++){
                int subtracao = i - tabuada;
                System.out.printf("\n%d - %d = %d", i, tabuada, subtracao);
            }
        } else if (operacao.equals("*")) {
            for (int i = 0; i <= 10; i++){
                int multiplicacao = i * tabuada;
                System.out.printf("\n%d * %d = %d", i, tabuada, multiplicacao);
            }
        } else if (operacao.equals("/")) {
            for (int i = 0; i <= 10; i++){
                int divisao = i / tabuada;
                System.out.printf("\n%d / %d = %d", i, tabuada, divisao);
            }
        } else {
            System.out.println("Operacao invalida!!");
        }
        entrada.close();
    }
}
