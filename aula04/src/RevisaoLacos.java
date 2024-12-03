import java.util.Scanner;

/*	Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade,
 sexo (M/F) e salário. Faça um programa que informe:
a) a média de salário do grupo;
b) maior e menor idade do grupo;
c) quantidade de mulheres com salário até R$10000,00.
* */
public class RevisaoLacos {
    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);

        String sexo, cont;
        int idade, menorIdade = 1000, maiorIdade = 0, quantidadeMulheres = 0, qtdEntrevistados = 0;
        double salario, mediaSalario = 0, somaSalario = 0;

        do {
            System.out.println("Pesquisa\n" +
                    "Por favor informe sua idade: ");
            idade = leitor.nextInt();
            /*
            if(qtdEntrevistados == 0){
                maiorIdade = idade;
                menorIdade = idade;
            }*/
            if(idade > maiorIdade)
                maiorIdade = idade;

            if(idade < menorIdade)
                menorIdade = idade;

            System.out.println("Agora informe seu salário: R$ ");
            salario = leitor.nextDouble();
            System.out.println("Por favor digite F - caso o entrevistado for do sexo feminino\n" +
                    "ou M - caso entrevistado for do sexo masculino: ");
            sexo = leitorTexto.nextLine();

            somaSalario += salario; //somaSalario = somaSalario + salario;
            if(salario > 10000 && sexo.equalsIgnoreCase("F")){
                quantidadeMulheres++;
            }

            qtdEntrevistados++;
            System.out.println("Deseja entrevistar outra pessoa? S/N");
            cont = leitorTexto.nextLine();
        }while (cont.equalsIgnoreCase("S"));

        mediaSalario = somaSalario / qtdEntrevistados;
        System.out.println("Média salarial do grupo entrevistado é: R$ " + mediaSalario);
        System.out.println("Neste grupo de entrevistados tivemos como maior idade " + maiorIdade +
        "\n e " + menorIdade + " menor idade do grupo.");
        System.out.println("A quantidade de mulheres deste grupo que ganham acima de R$ 10000.00 é" + quantidadeMulheres);
    }
}
