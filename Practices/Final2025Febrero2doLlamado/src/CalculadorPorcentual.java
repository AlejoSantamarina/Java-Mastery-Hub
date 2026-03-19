public class CalculadorPorcentual implements Calculador {
    private double porcentaje;

    public CalculadorPorcentual(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcular(Elemento elemento) {
        return porcentaje * elemento.getValor();
    }
}
