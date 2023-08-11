package lab3p3_jesusrodriguez;

import java.awt.Color;

public class Carro_1 extends Vehiculo {

    private int puertas;
    private String Motor;
    private double VelMax;

    public Carro_1() {
        super();
    }

    public Carro_1(int puertas, String Motor, double VelMax, String color, String Marca, int año, double precio, int llantas) {
        super(color, Marca, año, precio, llantas);
        this.puertas = puertas;
        this.Motor = Motor;
        this.VelMax = VelMax;
    }


    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public double getVelMax() {
        return VelMax;
    }

    public void setVelMax(double VelMax) {
        this.VelMax = VelMax;
    }

    @Override
    public String toString() {
        return "Marca= " +getMarca()+ ", año="+getAño()+", Color= "+getColor()+ "Precio= "+getPrecio() +"Lps"+" ,puertas=" + puertas + ", Motor=" + Motor + ", VelMax=" + VelMax + "\n";
    }

    
    
}
