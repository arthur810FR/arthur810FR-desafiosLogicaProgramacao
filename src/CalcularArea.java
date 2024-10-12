import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {

        int escolha;
        int numero = 0;

        Scanner entrada = new Scanner(System.in);

        do {

        System.out.println("======== MENU ========");
        System.out.println("1 --> Calcular área do quadrado;");
        System.out.println("2 --> Calcular área do círculo;");
        System.out.println("3 --> Sair;");
        escolha = entrada.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Digite o valor do lado do quadrado:");
                double lado = entrada.nextDouble();

                double quadrado = Math.pow(lado, 2);

                System.out.println("A area do quadrado é: " + quadrado);

                break;

            case 2:
                System.out.println("Digite o valor do raio do circulo:");
                double raio = entrada.nextDouble();

                double areaCirculo = 3.14 * Math.pow(raio, 2);

                System.out.println("A area do circulo é:" + areaCirculo);

                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opcao invalida!");
        }
        } while (escolha != 3);

        entrada.close();
    }
}
