
package lab3p3_jesusrodriguez;

import java.util.ArrayList;


public class Concesionaria {
    private String nombre;
    private String id;
    private String direccion;
    private ArrayList<Vehiculo> carros = new ArrayList();
    private ArrayList<Cliente> cliente = new ArrayList();
    private double saldo;

    public Concesionaria() {
    }

    public Concesionaria(String nombre, String id, String direccion, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Vehiculo> carros) {
        this.carros = carros;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", carros=" + carros + ", cliente=" + cliente + ", saldo=" + saldo + "\n";
    }
    
    
}
