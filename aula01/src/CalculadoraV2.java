import java.util.Scanner;

public class CalculadoraV2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1, numero2;
        //Entrada - Usuário vai digitar dois valores
        System.out.println("Calculadora" +
                "\n====================================");
        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextInt();

        //Processamento - Calcular as 4 operações (+ - * /)
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = numero1 / (double) numero2;

        //Saída - exibir as 4 operações (+ - * /)
        System.out.println(numero1 + " + " + numero2 + " = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);

        double media = (numero1 + numero2) / 2;
        System.out.println("Média: " + media);

        //+ - * /
        /*
         *  / * Divisão e multiplicação
         *  % Resto da divisão inteira
         *  + - Soma e Subtração
         * {[()]}    -     ((()))
         * */

    }
}
