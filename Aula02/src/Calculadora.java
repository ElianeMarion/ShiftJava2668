import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1;
        double numero2, soma, subtracao, multiplicacao, divisao;
        //Entrada - Usuário vai digitar dois valores
        System.out.println("Calculadora" +
                "\n====================================");
        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextInt();

        System.out.println("Digite a opção desejada:" +
                "\n1 - Adição" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão");
        int opcao = leitor.nextInt();
        if(opcao == 1 ) {
            soma = numero1 + numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + soma);
        }else if(opcao == 2 ) {
            subtracao = numero1 - numero2;
            System.out.println("Subtração = " + subtracao);
        }else if (opcao == 3 ) {
            multiplicacao = numero1 * numero2;
            System.out.println("Multiplicação = " + multiplicacao);
        }
        else if(opcao == 4){
            divisao = numero1 / numero2;
            System.out.println("Divisão = " + divisao);
        }
        else{
            System.out.println("Opção inválida");
        }
        //Processamento - Calcular as 4 operações (+ - * /)

        //Saída - exibir as 4 operações (+ - * /)


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
