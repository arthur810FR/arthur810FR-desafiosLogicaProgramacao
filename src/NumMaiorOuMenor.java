import java.util.Scanner;

public class NumMaiorOuMenor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro:");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo numero inteiro:");
        int numero2 = entrada.nextInt();

        if (numero1 == numero2){
            System.out.println("Numeros são iguais!");
        } else if (numero1 > numero2) {
            System.out.printf("O numero %d é maior!", numero1);
        } else {
            System.out.printf("O numero %d é maior!", numero2);
        }

        entrada.close();
    }
}
