import java.util.ArrayList;

public abstract class ManadasYAlianzas extends ElementoAnimal {
    protected ArrayList<ElementoAnimal> listaElementos;

    public ManadasYAlianzas(String nombre) {
        super(nombre);
    }

    public abstract int getEnergia();
    public abstract double getAgilidad();

    public ArrayList<String> getHabilidades() {
        ArrayList<String> listaHabilidades = new ArrayList<>();
        for(ElementoAnimal elementoAnimal : listaElementos) {
            ArrayList<String> listaAux = elementoAnimal.getHabilidades();
            for(String aux : listaAux) {
                if(!listaHabilidades.contains(aux)) {
                    listaHabilidades.add(aux);
                }
            }
        }
        return listaHabilidades;
    }
}
