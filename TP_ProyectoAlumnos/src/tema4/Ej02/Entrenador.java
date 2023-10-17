/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ej02;

/**
 *
 * @author JB
 */
public class Entrenador extends Empleado{
    private int campeonatos;
    
    public Entrenador(int campeonatos, String nombre, double sueldo, int antiguedad){
        super(nombre, sueldo, antiguedad);
        setCampeonatos(campeonatos);
    }
    
    public void setCampeonatos(int campeonatos){
        this.campeonatos = campeonatos;
    }
    
    public int getCampeonatos(){
        return campeonatos;
    }
    
    public double calcularSueldoACobrar(){
        if(getCampeonatos() >= 1 && getCampeonatos() <= 4){
            return getSueldo() + 5000;
        }
        else if(getCampeonatos() > 4 && getCampeonatos() <= 10){
            return getSueldo() + 30000;
        }
        else if(getCampeonatos() > 10)
            return getSueldo() + 50000;
        else
            return getSueldo();
    }
    
    public double calcularEfectividad(){
        return (double)getCampeonatos()/getAntiguedad();
    }
}
