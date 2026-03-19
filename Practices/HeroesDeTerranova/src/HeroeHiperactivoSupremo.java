public class HeroeHiperactivoSupremo extends Heroe {
    private int multiplicador;

    public HeroeHiperactivoSupremo(String nombre, int poder, double velocidad, int multiplicador) {
        super(nombre, poder, velocidad);
        this.multiplicador = multiplicador;
    }

    public int getPoder() {
        return super.getPoder() * multiplicador;
    }

    public double getVelocidad() {
        return super.getVelocidad() * multiplicador;
    }
}
