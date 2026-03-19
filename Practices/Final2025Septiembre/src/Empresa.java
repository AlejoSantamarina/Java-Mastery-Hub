import java.util.ArrayList;

public class Empresa {
    private ArrayList<Cliente> clientes;
    private ArrayList<ElemViaje> elementosViajes;

    public Empresa() {
        clientes = new ArrayList<>();
        elementosViajes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Cliente> getClientesInteresados(Destino destino) {
        ArrayList<Cliente> clientesInteresados = new ArrayList<>();
        for(Cliente cliente : clientes) {
            if(cliente.getFiltro() != null) {
                if(cliente.estaInteresado(destino) && cliente.getFiltro().cumple(destino)) {
                    clientesInteresados.add(cliente);
                }
            } else {
                if(cliente.estaInteresado(destino)) {
                    clientesInteresados.add(cliente);
                }
            }
        }
        return clientesInteresados;
    }

    public ArrayList<ElemViaje> getElementosViajes() {
        return elementosViajes;
    }

    public ArrayList<Destino> getDestinosFiltrados(Filtro filtro) {
        ArrayList<Destino> destinosFiltrados = new ArrayList<>();
        for(ElemViaje elemViaje : elementosViajes) {
            destinosFiltrados.addAll(elemViaje.getDestinosFiltrados(filtro));
        }
        return destinosFiltrados;
    }
}
