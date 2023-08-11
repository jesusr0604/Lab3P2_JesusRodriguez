
package lab3p3_jesusrodriguez;

import java.awt.Color;


public class Vehiculo {
    private String color;
    private String Marca;
    private int año;
    private double precio;
    private int llantas;

    public Vehiculo(String color, String Marca, int año, double precio, int llantas) {
        this.color = color;
        this.Marca = Marca;
        this.año = año;
        this.precio = precio;
        this.llantas = llantas;
    }

    public Vehiculo() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", Marca=" + Marca + ", a\u00f1o=" + año + ", precio=" + precio + ", llantas=" + llantas + '}';
    }
    
}
