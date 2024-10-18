import java.util.Scanner;

public class NumeroPalíndromo {
    public static void main(String[] args) {

        //Desenvolva um programa que verifique se uma palavra ou número fornecido pelo usuário é um palíndromo:

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra ou um numero: ");
        String palavra = entrada.nextLine();
        palavra = palavra.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder reversoTexto = new StringBuilder(palavra);
        reversoTexto.reverse();

        if (reversoTexto.toString().equals(palavra)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        entrada.close();
    }
}
