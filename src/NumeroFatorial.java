import java.util.Scanner;

public class NumeroFatorial {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Digite um numero:");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.printf("O fatorial do numero %d é %d!", numero, fatorial);

        entrada.close();
    }
}
