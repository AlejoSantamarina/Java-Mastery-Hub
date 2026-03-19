import java.util.ArrayList;
import java.util.Collections;

public class Accion extends InversionSimple {
    private String simbolo;
    private double ultValOp;

    public Accion(String nombre, String simbolo, double ultValOp) {
        super(nombre);
        this.simbolo = simbolo;
        this.ultValOp = ultValOp;
    }

    public double getUltValOp() {
        return ultValOp;
    }

    public ArrayList<InversionSimple> getInvFiltradas(Filtro filtro) {
        ArrayList<InversionSimple> inversionesFiltradas = new ArrayList<InversionSimple>();
        if(filtro.cumple(this)) {
            inversionesFiltradas.add(this);
        }
        return inversionesFiltradas;
    }

    public void setUltValOp(double ultValOp) {
        this.ultValOp = ultValOp;
    }
}
