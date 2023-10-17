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
public class CoroSemicircular extends Coro{
    private Corista [] posiciones;

    
    public CoroSemicircular(String nombre, Director director, int dim){
        super(nombre, director, dim);
        posiciones = new Corista[dim];
    }
    
    public void agregarCorista(Corista corista){
        if(getAgregados() < getDim()){
            posiciones[getAgregados()] = corista;
            sumarAgregados();
        } else {
            System.out.println("Coro lleno.");
        }
    }
    
    public boolean bienFormado(){
        for(int i=0;i<getDim()-1;i++){
            if(posiciones[i].getTono() < posiciones[i+1].getTono())
                return false;
        }
        return true;
    }
    
    public boolean estaLleno(){
        return getAgregados() == getDim();
    }
    

}
