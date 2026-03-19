public class CalcularRentabilidad3 implements CalculadorRentabilidad {

    public boolean rentable(InversionSimple inversionSimple) {
        return inversionSimple.valoresDeCierreEnAumento();
    }
}
