public class CalculadorSuma implements Calculador {
    private Calculador calc1, calc2;

    public double calculate(PoniCamaleon poni) {
        return calc1.calculate(poni) + calc2.calculate(poni);
    }
}
