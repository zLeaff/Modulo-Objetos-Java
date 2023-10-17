/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj03;

/**
 *
 * @author JB
 */
public class Fecha {
    private String ciudad;
    private int dia;
    
    public Fecha(String ciudad, int dia){
        setCiudad(ciudad);
        setDia(dia);
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public int getDia(){
        return dia;
    }
    
    public String getCiudad(){
        return ciudad;
    }
}
