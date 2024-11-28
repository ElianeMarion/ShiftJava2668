import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //while(condição){ bloco de instrução }
        //Programa que some 5 números
        int num, soma = 0;

        /* 1º inicialização => cont = 1
           2º teste => 1 <= 5 => V entra no laço
           na hora que volta para o for
           3º passo => incremento
           2º testa=> v entra
        * */
        for(int cont = 1; cont <= 5; cont++) {
            System.out.println("Digite um número: ");
            num = leitor.nextInt();
            soma = soma + num; //soma += num;
            //cont++; //incremento, alteração do estado/valor da variável
            //++ -- | cont = cont + 1 => ++
        }
        System.out.println("Soma = " + soma);
    }
}
