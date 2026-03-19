public class PoniCamaleon extends Poni {
    private Calculador calculador;

    public PoniCamaleon(String nombre, int poderMagico, double velocidad) {
        super(nombre, poderMagico, velocidad);
    }

    public void setCalculador(Calculador sc) {
        this.calculador = sc;
    }

    public double getVelocidad() {
        return calculador.calculate(this);
    }
}
