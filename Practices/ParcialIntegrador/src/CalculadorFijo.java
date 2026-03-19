public class CalculadorFijo implements Calculador {
    private double precisionEnCampo;

    public CalculadorFijo(double precisionEnCampo) {
        this.precisionEnCampo = precisionEnCampo;
    }

    public double calcular(Investigador i) {
        return precisionEnCampo;
    }
}
