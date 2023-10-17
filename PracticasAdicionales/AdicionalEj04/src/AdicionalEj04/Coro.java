/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj04;

/**
 *
 * @author JB
 */
public abstract class Coro {
    private String nombreCoro;
    private Director director;
    private int dim, agregados;
    
    public Coro(String nombreCoro, Director director, int dim){
        setNombreCoro(nombreCoro);
        setDirector(director);
        setDim(dim);
        setAgregados();
    }
    
    public void setNombreCoro(String nombreCoro){
        this.nombreCoro = nombreCoro;
    }
    
    public void setDirector(Director director){
        this.director = director;
    }
    
    public void setDim(int dim){
        this.dim = dim;
    }
    
    public void setAgregados(){
        agregados = 0;
    }
    
    public int getAgregados(){
        return agregados;
    }
    
    public void sumarAgregados(){
        agregados++;
    }
    
    public String getNombreCoro(){
        return nombreCoro;
    }
    
    public Director getDirector(){
        return director;
    }
    
    public int getDim(){
        return dim;
    }
    
    public String toString(){
        String aux = "Coro " + getNombreCoro() + "\n";
        return aux;
    }
    
    public abstract void agregarCorista(Corista corista);
    public abstract boolean bienFormado();        
    public abstract boolean estaLleno();
}
