public class CIM extends PatrullasYEquipos {
    private int indice;

    public CIM(String nombre) {
        super(nombre);
    }

    public int getPoderMagico() {
        int max = 0;
        for(ElementoPoni e : miembros) {
            int poderMagico = e.getPoderMagico();
            if(poderMagico > max) {
                max = poderMagico;
            }
        }
        return max;
    }

    public double getVelocidad() {
        if(indice >= miembros.size()) {
            return 0;
        }
        return miembros.get(indice).getVelocidad();
    }
}
