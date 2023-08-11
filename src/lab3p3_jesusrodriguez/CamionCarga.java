package lab3p3_jesusrodriguez;

import java.awt.Color;

public class CamionCarga extends Vehiculo {

    private double Altura;
    private boolean retroex;
    private double MaxCarga;

    public CamionCarga() {
        super();
    }

    public CamionCarga(double Altura, boolean retroex, double MaxCarga, String color, String Marca, int año, double precio, int llantas) {
        super(color, Marca, año, precio, llantas);
        this.Altura = Altura;
        this.retroex = retroex;
        this.MaxCarga = MaxCarga;
    }

    
    
    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public boolean isRetroex() {
        return retroex;
    }

    public void setRetroex(boolean retroex) {
        this.retroex = retroex;
    }

    public double getMaxCarga() {
        return MaxCarga;
    }

    public void setMaxCarga(double MaxCarga) {
        this.MaxCarga = MaxCarga;
    }

    @Override
    public String toString() {
        return "Marca= " +getMarca()+ ", año="+getAño()+", Color= "+getColor()+ "Precio= "+getPrecio() +"Lps" + ",Altura=" + Altura + ", retroex=" + retroex + ", MaxCarga=" + MaxCarga + "\n";
    }

    

    

    

    
    
}
