/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ej06;

/**
 *
 * @author JB
 */
import PaqueteLectura.GeneradorAleatorio;

public abstract class Sistema{
    private int inicial;
    private int consecutivos;
    private Estacion estacion;
    private double[][] temperaturas;
    
    public Sistema(Estacion estacion, int inicial, int consecutivos){
        this.estacion = estacion;
        setInicial(inicial);
        setConsecutivos(consecutivos);
        temperaturas = new double[getConsecutivos()][12];
        
        GeneradorAleatorio.iniciar();
        for(int i=0;i<getConsecutivos();i++){
            for(int j=0;j<12;j++){
                temperaturas[i][j] = GeneradorAleatorio.generarDouble(20) + 15;
            }
        }
    }
    
    public void setInicial(int inicial){
        this.inicial = inicial;
    }
    
    public void setConsecutivos(int cons){
        consecutivos = cons;
    }
    
    public void setTemperatura(int a, int mes, double temp){
        temperaturas[a][mes] = temp;
    }
    
    public int getInicial(){
        return inicial;
    }
    
    public int getConsecutivos(){
        return consecutivos;
    }
    
    
    public double getTemperatura(int a, int mes){
        return temperaturas[a][mes];
    }
    
    public double getTemperaturaMax(){
        double max = -1;
        for(int i=0;i<getConsecutivos();i++){
            for(int j=0;j<12;j++)
                if (temperaturas[i][j] > max)
                    max = temperaturas[i][j];
        }
        return max;
    }
    
    public String toString(){
        String aux = estacion.toString();
        return aux;
    }
    
    public abstract double calcularPromedio(int x);
    
}
