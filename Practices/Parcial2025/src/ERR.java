public class ERR extends PatrullasYEquipos {

    public ERR(String nombre) {
        super(nombre);
    }

    public int getPoderMagico() {
        int poderMagico = 0;
        for(ElementoPoni e : miembros) {
            poderMagico += e.getPoderMagico();
        }
        return poderMagico;

    }

    public double getVelocidad() {
        double max = 0;
        for(ElementoPoni e : miembros) {
            double velocidad = e.getVelocidad();
            if(velocidad > max) {
                max = velocidad;
            }
        }
        return max;

    }
}
