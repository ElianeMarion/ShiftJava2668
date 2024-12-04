import java.util.Scanner;

/*
Preencha um vetor com 10 números.
b) Exiba o maior valor.
c) Some os elementos do vetor.
d) Exiba a média dos elementos inseridos.
e) Exiba o índice do primeiro positivo inserido.
f) Exiba o índice do último negativo.
* */
public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetNum = new int[10];
        int i, maiorValor = 0, soma = 0;

        //Leitura o vetor
        //for(inicialização; condição; inc/dec)
        for(i=0; i < vetNum.length; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            vetNum[i] = leitor.nextInt();
        }

        for(i=0; i < vetNum.length; i++){
            //Maior valor
            if (vetNum[i] > maiorValor){
                maiorValor = vetNum[i];
            }
            //Some os elementos do vetor.
            soma += vetNum[i];
        }
        System.out.println("O maior valor do vetor é: " + maiorValor);
        System.out.println("Soma dos elementos do vetor: " + soma);
        int media = soma/vetNum.length;
        System.out.println("Média dos elementos do vetor é: " + media );

      //  Exiba o índice do primeiro positivo inserido.

        for(i=0; i < vetNum.length; i++){
            if(vetNum[i]>0)
                System.out.println("Indice do primeiro positivo é " + i);
            break;
        }
        int indiceNegativo = -1;
        //  Exiba o índice do último negativo.
        for(i=0; i < vetNum.length; i++){
            if(vetNum[i]<0){
                indiceNegativo = i;
            }
        }
        if(indiceNegativo == -1)
            System.out.println("Não existem elementos negativos no vetor");
        else
            System.out.println("O indice do último elemento negativo do vetor é: " + indiceNegativo);

      /*  for(int num: vetNum) {
            System.out.println(num);
        }
      */

    }
}
