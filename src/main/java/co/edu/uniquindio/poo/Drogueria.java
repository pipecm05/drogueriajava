package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

public class Drogueria {
    private String nombre;
    private List<Producto> inventario;
    private List<Pedido> pedidos;

    public Drogueria(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }


    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(List<Producto> inventario) {
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
