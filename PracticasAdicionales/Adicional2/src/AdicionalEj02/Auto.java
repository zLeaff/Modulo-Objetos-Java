/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj02;

/**
 *
 * @author JB
 */
public class Auto {
    private String nombreD;
    private String patente;
    
    public Auto(String nombreD, String patente){
        setNombre(nombreD);
        setPatente(patente);
    }
    
    public void setNombre(String nombreD){
        this.nombreD = nombreD;
    }
    
    public void setPatente(String patente){
        this.patente = patente;
    }
    
    public String getNombre(){
        return nombreD;
    }
    
    public String getPatente(){
        return patente;
    }
    
    public String toString(){
        String aux = "Propietario: " + getNombre() + " Patente: " + getPatente();
        return aux;
    }
}
