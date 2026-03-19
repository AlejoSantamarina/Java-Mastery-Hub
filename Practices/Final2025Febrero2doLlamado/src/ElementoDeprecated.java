import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;

public class ElementoDeprecated extends Elemento {
    private int id;
    private LocalDate fechaVencimiento;
    private double descuentoPorVencimiento;
    private Elemento elementoRepresentado;

    public ElementoDeprecated(int id, LocalDate fechaVencimiento, double descuentoPorVencimiento, Elemento elementoRepresentado) {
        super(id, elementoRepresentado.getDescripcion());
        this.fechaVencimiento = fechaVencimiento;
        this.descuentoPorVencimiento = descuentoPorVencimiento;
        this.elementoRepresentado = elementoRepresentado;
    }

    public boolean estaVencido() {
        if(fechaVencimiento.isBefore(LocalDate.now())) {
            return true;
        }
        return false;
    }

    public double getValor() {
        double valor = elementoRepresentado.getValor();
        if(this.estaVencido()) {
            double mesesTranscurridos = ChronoUnit.MONTHS.between(fechaVencimiento, LocalDate.now());
            return valor - (valor*descuentoPorVencimiento*mesesTranscurridos);
        }
        return valor;
    }

    public LocalDate getFechaDeCompra() {
        return elementoRepresentado.getFechaDeCompra();
    }

    public ArrayList<Elemento> getElementosFiltrados(Filtro filtro) {
        ArrayList<Elemento> elementosFiltrados = new ArrayList<>();
        if(!this.estaVencido() && filtro.cumple(elementoRepresentado)) {
            elementosFiltrados.add(elementoRepresentado);
        }
        ComparadorElementos comparador = new ComparadorElementos();
        Collections.sort(elementosFiltrados, comparador);
        return elementosFiltrados;
    }

    public double getValorAlquiler(Calculador calculador) {
        if(estaVencido()) {
            return calculador.calcular(elementoRepresentado)/2;
        }
        return calculador.calcular(elementoRepresentado);
    }
}
