public class HeroeVolatil extends Heroe {
    private Calculador calculador;

    public HeroeVolatil(String nombre, int poder, double velocidad) {
        super(nombre, poder, velocidad);
    }

    public double getVelocidad() {
        if(calculador != null) {
            return calculador.calcular(this);
        }
        return super.getVelocidad();
    }
}
