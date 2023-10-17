/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author JB
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio, String relleno, String linea){
        super(relleno, linea);
        setRadio(radio);
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double calcularPerimetro(){
        return Math.PI * (getRadio() * 2);
    }
    
    public double calcularArea(){
        return Math.PI * (getRadio() * getRadio());
    }
    
    public String toString(){
        String aux = super.toString() +
                     "Radio: " + getRadio();
        return aux;
    }
}
