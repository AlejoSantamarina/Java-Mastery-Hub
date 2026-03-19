import java.util.ArrayList;

public abstract class InversionSimple {
    private String nombre;
    private ArrayList<Double> valoresDeCierre;
    private CalculadorRentabilidad calculadorRentabilidad;

    public InversionSimple(String nombre, CalculadorRentabilidad calculadorRentabilidad) {
        this.nombre = nombre;
        valoresDeCierre = new ArrayList<>();
        this.calculadorRentabilidad = calculadorRentabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Double> getValoresDeCierre() {
        return valoresDeCierre;
    }

    public double getVariacion() {
        double a = getUltValOp();
        double b = getUltValCierre();
        return (a-b)/b;
    }

    public void cerrarDia() {
        valoresDeCierre.add(0, getUltValOp());
    }

    public double getUltValCierre() {
        return valoresDeCierre.get(0);
    }

    public double getPrimerValCierre() {
        int size = valoresDeCierre.size();
        return valoresDeCierre.get(size - 1);
    }

    public boolean valoresDeCierreEnAumento() {
        int size = valoresDeCierre.size();
        for(int i = size-1; i >= 0; i--) {
            if(valoresDeCierre.get(i) > valoresDeCierre.get(size - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean esRentable() {
        return calculadorRentabilidad.rentable(this);
    }

    public abstract double getUltValOp();
    public abstract ArrayList<InversionSimple> getInvFiltradas(Filtro filtro);
}
