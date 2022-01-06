package exceptions;

import core.Conexao;

public class TesteConexao {

    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.lerDados();
        } catch (IllegalStateException ies) {
            System.out.println("Deu erro na conexão");
        }


        /*Conexao conexao = new Conexao();

        try {
            conexao.lerDados();
        } catch (IllegalStateException ise) {
            System.out.println("Deu erro na conexão");
        } finally {
            conexao.fechar();
        }*/
    }

}
