package entidades;

public class Circulo extends Forma{

    //Atributo
    private double raio;

    //Metodo construtor
    public Circulo(Cores cor,double raio){
        super(cor);
        this.raio = raio;
    }

    //Metodo Get and Setter
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * this.raio * this.raio;
    }
}
