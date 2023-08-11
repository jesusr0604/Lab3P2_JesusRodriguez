package lab3p3_jesusrodriguez;

import java.awt.Color;

public class Bus extends Vehiculo {

    private int pasajeros;
    private String TipoBus;


    public Bus() {
        super();
    }

    public Bus(int pasajeros, String TipoBus, String color, String Marca, int año, double precio, int llantas) {
        super(color, Marca, año, precio, llantas);
        this.pasajeros = pasajeros;
        this.TipoBus = TipoBus;
       
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipoBus() {
        return TipoBus;
    }

    public void setTipoBus(String TipoBus) {
        this.TipoBus = TipoBus;
    }

    @Override
    public String toString() {
        return "Marca= " +getMarca()+ ", año="+getAño()+", Color= "+getColor()+ "Precio= "+getPrecio() +"Lps" + "pasajeros=" + pasajeros + ", TipoBus=" + TipoBus + "\n";
    }

  

  
    


    
    
}
