public class CalculadorPropPrecio implements Calculador {
    private double propPrecio;

    public CalculadorPropPrecio(double propPrecio) {
        this.propPrecio = propPrecio;
    }

    public boolean cumple(ContingenteEspecial c, ElementoUnidad e) {
        return c.getDeuda() <= c.getPrecio()*propPrecio;
    }
}
