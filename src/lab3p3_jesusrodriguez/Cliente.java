package lab3p3_jesusrodriguez;

import java.util.ArrayList;

public class Cliente {
     private String id;
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    private double saldoDisponible;

    public Cliente(String id, String nombre, double saldoDisponible) {
        this.id = id;
        this.nombre = nombre;
        
        this.saldoDisponible = saldoDisponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }



     public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }


    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", vehiculos=" + vehiculos + ", saldoDisponible=" + saldoDisponible + "\n";
    }

    

}
