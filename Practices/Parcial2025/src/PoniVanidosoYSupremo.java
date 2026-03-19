public class PoniVanidosoYSupremo extends Poni {
    private int multiplicador;

    public PoniVanidosoYSupremo(String nombre, int poderMagico, double velocidad) {
        super(nombre, poderMagico, velocidad);
    }

    public int getPoderMagico() {
        return super.getPoderMagico() * multiplicador;
    }

    public double getVelocidad() {
        return super.getVelocidad() * multiplicador;
    }
}
