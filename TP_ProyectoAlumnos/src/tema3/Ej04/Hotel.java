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
public class Hotel {
    private int habitaciones;
    private Habitacion[] vectorHabitaciones;
    
    public Hotel(int habitaciones){
        this.habitaciones = habitaciones;
        vectorHabitaciones = new Habitacion[habitaciones];
        for (int i = 0; i < habitaciones; i++) {
            vectorHabitaciones[i] = new Habitacion();
        }
    }
    
    public void setHabitaciones(int cantidad){
        habitaciones = cantidad;
    }
    
    public void ingresarCliente(Cliente cl, int n){
        vectorHabitaciones[n].ocuparHabitacion(cl);
    }
    
    public Habitacion[] getVector(){
        return vectorHabitaciones;
    }
    
    
    public int getHabitaciones(){
        return habitaciones;
    }
    
    public void obtenerInfo(){
        for(int i=0;i<habitaciones;i++){
            String aux;
            aux = "Habitacion " + (i+1) + ". ";
            aux+= vectorHabitaciones[i].toString();
            System.out.println(aux);
            System.out.println("     ---     ");
        }        
    }
   
    
}
