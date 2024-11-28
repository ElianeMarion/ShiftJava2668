import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double dolar, reais;
        System.out.println("Valor da doação em dólar: $");
        dolar = leitor.nextDouble();
        reais = dolar * 5.8;
        System.out.println("Reais: " + reais);
    }
}
