package app;

import entidadeSete.ContaLogin;

public class QuestaoSete {
    public static void main(String[] args) {

        ContaLogin cl = new ContaLogin("mrafael","@#123");

        System.out.println("Login: " + cl.getLogin());
        System.out.println("Senha: " + cl.getSenha());
        System.out.println("Nome: " + cl.getNome());

        cl.setNome("Messias Batista");
        System.out.println("----- Novo Nome ----");

        cl.autenticarLogin(cl);

        ContaLogin cl2 = new ContaLogin("rafab","123456");
        cl.autenticarLogin(cl2);

    }
}
