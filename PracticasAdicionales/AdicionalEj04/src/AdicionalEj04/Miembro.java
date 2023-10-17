/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj04;

/**
 *
 * @author JB
 */
public abstract class Miembro {
    private String nombre;
    private int DNI;
    private int edad;
    
    public Miembro(String nombre, int DNI, int edad){
        setNombre(nombre);
        setDni(DNI);
        setEdad(edad);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 
    
    public void setDni(int DNI){
        this.DNI = DNI;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDNI(){
        return DNI;
    }
    
    public int getEdad(){
        return edad;
    }

    public String toString(){
        String aux = getNombre() + "\n" +
                     " - Edad: " + getEdad() + "\n" +
                     " - DNI: " + getDNI() + "\n";
        return aux;
    }
    
}
