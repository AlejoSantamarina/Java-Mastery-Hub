import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FondoInversion extends InversionSimple {
    private ArrayList<InversionSimple> inversiones;
    private double gastosAdministracion;
    private ComparadorCompuesto comparador;

    public FondoInversion(String nombre, double gastosAdministracion, ComparadorCompuesto comparador) {
        super(nombre);
        inversiones = new ArrayList<InversionSimple>();
        this.gastosAdministracion = gastosAdministracion;
        this.comparador = comparador;
    }

    public double getUltValOp() {
        double sumaUltValOp = 0;
        for(InversionSimple inversion : inversiones) {
            sumaUltValOp += inversion.getUltValOp();
        }
        return sumaUltValOp - sumaUltValOp*gastosAdministracion;
    }

    public ArrayList<InversionSimple> getInvFiltradas(Filtro filtro) {
        ArrayList<InversionSimple> inversiones = getInvFiltradasRec(filtro);
        Collections.sort(inversiones, comparador);
        return inversiones;
    }

    public ArrayList<InversionSimple> getInvFiltradasRec(Filtro filtro) {
        ArrayList<InversionSimple> inversionesFiltradas = new ArrayList<>();
        if(filtro.cumple(this)) {
            inversionesFiltradas.add(this);
            return inversionesFiltradas;
        }
        for(InversionSimple inv : inversiones) {
            ArrayList<InversionSimple> invFiltradas = inv.getInvFiltradas(filtro);
            inversionesFiltradas.addAll(invFiltradas);
        }
        return inversionesFiltradas;
    }
}
