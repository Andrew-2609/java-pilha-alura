package core;

import exceptions.MinhaExcecao;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (MinhaExcecao rex) {
            System.out.println(rex.getMessage());
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        throw new MinhaExcecao(">> Deu errado aqui <<");

        //System.out.println("Fim do metodo2");
    }

}
