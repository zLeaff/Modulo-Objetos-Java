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
public class SistemaMensual extends Sistema{
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    public SistemaMensual(Estacion estacion, int inicial, int consecutivos) {
        super(estacion, inicial, consecutivos);
    }
    
    
    public double calcularPromedio(int j){
        double sumaMes = 0;
        for(int i=0;i<getConsecutivos();i++){
            sumaMes += getTemperatura(i, j);
        }
        return sumaMes/getConsecutivos();
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + "\n";
        for(int j=0;j<12;j++){
            aux += " - " + meses[j] + ": " + calcularPromedio(j) + " °C" + "\n";
        }   
        return aux;
    }
}

