package entidades;

public class Triangulo extends Forma{

    private double lado1, lado2, lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(Cores cor, double lado1, double lado2, double lado3){
        super(cor):
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea(){
        double p = this.lado1 + this.lado2 + this.lado3 / 2;
        return Math.sqrt(p * (p - this.lado1) * (p - this.lado2) *(p - this.lado3));
    }
}
