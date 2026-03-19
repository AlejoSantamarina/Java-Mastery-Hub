public class CalculadorFijo implements Calculador {
    private double valorAlquiler;

    public CalculadorFijo(int valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public double calcular(Elemento elemento) {
        return valorAlquiler;
    }
}
