import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n, de, ate, tab;
        System.out.println("Qual tabuada deseja ver? ");
        n = leitor.nextInt();
        System.out.println("Començando de? ");
        de = leitor.nextInt();
        System.out.println("Até: ");
        ate = leitor.nextInt();

        for(int i = de; i <= ate; i++){
            tab = n * i;
            System.out.println(n + " * " + i + " = " + tab);
        }

        System.out.println("números pares entre 0 e 10");
        for(int i = 10; i >= 1 ;i--){
            System.out.println(i);
        }
    }
}
