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
public class Corista extends Miembro{
    private int tonoFund;
    
    public Corista (String nombre, int DNI, int edad, int tonoFund){
        super(nombre, DNI, edad);
        setTono(tonoFund);
    }
    
    public void setTono(int tonoFund){
        this.tonoFund = tonoFund;
    }
    
    public int getTono(){
        return tonoFund;
    }
    
    public String toString(){
        String aux = "Corista " +
                      super.toString() +
                      "Tono fundamental: " + getTono() + "\n";
        return aux;
    }
}
