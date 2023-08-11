package lab3p3_jesusrodriguez;

import java.awt.Color;

public class Bicicleta extends Vehiculo {

   
    private String Descripcion;
    private double radiorueda;
    private String TipoBike;
   

    public Bicicleta() {
        super();
    }

    public Bicicleta(String Descripcion, double radiorueda, String TipoBike, String color, String Marca, int año, double precio, int llantas) {
        super(color, Marca, año, precio, llantas);
        this.Descripcion = Descripcion;
        this.radiorueda = radiorueda;
        this.TipoBike = TipoBike;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getRadiorueda() {
        return radiorueda;
    }

    public void setRadiorueda(double radiorueda) {
        this.radiorueda = radiorueda;
    }

    public String getTipoBike() {
        return TipoBike;
    }

    public void setTipoBike(String TipoBike) {
        this.TipoBike = TipoBike;
    }

    @Override
    public String toString() {
        return "Marca= " +getMarca()+ ", año="+getAño()+", Color= "+getColor()+ "Precio= "+getPrecio() +"Lps" + ", Descripcion=" + Descripcion + ", radiorueda=" + radiorueda + ", TipoBike=" + TipoBike + "\n";
    }

   

   
  

    

    

    

    

    
    
}
