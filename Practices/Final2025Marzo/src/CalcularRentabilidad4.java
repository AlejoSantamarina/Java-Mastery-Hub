public class CalcularRentabilidad4 implements CalculadorRentabilidad {
    private int indice1;
    private int indice2;
    private double variacion;

    public CalcularRentabilidad4(int indice1, int indice2, double variacion) {
        this.indice1 = indice1;
        this.indice2 = indice2;
        this.variacion = variacion;
    }

    public boolean rentable(InversionSimple inversionSimple) {
        double a = inversionSimple.getValoresDeCierre().get(indice1);
        double b = inversionSimple.getValoresDeCierre().get(indice2);
        double variacionCalculada = (a-b)/b;
        return variacionCalculada > variacion;
    }
}
