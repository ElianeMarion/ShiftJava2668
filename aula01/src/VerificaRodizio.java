import java.util.Scanner;

public class VerificaRodizio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, digite os digitos da placa: ");
        int placa = leitor.nextInt();

        //7845 % 10 => Resto da divisão
        int digito = placa % 10;

        String placa2 = "1234";
        char teste = placa2.charAt(3);//placa2.charAt(placa2.length() - 1)
        System.out.println("Digito: " + teste);

        switch (digito){
            case 1:
                System.out.println("Não pode rodar na segunda");
                return;
            case 2:
                System.out.println("Não pode rodar na segunda");
                break;
            case 3:
            case 4: System.out.println("Não pode rodar na terça");
                break;
            case 5:
            case 6: System.out.println("Não pode rodar na quarta");
                break;
            case 7:
            case 8: System.out.println("Não pode rodar na quinta");
                break;
            case 9:
            case 0:
                System.out.println("Não pode rodar na sexta");
                break;
        }
        leitor.close();
    }
}
