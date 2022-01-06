package core;

public class Conexao {

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void lerDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    public void fechar() {
        System.out.println("Fechando conexao");
    }

}
