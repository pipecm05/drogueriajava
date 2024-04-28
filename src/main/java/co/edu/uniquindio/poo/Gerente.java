package co.edu.uniquindio.poo;

public class Gerente extends Empleado {
    public Gerente(String nombre, String apellidos, String dni, String direccion, String telefono, String cargo, double salario) {
        super(nombre, apellidos, dni, direccion, telefono, cargo, salario);
    }

    public void agregarProducto(Producto producto) {
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void eliminarProducto(Producto producto) {
        System.out.println("Producto eliminado: " + producto.getNombre());
    }
}
