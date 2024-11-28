import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int placa;
        Scanner leitor = new Scanner(System.in);
        placa = leitor.nextInt();
        switch (placa%10){
            case 1:
            case 2:
                System.out.println("Rodizio de segunda");
                break;
            case 3:
            case 4: System.out.println("Rodizio de terça");
                break;
        }


    }
}
