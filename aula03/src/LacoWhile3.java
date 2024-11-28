import java.util.Scanner;

public class LacoWhile3 {
    public static void main(String[] args) {
        String cont = "s";
        Scanner leitor = new Scanner(System.in);
        //while(condição){ bloco de instrução }
        //Programa que some 5 números
        int num, soma = 0;
        while (cont.equalsIgnoreCase("S") || cont.equalsIgnoreCase("Sim")) { //variável controladora
            System.out.println("Digite um número: ");
            num = leitor.nextInt();
            soma = soma + num; //soma += num;
            System.out.println("Deseja somar mais números? s/n? ");
            cont = leitor.next();
        }
        System.out.println("Soma = " + soma);
    }
}
