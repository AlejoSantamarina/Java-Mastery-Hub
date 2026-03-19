public class FiltroVariacion implements Filtro {

    public boolean cumple(InversionSimple inversionSimple) {
        return inversionSimple.getVariacion() > 0;
    }
}
