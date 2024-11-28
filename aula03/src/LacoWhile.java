import java.util.Scanner;

public class LacoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //while(condição){ bloco de instrução }
        //Programa que some 5 números
        int num, soma = 0;
        int cont = 1; //inicialização

        while (cont <= 10) { //variável controladora
            System.out.println("Digite um número: ");
            num = leitor.nextInt();
            soma = soma + num; //soma += num;
            cont++; //incremento, alteração do estado/valor da variável
            //++ -- | cont = cont + 1 => ++
        }
        System.out.println("Soma = " + soma);

    }

}
