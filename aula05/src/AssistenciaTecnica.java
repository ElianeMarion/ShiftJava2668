import java.util.Scanner;

public class AssistenciaTecnica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        String nome="", usuario="", senha="", nomeCliente, telefone, email, usuarioLogin, senhaLogin;
        int opcao;
        do{
            System.out.println("FIAP Techinical Support" +
                    "\n===================================" +
                    "\n1 - Cadastrar funcionário" +
                    "\n2 - Logar" +
                    "\n3 - Cadastrar cliente" +
                    "\n4 - Sair");
            opcao = leitorNum.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do funcionário: ");
                    nome = leitor.nextLine();
                    System.out.println("Usuario: ");
                    usuario = leitor.nextLine();
                    System.out.println("Senha: ");
                    senha = leitor.nextLine();
                    break;
                case 2:
                    System.out.println("Usuario: ");
                    usuarioLogin = leitor.nextLine();
                    System.out.println("Senha: ");
                    senhaLogin = leitor.nextLine();
                    if(usuario.equalsIgnoreCase(usuarioLogin) && (senha.equals(senhaLogin))){
                        System.out.println("Bem vindo, " + nome);
                    }
                    break;
                case 3:
                    System.out.println("Em manutenção");
                    break;
                case 4:
                    System.out.println("Obrigada por utilizar o nosso sistema!");
                    break;

            }
        }while (opcao != 4);
    }
}
