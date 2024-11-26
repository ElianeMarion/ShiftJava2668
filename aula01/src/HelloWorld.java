import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //Entrada - Saída - Processamento
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        //Saída
        System.out.println("Hello World");

        /*Variável de memória -> É um espaço na memória RAM para armazenar
         uma informação */
        //tipo_dado nomeVariavel;
        int idade; //variável que vai armazenar um número inteiro e chama idade
        String nome, nomeDoAluno, nomeMae;
        double altura; //números reais
        char letra; //armazena 1 caractere

        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine(); //Leitura de uma String no terminal
        System.out.println("Boa noite " + nome + "! bem vindo(a) ao Shift Java");

        System.out.println("Digite o nome da sua mãe: ");
        nomeMae = leitor.next();
        System.out.println(nome + " sua mãe chama " + nomeMae);

        System.out.println("Digite sua idade");
        idade = leitorNumerico.nextInt();
        System.out.println(nome + " você tem " + idade + " anos de idade.");
    }

}
