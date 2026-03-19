import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ElementoAlquiler extends Elemento {
    private double valor;
    private LocalDate fechaDeCompra;

    public ElementoAlquiler(int id, String descripcion, double valor, LocalDate fechaDeCompra) {
        super(id, descripcion);
        this.valor = valor;
        this.fechaDeCompra = fechaDeCompra;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public ArrayList<Elemento> getElementosFiltrados(Filtro filtro) {
        ArrayList<Elemento> elementosFiltrados = new ArrayList<>();
        if(filtro.cumple(this)) {
            elementosFiltrados.add(this);
        }
        ComparadorElementos comparador = new ComparadorElementos();
        Collections.sort(elementosFiltrados, comparador);
        return elementosFiltrados;
    }

    public double getValorAlquiler(Calculador calculador) {
        return calculador.calcular(this);
    }
}
