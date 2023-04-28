package entidadeSete;

public class ContaLogin {

    // Atributos da Classe sempre privados
    private String nome;
    private String login;
    private String senha;

    //Metodos construtores
    public ContaLogin(String login, String senha) {
        this.senha = senha;
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void autenticarLogin(ContaLogin contaLogin){
        if (contaLogin.getSenha() == this.senha && contaLogin.getLogin() == this.login){
            System.out.println("Usuário autenticado - " + this.getLogin());
            System.out.println("Bem vindo, " + this.nome);
        } else{
            System.out.println("Usuário ou senha inválidos!");
        }
    }

}
