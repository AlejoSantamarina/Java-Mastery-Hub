public class CalculadorSuma implements Calculador {
    private Calculador calculador1;
    private Calculador calculador2;

    public CalculadorSuma(Calculador calculador1, Calculador calculador2) {
        this.calculador1 = calculador1;
        this.calculador2 = calculador2;
    }

    public double calcular(Investigador i) {
        return calculador1.calcular(i) + calculador2.calcular(i);
    }
}
