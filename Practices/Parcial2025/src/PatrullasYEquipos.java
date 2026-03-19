import java.util.ArrayList;

public abstract class PatrullasYEquipos extends ElementoPoni {
    protected ArrayList<ElementoPoni> miembros;

    public PatrullasYEquipos(String nombre) {
        super(nombre);
        miembros = new ArrayList<>();
    }

    public abstract int getPoderMagico();
    public abstract double getVelocidad();

    public ArrayList<String> getHabilidades() {
        ArrayList<String> habilidades = new ArrayList<>();
        for(ElementoPoni p : miembros) {
            for(String h : p.getHabilidades()) {
                if(!habilidades.contains(h)) {
                    habilidades.add(h);
                }
            }
        }
        return habilidades;
    }

    public int getCantidad(Filtro f) {
        int cantidad = 0;
        for(ElementoPoni p : miembros) {
            cantidad += p.getCantidad(f);
        }
        return cantidad;
    }
}
