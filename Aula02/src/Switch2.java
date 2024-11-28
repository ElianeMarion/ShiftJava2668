import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1;
        double numero2, soma, subtracao, multiplicacao, divisao;
        //Entrada - Usu�rio vai digitar dois valores
        System.out.println("Calculadora" +
                "\n====================================");
        System.out.println("Digite o primeiro n�mero: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        numero2 = leitor.nextInt();

        System.out.println("Digite a op��o desejada:" +
                "\n1 - Adi��o" +
                "\n2 - Subtra��o" +
                "\n3 - Multiplica��o" +
                "\n4 - Divis�o");
        String opcao = leitor.next();
        switch (opcao) {
            case "1":
                soma = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + soma);
                break;
            case "2":
                subtracao = numero1 - numero2;
                System.out.println("Subtra��o = " + subtracao);
                break;
            case "3":
                multiplicacao = numero1 * numero2;
                System.out.println("Multiplica��o = " + multiplicacao);
                break;
            case "4":
                divisao = numero1 / numero2;
                System.out.println("Divis�o = " + divisao);
                break;
            default:
                System.out.println("Op��o inv�lida");
                break;
        }

        //Processamento - Calcular as 4 opera��es (+ - * /)

        //Sa�da - exibir as 4 opera��es (+ - * /)


        double media = (numero1 + numero2) / 2;
        System.out.println("M�dia: " + media);

        //+ - * /
        /*
         *  / * Divis�o e multiplica��o
         *  % Resto da divis�o inteira
         *  + - Soma e Subtra��o
         * {[()]}    -     ((()))
         * */

    }
}
