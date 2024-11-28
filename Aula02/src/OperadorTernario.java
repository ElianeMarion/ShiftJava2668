public class OperadorTernario {
    public static void main(String[] args) {
        //Operador ternário
        //(condicao) ? instruçãoV : instruçãoF
        int estoque = 450;
        System.out.println((estoque < 50) ? "Estoque baixo" : "Estoque disponível");

        String mensagem = (estoque < 50) ? "Estoque baixo" : "Estoque disponível";
        System.out.println(mensagem);
    }
}
