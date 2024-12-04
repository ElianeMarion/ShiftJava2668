import java.util.Scanner;

public class SwitchCase {
    //Variável global vai ser criada na classe
    //public static tipo nome;
    public  static double resultado;

    //Procedimento = função que não tem retorno (VOID)
    public static void exibirMenu(){
        System.out.println("Digite a opção desejada:" +
                "\n1 - Adição" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão" +
                "\n5 - Resto da divisão");

    }

    //Procedimento = função que não tem retorno
    //public static void nomeFuncao(argumentos)
    public static void somarNumeros(int num1, double numero2){
        double soma = num1 + numero2;
        System.out.println(num1 + " + " + numero2 + " = " + soma);
    }

    //função tem um retorno => ela retorana alguma coisa para quem chamou
    //public static TIPO nomeFuncao(argumentos)
    public static double somarNumerosComRetorno (int num1, double numero2){
        double soma = num1 + numero2;
        return soma;
    }

    public static double subtracao(int numero1, double numero2){
        return numero1 - numero2;
    }

    public static double multiplicacao(int numero1, double numero2){
        return numero1 * numero2;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1;
        double numero2, multiplicacao, divisao;
        //Entrada - Usu�rio vai digitar dois valores
        System.out.println("Calculadora" +
                "\n====================================");
        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextInt();
        exibirMenu();
        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1:
                somarNumeros(numero1, numero2);
/*                System.out.println("Teste da função retorno");
                System.out.println("Soma = " + somarNumerosComRetorno(numero1, numero2));
                double media = somarNumerosComRetorno(numero1, numero2) / 2;
                System.out.println("Media: " + media);*/
                break;
            case 2:
                System.out.println("Subtração = " + subtracao(numero1, numero2));
                break;
            case 3:
                resultado = multiplicacao(numero1,numero2);
                exibirResultado("Multiplicação");
                break;
            case 4:
                resultado = numero1 / numero2;
                exibirResultado("Divisão");
                break;
            default:
                System.out.println("Op��o inv�lida");
                break;
            }

        //Processamento - Calcular as 4 opera��es (+ - * /)

        //Sa�da - exibir as 4 opera��es (+ - * /)


        //+ - * /
        /*
         *  / * Divis�o e multiplica��o
         *  % Resto da divis�o inteira
         *  + - Soma e Subtra��o
         * {[()]}    -     ((()))
         * */

    }

    private static void exibirResultado(String operacao) {
        System.out.println(operacao + " = " + resultado);
    }
}
