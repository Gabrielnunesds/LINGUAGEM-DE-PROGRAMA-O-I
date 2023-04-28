package app;
import entities.Triangulo;

public class Main {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(8.0, 10.0, 15.0);
        Triangulo t2 = new Triangulo(8.0, 10.0, 14.5);

        double areaT1 = t1.calcularArea();
        double areaT2  = t2.calcularArea();

        System.out.println("A area em T1 é: " + areaT1);
        System.out.println("A area em T2 é: " + areaT2);
//        t1.a = 8.0;
//        t1.b = 10.0;
//        t1.c = 15.0;

//        double p = (t1.a + t1.b + t1.c) / 2;
//        double area = Math.sqrt (p * (p-t1.a) * (p-t1.b) * (p-t1.c));

//        System.out.println("A area em T1 é: " + area);

    }
}
