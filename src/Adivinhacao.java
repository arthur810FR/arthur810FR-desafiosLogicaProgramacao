import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {

        int tentativas = 0;
        int numeroAleatorio = new Random().nextInt(100);
        int numero = 0;

        Scanner entrada = new Scanner(System.in);

        while (tentativas < 5){
            System.out.println("Qual o numero entre 0 e 100");
            numero = entrada.nextInt();

            tentativas++;

            if (numero == numeroAleatorio){
                System.out.println("Voce acertou o numero! Era o numero: "+ numeroAleatorio);
                break;
            }else if (numero < numeroAleatorio){
                System.out.println("Esta perto! O numero é maior!");
            }else {
                System.out.println("Esta perto! O numero é menor!");
            }
        }

        if (tentativas <= 5 && numero != numeroAleatorio){
            System.out.println("Voce nao conseguiu adivinhar o numero! O numero era: " + numeroAleatorio);
        }

        entrada.close();
    }
}
