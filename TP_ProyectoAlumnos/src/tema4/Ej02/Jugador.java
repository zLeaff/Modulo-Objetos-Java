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
public class Jugador extends Empleado {
    private int partidosJugados;
    private int goles;
    
    public Jugador (int partidosJugados, int goles, String nombre, double sueldo, int antiguedad){
        super(nombre, sueldo, antiguedad);
        setPartidos(partidosJugados);
        setGoles(goles);
    }
    
    public void setPartidos(int partidos){
        partidosJugados = partidos;
    }
    
    public void setGoles(int goles){
        this.goles = goles;
    }
    
    public int getPartidos(){
        return partidosJugados;
    }
    
    public int getGoles(){
        return goles;
    }
    
    public double calcularEfectividad(){
        double prom = (double)goles/partidosJugados;
        return prom;
    }
    
    public double calcularSueldoACobrar(){
        double aCobrar;
        double prom = calcularEfectividad();
        if (prom > 0.5)
            return super.getSueldo() + getSueldo();
        else
            return getSueldo();
    }
}
