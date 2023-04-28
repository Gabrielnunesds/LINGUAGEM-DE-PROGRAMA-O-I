package entidades;

public class Quadrado  extends Forma{

    // Atributos do Quadrado
    private double altura, largura;

    // Metodo construtor
    public Quadrado(Cores cor, double altura, double largura){
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
// Metodo CalcularArea()
    public double calcularArea(){
              return this.altura * this.largura;
    }

}
