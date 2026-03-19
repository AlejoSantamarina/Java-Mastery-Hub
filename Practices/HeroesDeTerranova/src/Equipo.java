import java.util.ArrayList;

public abstract class Equipo extends ElementoDefensa {
    protected ArrayList<ElementoDefensa> listaMiembros;

    public Equipo(String nombre) {
        super(nombre);
    }

    public abstract int getPoder();
    public abstract double getVelocidad();

    public void agregarMiembro(ElementoDefensa elemento) {
        listaMiembros.add(elemento);
    }

    public ArrayList<String> getListaHabilidades() {
        ArrayList<String> listaHabilidades = new ArrayList<>();
        for(ElementoDefensa e : listaMiembros) {
            ArrayList<String> habilidades = e.getListaHabilidades();
            for(String h : habilidades) {
                if(!listaHabilidades.contains(h)) {
                    listaHabilidades.add(h);
                }
            }
        }
        return listaHabilidades;
    }
}
