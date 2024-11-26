import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1;
        double numero2;
        //Entrada - Usuário vai digitar dois valores
        System.out.println("Calculadora" +
                "\n====================================");
        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextInt();

        //Processamento - Calcular as 4 operações (+ - * /)
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

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
