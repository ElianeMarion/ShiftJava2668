import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //usuario => admin senha => admin123
        String usuario, senha;
        System.out.println("Digite seu usuário: ");
        usuario = leitor.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leitor.nextLine();
        if(usuario.equalsIgnoreCase("admin") && senha.equals("Admin123")){
            System.out.println("Bem vindo ao sistema! Você possui permissão total de uso.");
        }else{
            System.out.println("Usuário ou senha incorreta.");
        }
    }
}
