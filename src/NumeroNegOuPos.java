import java.util.Scanner;

public class NumeroNegOuPos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numero = entrada.nextInt();

        if (numero > 0){
            System.out.println("Numero é positivo");
        } else if (numero < 0){
            System.out.println("Numero é negativo!");
        } else {
            System.out.println("Numero é nulo!");
        }

        entrada.close();
    }
}
