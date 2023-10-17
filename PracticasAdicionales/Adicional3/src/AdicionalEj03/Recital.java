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
public abstract class Recital {
    private String nombreBanda;
    private int cantidadTemas;
    private int temasAgregados;
    private String [] listaTemas;
    
    public Recital(String nombreBanda, int cantidadTemas){
        setNombreBanda(nombreBanda);
        setCantidad(cantidadTemas);
        temasAgregados = 0;
        listaTemas = new String[cantidadTemas];
    }
    
    public void setNombreBanda(String nombreBanda){
        this.nombreBanda = nombreBanda;
    }
    
    public void setCantidad(int cantidadTemas){
        this.cantidadTemas = cantidadTemas;
    }
    
    public void sumarTema(){
       temasAgregados++;
    }
    
    public void agregarTema(String tema){
        if (getAgregados() < getCantidadTemas()){
            listaTemas[getAgregados()] = tema;
            sumarTema();
        }
        else
            System.out.println("Lista llena.");
    }
    
    public int getAgregados(){
        return temasAgregados;
    }
    
    public int getCantidadTemas(){
        return cantidadTemas;
    }
    
    public String actuar(){
        String aux = "";
        for(int i=0; i<getCantidadTemas(); i++)
            aux += "Ahora tocaremos " + listaTemas[i] + "\n";
        return aux;
    }
    
    public abstract double calcularCosto();
    
}
