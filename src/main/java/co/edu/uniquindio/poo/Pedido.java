package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private List<Producto> productos;
    private List<Cliente> clientes;

    
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.productos = new ArrayList<>();
    }
    
     public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (Producto producto : productos) {
            costoTotal += producto.getPrecio();
        }
        return costoTotal;
    }

}
