public class DestinoPorDificultad extends ElemViaje {
    private int creditosEsfuerzo;
    private int costoPorCredito;

    public DestinoPorDificultad(String nombre, String bioma, int creditosEsfuerzo, int costoPorCredito) {
        super(nombre, bioma);
        this.creditosEsfuerzo = creditosEsfuerzo;
        this.costoPorCredito = costoPorCredito;
    }

    public double getCostoBase() {
        return creditosEsfuerzo*costoPorCredito;
    }

    public int getDificultad() {
        return creditosEsfuerzo;
    }
}
