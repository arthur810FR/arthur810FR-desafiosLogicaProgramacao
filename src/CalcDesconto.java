public class CalcDesconto {
    public static void main(String[] args) {

        double precoOriginal = 25.0;
        double percentualDesconto = 10;

        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal -valorDesconto;

        System.out.println(valorDesconto);
        System.out.println(novoPreco);
    }
}
