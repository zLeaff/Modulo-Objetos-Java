/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3.Ej04;

/**
 *
 * @author JB
 */
import PaqueteLectura.GeneradorAleatorio;

public class Habitacion {
    private double precio;
    private boolean ocupada;
    private Cliente cliente;
    
    public Habitacion(){
        ocupada = false;
        precio = (GeneradorAleatorio.generarDouble(6001) + 2000);
    }
    
    public void setPrecio(double valor){
        precio = valor;
    }
    
    public void ocuparHabitacion(Cliente cl){
        cliente = cl;
        ocupada = true;
    }
    
    public void aumentarPrecio(double valor){
        precio += valor;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public boolean getOcupada(){
        return ocupada;
    }
    
    @Override
    public String toString(){
        String aux, aux1;
        if (!ocupada)
            aux1 = "libre";
        else
            aux1 = "ocupada. Cliente: \n" + cliente.toString();
        aux = "$" + precio + ", " + aux1;
        return aux;
    }
}
