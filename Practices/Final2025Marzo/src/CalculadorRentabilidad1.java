public class CalculadorRentabilidad1 implements CalculadorRentabilidad {
    private double variacionMin;

    public CalculadorRentabilidad1(double variacion) {
        this.variacionMin = variacion;
    }

    public boolean rentable(InversionSimple inversionSimple) {
        double a = inversionSimple.getUltValOp();
        double b = inversionSimple.getUltValCierre();
        double variacion = (a-b)/b;
        if(variacion > variacionMin) {
            return true;
        }
        return false;
    }
}
