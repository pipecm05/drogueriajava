package co.edu.uniquindio.poo;

public class Empleado extends Persona  {
    private Double salario;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, String cargo, double salario) {
        super(nombre, apellidos, dni, direccion, telefono);
        this.salario = salario;
    }
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}