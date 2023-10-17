/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ej03;

/**
 *
 * @author JB
 */
public class Trabajador extends Persona{
    String trabajo;
    
    public Trabajador(String nombre, int DNI, int edad, String trabajo){
        super(nombre, DNI, edad);
        setTrabajo(trabajo);
    }
    
    public void setTrabajo(String trabajo){
        this.trabajo = trabajo;
    }
    
    public String getTrabajo(){
        return trabajo;
    }
    
    @Override
    public String toString(){
        String aux = super.toString() +  
                    " Soy " + getTrabajo();
        return aux;
    }
}
