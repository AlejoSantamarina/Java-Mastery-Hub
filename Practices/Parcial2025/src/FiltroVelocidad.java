public class FiltroVelocidad implements Filtro {
    private double velocidad;

    public FiltroVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean cumple(Poni poni) {
        if(poni.getVelocidad() == velocidad) {
            return true;
        }
        return false;
    }
}
