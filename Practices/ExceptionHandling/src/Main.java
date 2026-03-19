import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String rutaArchivo = "producto.txt";
        Producto producto1 = new Producto("Vaso", 10, 5);
        Producto producto2 = new Producto("Plato", 18, 2);
        Producto producto3 = new Producto("Tenedor", 3, 9);

        ProductoManager productoManager = new ProductoManager();
        ArchivoManager archivoManager = new ArchivoManager(rutaArchivo);

        archivoManager.agregarProducto(producto1);
        archivoManager.agregarProducto(producto2);

        try {
            productoManager.agregarProducto(producto1);
            productoManager.agregarProducto(producto2);
            productoManager.agregarProducto(producto3);
        } catch (NombreProductoInvalidoException | ProductoDuplicadoException e) {
            System.out.println("Error al agregar el producto: " + e.getMessage());
            e.printStackTrace();

        } catch (IllegalArgumentException e) {
            System.out.println("Error de argumento: " + e.getMessage());
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Proceso finalizado.");
        }
    }
}