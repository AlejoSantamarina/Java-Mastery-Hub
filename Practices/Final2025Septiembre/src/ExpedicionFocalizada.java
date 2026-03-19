public class ExpedicionFocalizada extends ExpedicionOPaquete {

    public ExpedicionFocalizada(String nombre, String bioma, double descuento) {
        super(nombre, bioma, descuento);
    }

    public void addDestino(Destino destino) {
        if(destino.getBioma() == this.getBioma()) {
            this.destinos.add(destino);
        }
    }
}
