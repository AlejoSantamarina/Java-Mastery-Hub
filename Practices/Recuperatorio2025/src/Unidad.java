import java.util.ArrayList;

public class Unidad extends ElementoProyecto {
    private String responsable;
    private ArrayList<ElementoProyecto> elementos;
    private double extra;
    private static final double EXTRA_MAXIMO = 0.75;

    public Unidad(String nombre, String responsable, double extra) {
        super(nombre);
        this.responsable = responsable;
        elementos = new ArrayList<>();
        this.extra = extra;
    }

    public void agregarElemento(ElementoProyecto elemento) {
        elementos.add(elemento);
    }

    public int getEstimacionHoras() {
        int horas = 0;
        for(ElementoProyecto elemento : elementos) {
            horas += elemento.getEstimacionHoras();
        }
        return horas;
    }

    public double getCostoPorHora() {
        double costoPorHora = 0;
        for(ElementoProyecto elemento : elementos) {
            costoPorHora += elemento.getCostoPorHora();
        }
        double extraActual = extra * contarTareas();
        if(extraActual > EXTRA_MAXIMO) {
            return costoPorHora + costoPorHora*EXTRA_MAXIMO;
        }
        return costoPorHora + costoPorHora*extraActual;
    }

    public int contarTareas() {
        int tareas = 0;
        for(ElementoProyecto elemento : elementos) {
            tareas += elemento.contarTareas();
        }
        return tareas;
    }

    public ElementoProyecto getCopiaFiltrada(Condicion condicion) {
        Unidad unidadCopia = new Unidad(getNombre(), responsable, extra);
        for(ElementoProyecto elemento : elementos) {
            ElementoProyecto elementoCopia = elemento.getCopiaFiltrada(condicion);
            if(elementoCopia != null) {
                unidadCopia.agregarElemento(elementoCopia);
            }
        }
        if(unidadCopia.elementos.isEmpty()) {
            return null;
        }
        return unidadCopia;
    }
}
