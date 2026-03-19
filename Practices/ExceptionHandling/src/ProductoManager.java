import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductoManager {
    private ArrayList<Producto> productos;

    public ProductoManager() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) throws IllegalArgumentException, NombreProductoInvalidoException, ProductoDuplicadoException {
        if(producto.getNombre() == null || producto.getNombre().isBlank()) {
            throw new NombreProductoInvalidoException("El nombre del producto no puede ser vacio");
        }

        if(producto.getCantidad() < 0 || producto.getPrecio() < 0) {
            throw new IllegalArgumentException("Cantidad y precio no puede ser negativo.");
        }

        if(productos.contains(producto)) {
            throw new ProductoDuplicadoException("El producto " + producto.getNombre() + " ya existe.");
        }

        productos.add(producto);
    }

    public void cargarProductosDesdeArchivo(File archivo) throws FileNotFoundException, NombreProductoInvalidoException {
        if(archivo == null) { //Podria ser tambien if(archivo == null || !archivo.exists()) throw FileNotFoundException pero seria redundante, ya que esa excepción la comprueba el scanner.
            throw new IllegalArgumentException("El archivo no puede ser null");
        }

        Scanner sc = new Scanner(archivo); //Si el archivo no existe tira la excepción FileNotFoundException.

        while(sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] partes = linea.split(";");

            if(partes.length != 3) {
                System.out.println("Linea mal formada: " + linea);
                continue;
            }

            try {
                String nombre = partes[0];
                int cantidad = Integer.parseInt(partes[1]);
                double precio = Double.parseDouble(partes[2]);

                agregarProducto(new Producto(nombre, cantidad, precio));

            } catch (NumberFormatException e){
                System.out.println("Error de formato en linea: " + linea);
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Erro al cargar producto: " + e.getMessage());
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
