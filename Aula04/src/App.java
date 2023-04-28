public class App {
    public static void main(String[] args) {

        //Triângulo X
        int xa = 5;
        int xb = 7;
        int xc = 10;

        //Triângulo Y
        int ya = 5;
        int yb = 9;
        int yc = 12;

        // Cálculo do Perímetro
        double px = (xa + xb + xc) / 2;
        double py = (ya + yb + yc) / 2;

        //Verificar o valor calculado
        System.out.println("pX = " + px);
        System.out.println("pY = " + py);

        // Calculo da area dos triangulos
        double areaX = Math.sqrt (px * (px-xa) * (px-xb) * (px-xc));
        double areaY = Math.sqrt (py * (py-ya) * (py-yb) * (py-yc));

        System.out.println("Área de X = " + areaX);
        System.out.println("Área de Y = " + areaY);

    }
}
