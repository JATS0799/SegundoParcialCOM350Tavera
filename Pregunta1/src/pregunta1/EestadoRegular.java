/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

/**
 *
 * @author Javier Tavera
 */
public class EestadoRegular implements IEstado{
     double Precio;

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public EestadoRegular(double Precio) {
        this.Precio = Precio;
    }
    @Override
    public void CalcularPrecio(double Precio) {
        
       double NuevoPrecio=Precio+Precio*0.1;
       System.out.println("El Bono de antiguedad Estado Regular:"+NuevoPrecio);
    }
}
