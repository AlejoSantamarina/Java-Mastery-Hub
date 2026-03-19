import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComboArmado extends Elemento {
    private ArrayList<Elemento> elementosCombo;

    public ComboArmado(int id, String descripcion) {
        super(id, descripcion);
    }

    public double getValor() {
        double valor = 0;
        for (Elemento elemento : elementosCombo) {
            valor += elemento.getValor();
        }
        return valor;
    }

    public LocalDate getFechaDeCompra() {
        if(elementosCombo.isEmpty()) {
            return null;
        }
        LocalDate fechaDeCompra = elementosCombo.get(0).getFechaDeCompra();
        for(Elemento elemento : elementosCombo) {
            if(fechaDeCompra.isBefore(elemento.getFechaDeCompra())) {
                fechaDeCompra = elemento.getFechaDeCompra();
            }
        }
        return fechaDeCompra;
    }

    public ArrayList<Elemento> getElementosFiltrados(Filtro filtro) {
        ArrayList<Elemento> elementosFiltrados = new ArrayList<>();
        for (Elemento elemento : elementosCombo) {
            elementosFiltrados.addAll(elemento.getElementosFiltrados(filtro));
        }
        ComparadorElementos comparador = new ComparadorElementos();
        Collections.sort(elementosFiltrados, comparador);
        return elementosFiltrados;
    }

    public double getValorAlquiler(Calculador calculador) {
        double valorAlquiler = 0;
        for(Elemento elemento : elementosCombo) {
            valorAlquiler+= elemento.getValorAlquiler(calculador);
        }
        return valorAlquiler;
    }
}
