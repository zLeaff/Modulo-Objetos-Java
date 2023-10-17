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
public class Director extends Miembro {
    private int antiguedad;
    
    public Director(String nombre, int DNI, int edad, int antiguedad){
        super(nombre, DNI, edad);
        setAntiguedad(antiguedad);
    }
    
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public String toString(){
        String aux = "Director " + 
                     super.toString() +
                     " - Años de antiguedad: " + getAntiguedad() + "\n";
        return aux;
    }
}
