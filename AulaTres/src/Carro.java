public class Carro {

    private String fabricante;
    private int qtdPortas;
    private double potenciaMotor;

    public Carro(String fabricante, double potenciaMotor) {
        this.fabricante = fabricante;
        this.potenciaMotor = potenciaMotor;
    }

    public void acelerarCarro(){

        System.out.println("O carro esta andando");

    }

    public void frearCarro(){
        System.out.println("O carro esta parando");
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

}
