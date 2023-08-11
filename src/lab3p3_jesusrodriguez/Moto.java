package lab3p3_jesusrodriguez;

import java.awt.Color;

public class Moto extends Vehiculo {

    private double Desplazamiento;
    private String Tipomotor;
   

    public Moto() {
        super();
    }

    public Moto(double Desplazamiento, String Tipomotor, String color, String Marca, int año, double precio, int llantas) {
        super(color, Marca, año, precio, llantas);
        this.Desplazamiento = Desplazamiento;
        this.Tipomotor = Tipomotor;
    }

    public double getDesplazamiento() {
        return Desplazamiento;
    }

    public void setDesplazamiento(double Desplazamiento) {
        this.Desplazamiento = Desplazamiento;
    }

    public String getTipomotor() {
        return Tipomotor;
    }

    public void setTipomotor(String Tipomotor) {
        this.Tipomotor = Tipomotor;
    }

    @Override
    public String toString() {
        return "Marca= " +getMarca()+ ", año="+getAño()+", Color= "+getColor()+ "Precio= "+getPrecio() +"Lps"+ ", Desplazamiento=" + Desplazamiento + ", Tipomotor=" + Tipomotor + "\n";
    }

  

    

    

    

    

    
    
}
