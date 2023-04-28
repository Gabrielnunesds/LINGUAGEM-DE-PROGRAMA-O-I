package entities;

public class Triangulo {

    private  double a;
    private  double b;
    private  double c;

    public Triangulo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double calcularP(){
        return (this.a + this.b + this.c) / 2;
    }

    public double calcularArea(){
        double p = calcularP();
        return Math.sqrt (p * (p - this.a) * (p - this.b) * (p - this.c));
    }

}
