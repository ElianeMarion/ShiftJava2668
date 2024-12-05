import java.util.Scanner;

public class ExercicioFuncoes {
/*EXERCÍCIOS:
1. Fazer uma Função que retorne o primeiro elemento do vetor
2. Fazer um procedimento que exiba somente os numeros negativos contidos no vetor
3. Fazer uma função que retorne a soma dos elementos do vetor
4. Fazer uma função que retorne a media dos elementos do vetor
5. Fazer um procedimento que exiba na tela os numeros ímpares contidos no vetor
6. fazer um procedimento que exiba na tela o primeiro e o ultimo elemento do vetor
7. Fazer um procedimento que exiba os elementos cujos índices sejam pares
8. Fazer uma função que retorne True caso um valor passado por parâmetro exista no vetor, senão False
9. Fazer uma função que ordene os elementos do vetor.*/

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[] vetNum = new double[10];
        for (int i = 0; i < vetNum.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            vetNum[i] = leitor.nextInt();
        }
        System.out.println("O primeiro elemento do vetor é: " + primeiroElemento(vetNum));
        exibirNegativos(vetNum);
        System.out.println("A soma dos elementos do vetor é: " + somaElementosVetor(vetNum));
        System.out.println("A média dos elementos do vetor é: " + mediaVetor(vetNum));
        exibirNumerosImpares(vetNum);
        exibirPrimeiroUltimoElemento(vetNum);
        exibirElementosIndicePar(vetNum);
        System.out.println("\nDigite um valor que deseja buscar no vetor: ");
        double num = leitor.nextDouble();
        if(existeNoVetor(vetNum, num)){
            System.out.println("O valor " + num + " existe no vetor.");
        }else{
            System.out.println("O valor não " + num + " existe no vetor.");
        }
        System.out.println("Ordenação do vetor");
        vetNum = ordenaVetor(vetNum);
        for (int i = 0; i < vetNum.length; i++) {
            System.out.print(vetNum[i] + " ");
        }

    }

    //1. Fazer uma Função que retorne o primeiro elemento do vetor
    public static double primeiroElemento(double[] vetor) {
        return vetor[0];
    }

    //2. Fazer um procedimento que exiba somente os numeros negativos contidos no vetor
    //Procedimento =  void = função sem retorno
    public static void exibirNegativos(double[] vet) {
        System.out.println("Números negativos contido no vetor: \n");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                System.out.print(vet[i] + " - ");
            }
        }
    }

    //3. Fazer uma função que retorne a soma dos elementos do vetor
    public static double somaElementosVetor(double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    //4. Fazer uma função que retorne a media dos elementos do vetor
    public static double mediaVetor(double[] vetor) {
        //media = soma / qtdElementos;
        return somaElementosVetor(vetor) / vetor.length;
    }

    //5. Fazer um procedimento que exiba na tela os numeros ímpares contidos no vetor
    public static void exibirNumerosImpares(double[] vetor) {
        System.out.println("Números ímpares contidos no vetor\n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {//Resto da divisão inteira
                System.out.print(vetor[i] + " - ");
            }
        }
    }

    //6. fazer um procedimento que exiba na tela o primeiro e o ultimo elemento do vetor
    public static void exibirPrimeiroUltimoElemento(double[] vetor) {
        System.out.println("O primeiro elemento do vetor é: " + primeiroElemento(vetor));
        //System.out.println("O primeiro elemento do vetor é " + vetor[0]);
        System.out.println("O último elemento do vetor é: " + vetor[vetor.length - 1]);
    }

    //7. Fazer um procedimento que exiba os elementos cujos índices sejam pares
    public static void exibirElementosIndicePar(double[] vetor) {
        System.out.println("Elementos cujo indice sejam pares\n");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                System.out.print(vetor[i] + " - ");
            }
        }
    }

    public static void exibirElementosIndiceParSemIf(double[] vetor) {
        System.out.println("Elementos cujo indice sejam pares\n");
        for (int i = 0; i < vetor.length; i += 2) { //i = i + 2
            System.out.print(vetor[i] + " - ");
        }
    }
    //elemento => vetor[i]
    //indice => i

    //8. Fazer uma função que retorne True caso um valor passado por parâmetro exista no vetor, senão False
    public static boolean existeNoVetor(double[] vetor, double valor) {
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor)
                return true;
        }
        return false;
    }

    //9. Fazer uma função que ordene os elementos do vetor.*/
    public static double[] ordenaVetor(double[] vetor){
        double auxiliar;
        for (int i = 0; i < vetor.length; i++){
            for(int j = i+1; j < vetor.length ; j++){
                if(vetor[i] > vetor[j]){
                    auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
        return vetor;
    }

}
