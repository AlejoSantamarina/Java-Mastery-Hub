public class CalcularRentabilidad2 implements CalculadorRentabilidad {
    private double variacionMin;

    public CalcularRentabilidad2(double variacionMin) {
        this.variacionMin = variacionMin;
    }

    public boolean rentable(InversionSimple inversionSimple) {
        double a = inversionSimple.getPrimerValCierre();
        double b = inversionSimple.getUltValCierre();
        double variacion = (a-b)/b;
        if(variacion > variacionMin) {
            return true;
        }
        return false;
    }
}
