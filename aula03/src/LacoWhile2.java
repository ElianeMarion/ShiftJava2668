import java.util.Scanner;

public class LacoWhile2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //while(condição){ bloco de instrução }
        //Programa que some 5 números
        int num, soma = 0;

        int cont; //inicialização
        System.out.println("Este programa soma números para isso:" +
                "\nDetermine qual o valor inicial para a variável de controle: ");
        cont = leitor.nextInt();
        System.out.println("Quantos números você deseja somar? ");
        int qtd = leitor.nextInt();
        qtd += cont;
        while (cont < qtd) { //variável controladora
            System.out.println("Digite um número: ");
            num = leitor.nextInt();
            soma = soma + num; //soma += num;
            cont++; //incremento, alteração do estado/valor da variável
            //++ -- | cont = cont + 1 => ++
        }

        System.out.println("Soma = " + soma);

    }
}
