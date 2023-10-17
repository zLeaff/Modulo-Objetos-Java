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
public class SistemaAnual extends Sistema{
    
    public SistemaAnual(Estacion estacion, int inicial, int consecutivos) {
        super(estacion, inicial, consecutivos);
    }
    
    
    public double calcularPromedio(int i){
        double sumaAnual = 0;
        for(int j=0;j<12;j++){
            sumaAnual += getTemperatura(i, j);
        }
        return sumaAnual/12;
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + "\n";
        for(int i=0;i<getConsecutivos();i++){
            aux += " - Año " + (getInicial()+i) + ": " + calcularPromedio(i) + " °C" + "\n";
        }
        return aux;
    }
}
