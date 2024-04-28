package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Pedido> pedidos;

    // Constructor de la clase Cliente
    public Cliente(String nombre, String apellidos, String dni, String direccion, String telefono) {
        super(nombre, apellidos, dni, direccion, telefono);
        this.pedidos = new ArrayList<>();
    }

    // Métodos getter y setter para la lista de pedidos
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    // Método para agregar un pedido a la lista de pedidos del cliente
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}