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
public class Antiguedad  {
    private IEstado estado;

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public Antiguedad (IEstado estado) {
        this.estado = estado;
    }
   String Nombre;
   String Mes;
   double SueldoBasico;

    public Antiguedad(String Nombre, String Mes, double precioBase) {
        this.Nombre = Nombre;
        this.Mes = Mes;
        this.SueldoBasico = SueldoBasico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public double getSueldoBasico() {
        return SueldoBasico;
    }

    public void setSueldoBasico(double precioBase) {
        this.SueldoBasico = SueldoBasico;
    }
   
    void CalcularPrecios(double SueldoBasico){
    
       estado.CalcularPrecio(SueldoBasico);
       
    }
    void NombreAntiguedad(String Nombre, String Mes){
    
        System.out.println(""+Nombre+Mes);
    }
}
