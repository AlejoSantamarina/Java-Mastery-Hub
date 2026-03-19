public class CalculadorFijo implements Calculador {
    private double fixedSpeed;

    public CalculadorFijo(double fixedSpeed) {
        this.fixedSpeed = fixedSpeed;
    }

    public double calculate(PoniCamaleon poni) {
        return fixedSpeed;
    }
}
