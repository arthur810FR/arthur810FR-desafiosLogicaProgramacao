import java.util.Scanner;

public class NumeroParOuImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = entrada.nextInt();

        if (numero % 2 == 0){
            System.out.println("Numero é par!");
        } else {
            System.out.println("Numero é impar!");
        }

        entrada.close();
    }
}
