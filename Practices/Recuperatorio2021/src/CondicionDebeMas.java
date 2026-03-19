public class CondicionDebeMas implements Condicion {
    private double deudaMaxima;

    public CondicionDebeMas(double deudaMaxima) {
        this.deudaMaxima = deudaMaxima;
    }

    public boolean cumple(ElementoUnidad elemento) {
        return (elemento.getDeuda() > deudaMaxima);
    }
}
