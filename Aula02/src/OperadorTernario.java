public class OperadorTernario {
    public static void main(String[] args) {
        //Operador tern�rio
        //(condicao) ? instru��oV : instru��oF
        int estoque = 450;
        System.out.println((estoque < 50) ? "Estoque baixo" : "Estoque dispon�vel");

        String mensagem = (estoque < 50) ? "Estoque baixo" : "Estoque dispon�vel";
        System.out.println(mensagem);
    }
}
