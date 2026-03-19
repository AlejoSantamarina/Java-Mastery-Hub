import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FiltroAntiguedad implements Filtro {
    private int mesesAntiguedad;

    public FiltroAntiguedad(int mesesAntiguedad) {
        this.mesesAntiguedad = mesesAntiguedad;
    }

    public boolean cumple(Elemento elemento) {
        double mesesTranscurridos = ChronoUnit.MONTHS.between(elemento.getFechaDeCompra(), LocalDate.now());
        if(mesesTranscurridos > mesesAntiguedad) {
            return true;
        }
        return false;
    }
}
