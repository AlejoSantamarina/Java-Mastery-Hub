import java.time.LocalDate;

public class FondosYBonos extends Accion {
    private Entidad entidadEmisora;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;

    public FondosYBonos(String nombre, String simbolo, double ultValOp, ComparadorCompuesto comparador) {
        super(nombre, simbolo, ultValOp, comparador);
    }

    public void setUltValOp(double ultValOp) {
        if(LocalDate.now().isAfter(fechaEmision) && LocalDate.now().isBefore(fechaVencimiento)) {
            super.setUltValOp(ultValOp);
        }
    }

    public void cerrarDia() {
        if(LocalDate.now().isAfter(fechaEmision) && LocalDate.now().isBefore(fechaVencimiento)) {
            super.cerrarDia();
        }
    }
}
