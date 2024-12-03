import java.util.ArrayList;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //while(condição){ bloco de instrução }
        //Programa que some 5 números
        int num, soma = 0;
        int[] numeros = new int[5];
        int[] quantidades = {10,12,15,18,20,24};

        numeros[0] = 10;
        System.out.println(numeros[0]);

        numeros[1] = numeros[0] * 5;
        System.out.println(numeros[1]);
        /* 1º inicialização => cont = 1
           2º teste => 1 <= 5 => V entra no laço
           na hora que volta para o for
           3º passo => incremento
           2º testa=> v entra
        **/
        //leitura de um vetor
        for(int cont = 0; cont <= 4; cont++) {
            System.out.println("Digite um número: ");
            numeros[cont] = leitor.nextInt();
           // soma = soma + num; //soma += num;
            //cont++; //incremento, alteração do estado/valor da variável
            //++ -- | cont = cont + 1 => ++
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        for(int cont = 0; cont <= 4; cont++) {
            System.out.println("Digite um número: ");
            numeros[cont] = leitor.nextInt();
             soma = soma + numeros[cont]; //soma += num;
            //cont++; //incremento, alteração do estado/valor da variável
            //++ -- | cont = cont + 1 => ++
        }
        System.out.println("Soma = " + soma);
        System.out.println("Quantidades");
        for(int i = 0; i < quantidades.length; i++){
            System.out.println(quantidades[i]);
        }




    }
}
