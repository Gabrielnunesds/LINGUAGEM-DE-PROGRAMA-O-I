public class Testadora {

    public static void main(String[] args) {

        ContaLogin cl1 = new ContaLogin();
        ContaLogin cl2 = new ContaLogin();

        cl1.setNome("Messias");
        cl1.setEmail("messias.batista@iesp.edu.br");

        cl2.setNome("Messi");
        cl2.setEmail("prof2118@iesp.edu.br");

        System.out.println("O Nome de Cl1 " + cl1.getNome());
        System.out.println("O Nome de Cl2 " + cl2.getNome());

    }
}
