import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarList {
    public static void main(String[] args) {

        //Crie um programa que receba uma lista de números e a ordene em ordem crescente

        Scanner entrada = new Scanner(System.in);

        ArrayList<Double> numeros = new ArrayList<>();
        String entrada1;

        do {
            System.out.print("Digite um número ou 'sair' para finalizar: ");
            entrada1 = entrada.next();

            if (!entrada1.equalsIgnoreCase("sair")) {
                try {
                    numeros.add(Double.parseDouble(entrada1));
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida, por favor, insira um número ou 'sair'.");
                }
            }

        } while (!entrada1.equalsIgnoreCase("sair"));

        Collections.sort(numeros);

        System.out.println("Lista ordenada:");
        for(Double numero : numeros){
            System.out.println(numero);
        }

        entrada.close();
    }
}
