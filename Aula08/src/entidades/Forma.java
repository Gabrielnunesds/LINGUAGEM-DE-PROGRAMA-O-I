package entidades;

public class Forma {

    // Atributo baseado no tipo Enum Cores
    private Cores cor;

    // Metodo construtor
    public Forma(Cores cor){
        this.cor = cor;
    }

    // Metodo Get
    public Cores getCor() {
        return cor;
    }
    // Metodo Set
    public void setCor(Cores cor) {
        this.cor = cor;
    }

    //Metodo calcular area
    public double calcularArea(){
        return 0.0;
    }
}
